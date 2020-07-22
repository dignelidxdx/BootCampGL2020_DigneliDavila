package com.globallogic.app.entities;

/* Ejercicio 4.8: Realizar un While de 1 a 50, imprimir “Valor iterado <valor> par” (Si el valor es
par) o imprimir “Valor iterado <valor> impar”(si el valor es impar).

Ejemplo salida:

Valor iterado 1 impar

Valor iterado 2 par */

public class WhileDos {

    public void main(){

        int i = 1;

        while(i<=50)
        {
            if(i%2==0){
                System.out.println("Valor iterado " + i + " par");
            } else System.out.println("Valor iterado " + i + " impar");

            i++;
        }
    }

    
}