package com.example.omen.tarjeta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        ListView lista = (ListView) findViewById(R.id.lista);
        origenDeDatos datos = new origenDeDatos();
        final tarjetaAdapter adapter = new tarjetaAdapter();
        adapter.contexto = this;
        adapter.imagen = datos.getImagenes();
        adapter.datos = datos.getDatos();
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) { //el primer parametro es el adaptador con el que fue creado, el tercer es la posicion del elemento

                Intent objeto = new Intent(PrincipalActivity.this,actividadejemploActivity.class);

                Tarjeta x = (Tarjeta) parent.getItemAtPosition(position); //Devuelve elemento del pojo (Tarjeta), un arraylist del adaptador
                objeto.putExtra("Nombre", x.getNombre()); //Partes del pojo (Tarjeta) los envia
                objeto.putExtra("Edad", x.getEdad());
                objeto.putExtra("Descripcion", x.getDescripcion());
                objeto.putExtra("Imagen", x.getImagen());
                objeto.putExtra("Link",x.getLink());
                startActivity(objeto); //Iniciar la actividad
            }
        });

    }

    public ListView lista;

    origenDeDatos objetoODD;
    tarjetaAdapter objetoTA;
}
