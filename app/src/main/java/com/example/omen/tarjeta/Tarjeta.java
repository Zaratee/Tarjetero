package com.example.omen.tarjeta;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by OMEN on 26/04/2018.
 */

public class Tarjeta {

    private int edad;
    private String link;
    private String nombre;
    private int imagen;
    private String descripcion;

    public Tarjeta() {
        edad = 0;
        nombre = null;
        link = null;
        descripcion = null;
        imagen = 0;
    }

    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}

    public int getImagen() {return imagen;}
    public void setImagen(int imagen) {this.imagen = imagen;}

    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public String getLink() {return link;}
    public void setLink(String link) {this.link = link;}

}

