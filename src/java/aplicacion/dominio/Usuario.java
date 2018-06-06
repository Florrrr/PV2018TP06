/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dominio;

import java.io.Serializable;

/**
 *
 * @author CX
 */
public class Usuario implements Serializable{
    private String usario;
    private String contraseña;

    public Usuario() {
    }

    public Usuario(String usario, String contraseña) {
        this.usario = usario;
        this.contraseña = contraseña;
    }

    /**
     * @return the usario
     */
    public String getUsario() {
        return usario;
    }

    /**
     * @param usario the usario to set
     */
    public void setUsario(String usario) {
        this.usario = usario;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
