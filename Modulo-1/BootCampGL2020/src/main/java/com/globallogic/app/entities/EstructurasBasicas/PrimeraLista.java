package com.globallogic.app.entities.EstructurasBasicas;

/*Ejercicio 3.3: Crear una clase PrimeraLista , agregar un método main(), dentro del método crear una
Lista de Strings letters y agregar a la lista A, B y C.
Imprimir la lista y luego imprimir la cantidad de elementos que posee la lista.
Agregar en la primera posición el elemento X y volver a imprimir la lista.*/

import java.util.ArrayList;

public class PrimeraLista {

    public static void main(String[] args) {
        
        ArrayList<String> myList = new ArrayList();

        myList.add(0, "A");
        myList.add(1, "B");
        myList.add(2, "C");

        System.out.println(myList);
        System.out.println(myList.size());

        myList.add(0, "X");
        System.out.println(myList);

        
    }

    // Output: 
    // [A, B, C]
    // 3
    // [X, A, B, C]
    
}