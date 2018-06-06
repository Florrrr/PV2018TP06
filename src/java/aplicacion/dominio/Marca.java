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
public class Marca implements Serializable{
    private String cod;
    private String nombre;

    public Marca() {
    }

    public Marca(String cod, String nombre) {
        this.cod = cod;
        this.nombre = nombre;
    }
    
    @Override
    public int hashCode(){
        return(cod!=null)? (this.getClass().hashCode()+cod.hashCode()):super.hashCode();
    }
    
    @Override
    public String toString(){
        return String.format("%s",nombre);
    }

    /**
     * @return the cod
     */
    public String getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(String cod) {
        this.cod = cod;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
