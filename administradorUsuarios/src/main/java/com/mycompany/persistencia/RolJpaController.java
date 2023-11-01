/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.logica.Cuenta;
import com.mycompany.logica.Rol;
import com.mycompany.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author NGCB03
 */
public class RolJpaController implements Serializable {

    public RolJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    private static RolJpaController rolJpa = null;
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    private RolJpaController() {
        emf = Persistence.createEntityManagerFactory("LoginPU");
    }
    
    public static RolJpaController getInstance(){
        if(rolJpa == null){
            return rolJpa = new RolJpaController();
        } return rolJpa;
    }

    public void create(Rol rol) {
        if (rol.getListaCuentas() == null) {
            rol.setListaCuentas(new ArrayList<Cuenta>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Cuenta> attachedListaCuentas = new ArrayList<Cuenta>();
            for (Cuenta listaCuentasCuentaToAttach : rol.getListaCuentas()) {
                listaCuentasCuentaToAttach = em.getReference(listaCuentasCuentaToAttach.getClass(), listaCuentasCuentaToAttach.getId());
                attachedListaCuentas.add(listaCuentasCuentaToAttach);
            }
            rol.setListaCuentas(attachedListaCuentas);
            em.persist(rol);
            for (Cuenta listaCuentasCuenta : rol.getListaCuentas()) {
                Rol oldRolOfListaCuentasCuenta = listaCuentasCuenta.getRol();
                listaCuentasCuenta.setRol(rol);
                listaCuentasCuenta = em.merge(listaCuentasCuenta);
                if (oldRolOfListaCuentasCuenta != null) {
                    oldRolOfListaCuentasCuenta.getListaCuentas().remove(listaCuentasCuenta);
                    oldRolOfListaCuentasCuenta = em.merge(oldRolOfListaCuentasCuenta);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Rol rol) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Rol persistentRol = em.find(Rol.class, rol.getId());
            List<Cuenta> listaCuentasOld = persistentRol.getListaCuentas();
            List<Cuenta> listaCuentasNew = rol.getListaCuentas();
            List<Cuenta> attachedListaCuentasNew = new ArrayList<Cuenta>();
            for (Cuenta listaCuentasNewCuentaToAttach : listaCuentasNew) {
                listaCuentasNewCuentaToAttach = em.getReference(listaCuentasNewCuentaToAttach.getClass(), listaCuentasNewCuentaToAttach.getId());
                attachedListaCuentasNew.add(listaCuentasNewCuentaToAttach);
            }
            listaCuentasNew = attachedListaCuentasNew;
            rol.setListaCuentas(listaCuentasNew);
            rol = em.merge(rol);
            for (Cuenta listaCuentasOldCuenta : listaCuentasOld) {
                if (!listaCuentasNew.contains(listaCuentasOldCuenta)) {
                    listaCuentasOldCuenta.setRol(null);
                    listaCuentasOldCuenta = em.merge(listaCuentasOldCuenta);
                }
            }
            for (Cuenta listaCuentasNewCuenta : listaCuentasNew) {
                if (!listaCuentasOld.contains(listaCuentasNewCuenta)) {
                    Rol oldRolOfListaCuentasNewCuenta = listaCuentasNewCuenta.getRol();
                    listaCuentasNewCuenta.setRol(rol);
                    listaCuentasNewCuenta = em.merge(listaCuentasNewCuenta);
                    if (oldRolOfListaCuentasNewCuenta != null && !oldRolOfListaCuentasNewCuenta.equals(rol)) {
                        oldRolOfListaCuentasNewCuenta.getListaCuentas().remove(listaCuentasNewCuenta);
                        oldRolOfListaCuentasNewCuenta = em.merge(oldRolOfListaCuentasNewCuenta);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = rol.getId();
                if (findRol(id) == null) {
                    throw new NonexistentEntityException("The rol with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Rol rol;
            try {
                rol = em.getReference(Rol.class, id);
                rol.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The rol with id " + id + " no longer exists.", enfe);
            }
            List<Cuenta> listaCuentas = rol.getListaCuentas();
            for (Cuenta listaCuentasCuenta : listaCuentas) {
                listaCuentasCuenta.setRol(null);
                listaCuentasCuenta = em.merge(listaCuentasCuenta);
            }
            em.remove(rol);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Rol> findRolEntities() {
        return findRolEntities(true, -1, -1);
    }

    public List<Rol> findRolEntities(int maxResults, int firstResult) {
        return findRolEntities(false, maxResults, firstResult);
    }

    private List<Rol> findRolEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Rol.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Rol findRol(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Rol.class, id);
        } finally {
            em.close();
        }
    }

    public int getRolCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Rol> rt = cq.from(Rol.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
