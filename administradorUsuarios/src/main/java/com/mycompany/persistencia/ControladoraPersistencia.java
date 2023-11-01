package com.mycompany.persistencia;

import com.mycompany.logica.Cuenta;
import com.mycompany.logica.Rol;
import com.mycompany.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    private static ControladoraPersistencia controlPersis = null;
    private static final CuentaJpaController cuentaJpa = CuentaJpaController.getInstance();
    private static final RolJpaController rolJpa = RolJpaController.getInstance();
    
    private ControladoraPersistencia() {
    }
    
    public static ControladoraPersistencia getInstance() {
        if (controlPersis == null){
            return controlPersis = new ControladoraPersistencia();
        } return controlPersis;
    }

    public void crearCuenta(Cuenta cuenta) {
        ControladoraPersistencia.cuentaJpa.create(cuenta);
    }

    public List<Cuenta> traerCuentas() {
        return cuentaJpa.findCuentaEntities();
    }

    public void actualizarCuenta(Cuenta cuenta) {
        try {
            cuentaJpa.edit(cuenta);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Rol> traerRoles() {
        return rolJpa.findRolEntities();
    }

    public void eliminarCuenta(int num_cuenta) {
        try {
            cuentaJpa.destroy(num_cuenta);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cuenta traerCuenta(int num_cuenta) {
        return cuentaJpa.findCuenta(num_cuenta);
    }
    
}
