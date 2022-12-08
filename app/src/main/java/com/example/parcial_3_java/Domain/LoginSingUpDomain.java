package com.example.parcial_3_java.Domain;

import java.io.Serializable;

public class LoginSingUpDomain implements Serializable {
    private String id;
    private String nombre;
    private String contraseña;
    private String telefono;
    private String direccion;

    private int numberInCart;

    public LoginSingUpDomain(String id, String nombre, String contraseña, String telefono,String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /*public LoginSingUpDomain(String id, String nombre, String contraseña, String telefono, int numberInCart) {
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.direccion = direccion;
    }*/

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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public int getNumberInCart() {
        return numberInCart;
    }

    public void setNumberInCart(int numberInCart) {
        this.numberInCart = numberInCart;
    }
}
