package com.globallogic.app.entities;

/* Ejercicio 4.5: Realizar un For de 0 a 10000, en cada iteración verificaremos si el número en el que
estamos es divisible por 20 o no y en caso afirmativo aumentaremos un contador en 1 (Sumar 1).
Se deberá imprimir el valor final del contador. */

public class CicloForDos {
    int suma = 0;

    public void main() {
        
        for (double i = 0; i <= 10000; i++) {
            if(i%20 == 0) {
                suma = suma + 1;
            }
        }

        System.out.println("El resultado final es: " + suma);

    }

    
}