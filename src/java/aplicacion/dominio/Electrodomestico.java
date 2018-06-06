/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.dominio;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author CX
 */
public class Electrodomestico implements Serializable{
    private String codigo;
    private String tips;
    private Marca marca;
    private Date fecha;
    private int stock;
    private byte[] imagen;
    private String disponible;
    private String modelo;
    private double precio;

    public Electrodomestico() {
    }

    public Electrodomestico(String codigo, String tips, Marca marca, Date fecha, int stock, byte[] imagen, String disponible, String modelo, double precio) {
        this.codigo = codigo;
        this.tips = tips;
        this.marca = marca;
        this.fecha = fecha;
        this.stock = stock;
        this.imagen = imagen;
        this.disponible = disponible;
        this.modelo = modelo;
        this.precio = precio;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
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
        this.setImagen(imagen);
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
