package com.example.administrador.ciberbidapp.model;

/**
 * Created by Administrador on 10/11/2017.
 */

public class Cliente extends Empresa {

    public Cliente(String ruc, String razonSocial, String contacto, String telefono, String direccion, int idTipoCliente){

        super(ruc,razonSocial,contacto,telefono,direccion);
        this.idTipoCliente = idTipoCliente;
    }

    public int idTipoCliente;

    public int getIdTipoCliente() {
        return idTipoCliente;
    }

    public void setIdTipoCliente(int idTipoCliente) {
        this.idTipoCliente = idTipoCliente;
    }

    @Override
    public String toString(){

        return super.razonSocial;
    }

}
