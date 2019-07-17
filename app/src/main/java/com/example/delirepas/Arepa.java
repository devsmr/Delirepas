package com.example.delirepas;

public class Arepa {
    String id;
    String nombre;
    double precio,calorias;

    public Arepa(String id, String nombre, double precio, double calorias) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.calorias = calorias;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }
}
