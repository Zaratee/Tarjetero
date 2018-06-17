package com.example.omen.tarjeta;

import java.util.ArrayList;

/**
 * Created by OMEN on 26/04/2018.
 */

public class origenDeDatos {
    origenDeDatos(){}
    public ArrayList<String> getImagenes(){
     ArrayList <String> Imagenes = new ArrayList<>();
     Imagenes.add("http://pngimg.com/uploads/mario/mario_PNG125.png");
     Imagenes.add("https://i.pinimg.com/originals/23/04/44/2304446bcc55efe941753a19fe62769f.png\n");
     Imagenes.add("https://i.pinimg.com/originals/f2/77/53/f27753ce651ffd5c1807e4bf14c911c5.jpg\n");
     Imagenes.add("http://mariopartylegacy.com/wp-content/uploads/2011/08/peachprofile.png");
     Imagenes.add("https://info.sonicretro.org/images/7/7a/Bowser_MSOG.png");
     Imagenes.add("https://www.hardcoregamer.com/wp-content/uploads/2016/06/dk-amiibo.png");
     Imagenes.add("http://images2.fanpop.com/images/photos/6000000/Toad-toad-6046375-938-1580.jpg");
     Imagenes.add("https://www.ceti.mx/cetinew/img/logo_ceti.png");
     Imagenes.add("https://upload.wikimedia.org/wikipedia/it/thumb/7/72/BowserJr.png/193px-BowserJr.png");
     Imagenes.add("https://vignette.wikia.nocookie.net/ssb/images/6/63/Diddy_Kong_Clear_SSBB.png/revision/latest?cb=20160118004845");


     return Imagenes;
    }

    public ArrayList<Tarjeta> getDatos(){
        ArrayList <Tarjeta> resultado = new ArrayList<>();

        Tarjeta uno = new Tarjeta();
        uno.setDescripcion("Luigi´s Brother");
        uno.setNombre("Mario");
        uno.setEdad(26);
        uno.setLink(getImagenes().get(0));
        resultado.add(uno);

        Tarjeta dos = new Tarjeta();
        dos.setDescripcion("Mario´s Brother");
        dos.setNombre("Luigi");
        dos.setEdad(19);
        uno.setLink(getImagenes().get(1));
        resultado.add(dos);

        Tarjeta tres = new Tarjeta();
        tres.setDescripcion("Mario´s Pet");
        tres.setNombre("Yoshi");
        tres.setEdad(19);
        tres.setLink(getImagenes().get(2));
        resultado.add(tres);

        Tarjeta cuatro = new Tarjeta();
        cuatro.setDescripcion("Mario´s GF");
        cuatro.setNombre("Peach");
        cuatro.setEdad(19);
        cuatro.setLink(getImagenes().get(3));
        resultado.add(cuatro);

        Tarjeta cinco = new Tarjeta();
        cinco.setDescripcion("Mario´s Enemy");
        cinco.setNombre("Bowser");
        cinco.setEdad(19);
        cinco.setLink(getImagenes().get(4));
        resultado.add(cinco);

        Tarjeta seis = new Tarjeta();
        seis.setDescripcion("Monkey");
        seis.setNombre("Donkey Kong");
        seis.setEdad(19);
        seis.setLink(getImagenes().get(5));
        resultado.add(seis);

        Tarjeta siete = new Tarjeta();
        siete.setDescripcion("Mario´s food");
        siete.setNombre("Toad");
        siete.setEdad(19);
        siete.setLink(getImagenes().get(6));
        resultado.add(siete);

        Tarjeta ocho = new Tarjeta();
        ocho.setDescripcion("Color nibba");
        ocho.setNombre("Bad Mario");
        ocho.setLink(getImagenes().get(7));
        ocho.setEdad(19);
        resultado.add(ocho);

        Tarjeta nueve = new Tarjeta();
        nueve.setDescripcion("Bowser Son");
        nueve.setNombre("Bowser JR");
        nueve.setEdad(19);
        nueve.setLink(getImagenes().get(8));
        resultado.add(nueve);

        Tarjeta diez = new Tarjeta();
        diez.setDescripcion("Donkey Kong Son");
        diez.setNombre("Diddy Kong");
        diez.setEdad(19);
        diez.setLink(getImagenes().get(9));
        resultado.add(diez);

        return resultado;
    }
}
