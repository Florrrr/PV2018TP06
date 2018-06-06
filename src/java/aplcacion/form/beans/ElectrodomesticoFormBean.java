/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplcacion.form.beans;

import aplicacion.datos.ListaElectrodomestico;
import aplicacion.datos.ListaMarcas;
import aplicacion.dominio.Electrodomestico;
import aplicacion.dominio.Marca;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseId;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author CX
 */
@ManagedBean
@ViewScoped
public class ElectrodomesticoFormBean implements Serializable{
    private String cod;
    private String tips;
    private Marca marca;
    private ListaElectrodomestico listadoElectrodomestico;
    private Electrodomestico unElectrodomestico;
    private ArrayList<Electrodomestico> listaAux;
    private ListaMarcas listadoMarcas;
    private Date fecha;
    private transient UploadedFile file=null;
    private byte[] imagen;
    private byte[] nuevaImagen;
    private String disponible;
    private String modelo;
    private double prec;
    private int stock;

    /**
     * Creates a new instance of ElectrodomesticoFormBean
     */
    public ElectrodomesticoFormBean() {
        listadoElectrodomestico=new ListaElectrodomestico();
        listaAux=new ArrayList();
        listadoMarcas=new ListaMarcas();
        listadoMarcas.getListaMarca().add(new Marca("K123","Drean"));
        listadoMarcas.getListaMarca().add(new Marca("K321","Wirpool"));
        listadoMarcas.getListaMarca().add(new Marca("K982","Samsung"));
        listadoMarcas.getListaMarca().add(new Marca("K289","Koinor"));
        listadoMarcas.getListaMarca().add(new Marca("K951","Philips"));
    }
    
    public void agregarElectrodomestico(){
        if(getStock()>0){
            setDisponible("Si");
        }
        else{
            setDisponible("No");
        }
        setUnElectrodomestico(new Electrodomestico(getCod(), getTips(), getMarca(),getFecha(),getStock(),getImagen(),getDisponible(),getModelo(),getPrec()));
        setListaAux(getListadoElectrodomestico().agregarElectrodomesticos(getUnElectrodomestico()));
    }
    
    public void establecerElectrodomestico(Electrodomestico unElectrodomestico){
        setUnElectrodomestico(unElectrodomestico);
    }
    
    public void modificarElectrodomestico(){
        setListaAux(listadoElectrodomestico.modificarElectrodomestico(unElectrodomestico));
    }
    
    public void eliminarElectrodomestico(){
        setListaAux(listadoElectrodomestico.eliminarElectrodomestico(unElectrodomestico));

    }
    
    public void limpiarLista(){
        listaAux=new ArrayList();
        listadoElectrodomestico=new ListaElectrodomestico();
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
     * @return the tips
     */
    public String getTips() {
        return tips;
    }

    /**
     * @param tips the tips to set
     */
    public void setTips(String tips) {
        this.tips = tips;
    }


    /**
     * @return the listadoElectrodomestico
     */
    public ListaElectrodomestico getListadoElectrodomestico() {
        return listadoElectrodomestico;
    }

    /**
     * @param listadoElectrodomestico the listadoElectrodomestico to set
     */
    public void setListadoElectrodomestico(ListaElectrodomestico listadoElectrodomestico) {
        this.listadoElectrodomestico = listadoElectrodomestico;
    }

    /**
     * @return the unElectrodomestico
     */
    public Electrodomestico getUnElectrodomestico() {
        return unElectrodomestico;
    }

    /**
     * @param unElectrodomestico the unElectrodomestico to set
     */
    public void setUnElectrodomestico(Electrodomestico unElectrodomestico) {
        this.unElectrodomestico = unElectrodomestico;
    }

    /**
     * @return the listaAux
     */
    public ArrayList<Electrodomestico> getListaAux() {
        return listaAux;
    }

    /**
     * @param listaAux the listaAux to set
     */
    public void setListaAux(ArrayList<Electrodomestico> listaAux) {
        this.listaAux = listaAux;
    }

    /**
     * @return the marca
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    /**
     * @return the listadoMarcas
     */
    public ListaMarcas getListadoMarcas() {
        return listadoMarcas;
    }

    /**
     * @param listadoMarcas the listadoMarcas to set
     */
    public void setListadoMarcas(ListaMarcas listadoMarcas) {
        this.listadoMarcas = listadoMarcas;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the file
     */
    public UploadedFile getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(UploadedFile file) {
        this.file = file;
    }

    /**
     * @return the imagen
     */
    public byte[] getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the nuevaImagen
     */
    public byte[] getNuevaImagen() {
        return nuevaImagen;
    }

    /**
     * @param nuevaImagen the nuevaImagen to set
     */
    public void setNuevaImagen(byte[] nuevaImagen) {
        this.nuevaImagen = nuevaImagen;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the prec
     */
    public double getPrec() {
        return prec;
    }

    /**
     * @param prec the prec to set
     */
    public void setPrec(double prec) {
        this.prec = prec;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the disponible
     */
    public String getDisponible() {
        return disponible;
    }

    /**
     * @param disponible the disponible to set
     */
    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }
    
}
