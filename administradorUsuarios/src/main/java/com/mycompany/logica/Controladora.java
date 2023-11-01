package com.mycompany.logica;

import com.mycompany.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    private static Controladora control = null;
    private static ControladoraPersistencia controlPersis = ControladoraPersistencia.getInstance();
    private static int idIncrUsuario = 0;
    private static int idIncrRol = 0;
    private static Cuenta cuenta;
    private static Rol rol;

    private Controladora() {
    }

    public static Controladora getInstance(){
        if (Controladora.control == null){
            return Controladora.control = new Controladora();
        } return Controladora.control;
    }

    public void crearCuenta(String usuario, String contrasenia, String rol) {
        
        /*
        Usamos constructor vacío puesto que no tenemos todos los parametros
        */
        
        Controladora.rol = this.rolEncontrado(rol);
        
        if(Controladora.rol != null){
            Controladora.cuenta = new Cuenta();
            Controladora.cuenta.setId(idIncrUsuario);
            Controladora.cuenta.setUsuario(usuario);
            Controladora.cuenta.setContrasenia(contrasenia);
            Controladora.cuenta.setHabilitado(true);
            Controladora.cuenta.setRol(Controladora.rol);
            
            controlPersis.crearCuenta(Controladora.cuenta);

            Controladora.idIncrUsuario++;
            Controladora.idIncrRol++;
        }
        
    }
    
    private Rol rolEncontrado(String rol){
        List<Rol> listaRoles = control.traerRoles();
        for(Rol rolI: listaRoles){
            if(rolI.getRol().equals(rol)){
                return rolI;
            }
        } return null;
    }

    public byte validarCredencialesUsuario(String usuario, String contrasenia, String rol) {
        
        // traemos todas las cuentas
        List<Cuenta> listaCuentas = Controladora.controlPersis.traerCuentas();
        
        // validamos usuario, contraseña y si está habilitado
        for(Cuenta cuenta: listaCuentas){
            
            // verificar usuario
            if(cuenta.getUsuario().equals(usuario) && 
                cuenta.getContrasenia().equals(contrasenia) &&
                cuenta.getRol().getRol().equals(rol)){
                if(cuenta.isHabilitado()){
                    return 1;
                } else{ return (-1); }

            }
            
        } return 0;
        
    }

    public boolean validarExistenciaUsuario(String usuario, String contrasenia) {
        
         // traemos todas las cuentas
        List<Cuenta> listaCuentas = Controladora.controlPersis.traerCuentas();
        
        // validamos usuario
        for(Cuenta cuenta: listaCuentas){
            
            // verificar usuario
            if(cuenta.getUsuario().equals(usuario) && 
                    cuenta.getContrasenia().equals(contrasenia)){
                return true;
                
            }    
                
        }
        
        return false;
        
    }

    public void actualizarCuenta(int num_cuenta, String usuario, String contraseniaNueva, String rol) {
        
        /*
        Usamos constructor vacío puesto que no tenemos todos los parametros
        */
        
        Controladora.rol = this.rolEncontrado(rol);
        
        if(Controladora.rol != null){
            Controladora.cuenta = new Cuenta();
            Controladora.cuenta.setId(num_cuenta);
            Controladora.cuenta.setUsuario(usuario);
            Controladora.cuenta.setContrasenia(contraseniaNueva);
            Controladora.cuenta.setHabilitado(true);
            Controladora.cuenta.setRol(Controladora.rol);
            
            controlPersis.actualizarCuenta(Controladora.cuenta);
        }
        
    }
    
    public void actualizarEstadoCuenta(int num_cuenta, boolean estado_cuenta){
        
        List<Cuenta> listaCuentas = Controladora.controlPersis.traerCuentas();
        
        for(Cuenta cuentaI: listaCuentas){
            
            if(cuentaI.getId() == num_cuenta){
                cuentaI.setHabilitado(estado_cuenta);
                controlPersis.actualizarCuenta(cuentaI);
                break;
                
            }    
                
        }
    }

    public List<Cuenta> traerCuentas() {
        return controlPersis.traerCuentas();
    }

    public List<Rol> traerRoles() {
        return controlPersis.traerRoles();
    }

    public void eliminarCuenta(int num_cuenta) {
        controlPersis.eliminarCuenta(num_cuenta);
    }

    public Cuenta traerCuenta(int num_cuenta) {
        return Controladora.controlPersis.traerCuenta(num_cuenta);
    }

    public void actualizarContrasenia(int num_cuenta, String usuario, String passActual, String passNueva) {
        
    }
    
}
