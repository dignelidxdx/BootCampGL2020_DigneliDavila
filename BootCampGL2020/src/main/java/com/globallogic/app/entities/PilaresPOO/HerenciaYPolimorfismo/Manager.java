package com.globallogic.app.entities.PilaresPOO.HerenciaYPolimorfismo;

import java.util.ArrayList;

public class Manager {

    public static void main(String[] args) {

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();

        Electrodomestico electrodomestico = new Electrodomestico();
        electrodomestico.encender();
        electrodomestico.apagar();

        Heladera heladera = new Heladera();
        heladera.encender();
        heladera.apagar();
        heladera.setMarca("Gafa");
        heladera.setCapacidad(50);
        heladera.setColor("Blanco");

        Televisor televisor = new Televisor();
        televisor.encender();
        televisor.setMarca("Samsung");
        televisor.setPeso(5);
        televisor.setColor("Gris");

        Cafetera cafetera = new Cafetera();
        cafetera.encender();    
        cafetera.setMarca("Oster");
        cafetera.setPeso(3);
        cafetera.setColor("Rojo");    

        electrodomesticos.add(heladera);
        electrodomesticos.add(televisor);
        electrodomesticos.add(cafetera);

        for (Electrodomestico electrodomestico2 : electrodomesticos) {

            electrodomestico2.encender();
            
        }
    }

    
}