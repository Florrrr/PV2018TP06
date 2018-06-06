/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos;

import aplicacion.dominio.Electrodomestico;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author CX
 */
public class ListaElectrodomestico implements Serializable{
    private ArrayList<Electrodomestico> listaElectrodomestico;

    public ListaElectrodomestico() {
        listaElectrodomestico=new ArrayList();
    }

    public ListaElectrodomestico(ArrayList<Electrodomestico> listaElectrodomestico) {
        this.listaElectrodomestico = listaElectrodomestico;
    }
    
    public ArrayList<Electrodomestico> agregarElectrodomesticos(Electrodomestico unElectrodomestico){
        getListaElectrodomestico().add(unElectrodomestico);
        return getListaElectrodomestico();
    }
    
    public ArrayList<Electrodomestico> modificarElectrodomestico(Electrodomestico unElectrodomestico){
        for(Electrodomestico e:listaElectrodomestico){
            if(e.getCodigo().equals(unElectrodomestico.getCodigo())){
                if(unElectrodomestico.getStock()==0){
                    unElectrodomestico.setDisponible("No");
                    listaElectrodomestico.set(listaElectrodomestico.indexOf(e), unElectrodomestico);
                }
                else{
                    listaElectrodomestico.set(listaElectrodomestico.indexOf(e), unElectrodomestico);                  
                }
                break;
            }
        }
        return listaElectrodomestico;
    }

    public ArrayList<Electrodomestico> eliminarElectrodomestico(Electrodomestico unElectrodomestico){
        for(Electrodomestico e:listaElectrodomestico){
            if(e.getCodigo().equals(unElectrodomestico.getCodigo())){
                listaElectrodomestico.remove(listaElectrodomestico.indexOf(e));
                break;
            }
        }
        return listaElectrodomestico;
    }    
    /**
     * @return the listaElectrodomestico
     */
    public ArrayList<Electrodomestico> getListaElectrodomestico() {
        return listaElectrodomestico;
    }

    /**
     * @param listaElectrodomestico the listaElectrodomestico to set
     */
    public void setListaElectrodomestico(ArrayList<Electrodomestico> listaElectrodomestico) {
        this.listaElectrodomestico = listaElectrodomestico;
    }
    
}
