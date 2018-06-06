/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos;

import aplicacion.dominio.Marca;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author CX
 */
public class ListaMarcas implements Serializable{
    private ArrayList<Marca> listaMarca;

    public ListaMarcas() {
        listaMarca=new ArrayList();
    }

    public ListaMarcas(ArrayList<Marca> listaMarca) {
        this.listaMarca = listaMarca;
    }

    /**
     * @return the listaMarca
     */
    public ArrayList<Marca> getListaMarca() {
        return listaMarca;
    }

    /**
     * @param listaMarca the listaMarca to set
     */
    public void setListaMarca(ArrayList<Marca> listaMarca) {
        this.listaMarca = listaMarca;
    }
    
}
