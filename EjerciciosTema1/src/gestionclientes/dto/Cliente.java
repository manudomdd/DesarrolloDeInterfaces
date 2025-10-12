/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionclientes.dto;

import java.util.Date;

/**
 *
 * @author manu
 */
public class Cliente {
    
    protected String nombre; 
    protected String apellidos; 
    protected Date fechaAlta; 
    protected String provincia; 

    public Cliente(String nombre, String apellidos, Date fechaAlta, String provincia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaAlta = fechaAlta;
        this.provincia = provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", fechaAlta=" + fechaAlta + ", provincia=" + provincia + '}';
    } 
}
