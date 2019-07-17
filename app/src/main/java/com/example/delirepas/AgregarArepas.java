package com.example.delirepas;

import android.content.Intent;
//import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Random;

public class AgregarArepas extends AppCompatActivity {

    private ArrayList<Integer> fotos;
    private EditText id,nombre,precio,calorias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView  (R.layout.activity_agregar_arepas);

        fotos = new ArrayList<>();
        // Agregando las fotos al ArrayList
        fotos.add(R.drawable.images);
        fotos.add(R.drawable.images2);
        fotos.add(R.drawable.images3);

        //obteniendo el id  de lo txt

        id= findViewById(R.id.txtIdArepa);
        nombre = findViewById(R.id.txtNombre);
        calorias = findViewById(R.id.txtCaloria);
        precio = findViewById(R.id.txtPrecio);
    }

/*
    public void guardar(View v){
        String nom, apel,id;
        int foto;
        id = Datos.getId();
        nom = nombre.getText().toString();
        apel = apellidos.getText().toString();
        foto = this.fotoAleatoria();
        Persona p = new Persona(id,foto,nom,apel);
        p.guardar();
        limpiar();

        //Snackbar.make(v,"Persona Guardada Exitosamente",Snackbar.LENGTH_SHORT).show();
        Snackbar.make(v,getString(R.string.mensaje),Snackbar.LENGTH_SHORT).show();
    }
*/
    public void limpiar(View v){
        limpiar();
    }

    public void limpiar(){

        id.setText("");
        nombre.setText("");
        precio.setText("");
        calorias.setText("");
        nombre.requestFocus();
    }

    //para las fotos
    public int fotoAleatoria(){
        int fotoSeleccionada;
        Random r = new Random();
        fotoSeleccionada = r.nextInt(this.fotos.size());
        return fotos.get(fotoSeleccionada);
    }

    public void onBackPressed(){
        finish();
        Intent i = new Intent(AgregarArepas.this,MainActivity.class);
        startActivity(i);

    }
}
