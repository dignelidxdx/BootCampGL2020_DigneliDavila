package com.globallogic.app.entities.ControlFlujoForEach;

import java.util.ArrayList;

/* Ejercicio 4.9: Iterar un Array Integer con un For each
Pasos:
Crear una Array del tipo Integer con valores del 1 al 10
Colocar la cláusula for con una variable num del tipo Integer, y asignarle la variable creada en el
punto anterior.
Imprimer mediante System.out.println el siguiente mensaje “Valor iterado: ”
concatenado con el valor de i
Ejemplo salida:
Valor iterado: 1
Valor iterado: 2... */

public class ForEach {    

    public static void main( String[] args ){

        ArrayList<Integer> valores = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            valores.add(i);
        }

        for (Integer num : valores) {
                System.out.println("Valor iterado: " + num);
        }
        
        
    }

    // Input:
    // Output: del 1 al 10
}