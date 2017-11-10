package com.example.administrador.ciberbidapp.dao;

import com.example.administrador.ciberbidapp.model.Cliente;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Administrador on 10/11/2017.
 */

public class ClienteDao {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference clienteRef = database.getReference("Cliente");

    public void ingresarCliente(Cliente cliente, OnCompleteListener listener){
        clienteRef.child(cliente.getRuc()).setValue(cliente).addOnCompleteListener(listener);
    }

    public void



}
