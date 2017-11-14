package com.example.administrador.ciberbidapp.model;

/**
 * Created by Administrador on 10/11/2017.
 */

public class Empresa {

    /* Constructor */

    public Empresa(){

    }

    public Empresa(String ruc, String razonSocial, String contacto, String telefono, String direccion, boolean activo) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.contacto = contacto;
        this.telefono = telefono;
        this.direccion = direccion;
        this.activo = activo;
    }
    /* Propiedades */

    protected String ruc;
    protected String razonSocial;
    protected String contacto;
    protected String telefono;
    protected String direccion;

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    protected boolean activo;

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
}
