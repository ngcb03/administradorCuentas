package com.mycompany.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Rol implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Basic
    private String rol;
    
    @OneToMany (mappedBy = "rol")
    private List<Cuenta> listaCuentas;

    @Override
    public String toString() {
        return "Rol{" + "id=" + id + ", rol=" + rol + ", listaCuentas=" + listaCuentas + '}';
    }
    
    public Rol() {
    }

    public Rol(int id, String rol, List<Cuenta> listaCuentas) {
        this.id = id;
        this.rol = rol;
        this.listaCuentas = listaCuentas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public List<Cuenta> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(List<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }
    
}
