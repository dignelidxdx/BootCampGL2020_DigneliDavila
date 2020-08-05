package com.globallogic.app.entities.ControlFlujoWhile;

/* Ejercicio 4.8: Realizar un While de 1 a 50, imprimir “Valor iterado <valor> par” (Si el valor es
par) o imprimir “Valor iterado <valor> impar”(si el valor es impar).
Ejemplo salida:
Valor iterado 1 impar
Valor iterado 2 par */

public class ParImpar {

    public static void main( String[] args ){

        int numero = 1;

        while(numero<=50)
        {
            if(numero%2==0){

                System.out.println("Valor iterado " + numero + " par");
            } else System.out.println("Valor iterado " + numero + " impar");

            numero++;
        }
    }   
    
    // Input:
    // Output: 1 impar, 2 par, 3 impar ....
}