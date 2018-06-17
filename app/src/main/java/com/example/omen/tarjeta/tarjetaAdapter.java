package com.example.omen.tarjeta;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by OMEN on 26/04/2018.
 */

public class tarjetaAdapter extends BaseAdapter{

    ArrayList<String> imagen;
    ArrayList<Tarjeta> datos;
    Context contexto;

    @Override
    public int getCount() {
        return datos.size();
    }

    @Override
    public Object getItem(int position) {
        return datos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater vinculo = LayoutInflater.from(contexto);
        View v = vinculo.inflate(R.layout.layout,null);

        TextView nombrepersona = (TextView) v.findViewById(R.id.primertextv);
        nombrepersona.setText(datos.get(position).getNombre());

        TextView edadpersona = (TextView) v.findViewById(R.id.segundotextv);
        edadpersona.setText("" + datos.get(position).getEdad());

        TextView descripcionpersona = (TextView) v.findViewById(R.id.tercertextv);
        descripcionpersona.setText(datos.get(position).getDescripcion());

        ImageView img = (ImageView) v.findViewById(R.id.imagen);

        Picasso.with(contexto).load(imagen.get(position)).into(img);
        return v;
    }
}
