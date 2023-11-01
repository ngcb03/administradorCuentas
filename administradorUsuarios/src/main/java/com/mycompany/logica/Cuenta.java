package com.mycompany.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cuenta implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Basic
    private String usuario;
    private String contrasenia;
    private boolean habilitado;
    
    /*
        @JoinColumn(name="")
            1. Se indica por cual culumna se va a mapear la información
            2. Osea, indicar cual columna se va a utilizar la foreign key
            3. No es obligatorio
    
        Nota: El nombre debe ser distinto a cualquien otro atributo de esta clase,
            esto se debe a que se creará una clase con este mismo nombre y haría
            conflicto con uno ya definido ej:
            
            @Id
            @GeneratedValue (strategy = GenerationType.SEQUENCE)
            private int id;
    
            y 
            
            // @JoinColumn(name="id")
            
    */
    
    @ManyToOne
    @JoinColumn(name="FK_ROL")
    private Rol rol;    

    @Override
    public String toString() {
        return "Cuenta{" + "id=" + id + ", usuario=" + usuario + ", contrasenia=" + contrasenia + ", habilitado=" + habilitado + ", rol=" + rol + '}';
    }
    
    public Cuenta() {
    }

    public Cuenta(int id, String usuario, String contrasenia, boolean habilitado, Rol rol) {
        this.id = id;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.habilitado = habilitado;
        this.rol = rol;
    }    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
}
