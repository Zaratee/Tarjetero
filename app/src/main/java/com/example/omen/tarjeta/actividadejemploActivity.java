package com.example.omen.tarjeta;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

public class actividadejemploActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividadejemplo);

        Intent destino = getIntent(); //declarando el Destino
        int Edad = destino.getIntExtra("Edad", -1); //si tiene un -1, la variable no llego
        int Imagen = destino.getIntExtra("Imagen", -1);
        String Nombre = destino.getStringExtra("Nombre");
        String Link = destino.getStringExtra("Link");
        String Descripcion = destino.getStringExtra("Descripcion");


        TextView nombre = (TextView) findViewById(R.id.txtV_Nomb); //Vincular el textview
        nombre.setText(Nombre); //Obtener el nombre

        TextView edad = (TextView) findViewById(R.id.txtV_Edad);
        edad.setText(""+Edad);
        
        TextView descripcion = (TextView) findViewById(R.id.txtV_Desc);
        descripcion.setText(Descripcion);

        ImageView img = (ImageView) findViewById(R.id.imgV_img);
        Picasso.with(this).load(Link).into(img);
    }
}
