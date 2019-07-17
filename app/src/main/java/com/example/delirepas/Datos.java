package com.example.delirepas;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Datos {

    private static String db = "Arepas";

    //conectar con la base de datos remota con la base de datos arepas que está en el firebase
    private static DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();


    public static ArrayList<Arepa> arepas = new ArrayList<>();

    //crear el agregar

    public static void agregar(Arepa a){

        databaseReference.child(db).child(a.getId()).setValue(a);
    }

    //editar
    public static void editar (Arepa a){

        databaseReference.child(db).child(a.getId()).setValue(a);
    }

    //eliminar
    public static void eliminar (Arepa a){

        databaseReference.child(db).child(a.getId()).removeValue();
    }

    //obtener la llave del servidor
    public static String getId(){
        return databaseReference.push().getKey();
    }

    //set
    public static void setPersonas(ArrayList<Arepa> arepas){

        Datos.arepas= arepas;
    }

    //get
    public static ArrayList<Arepa> obtener(){

        return Datos.arepas;
    }

}