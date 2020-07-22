package com.globallogic.app.entities;


/*Ejercicio 4.4: Realizar un for de 1 a 10, imprimiendo el valor iterado

Pasos:

Colocar la cláusula For, valor inicial i=1, valor final <=10, y que incremente en 1

Imprimer mediante System.out.println el siguiente mensaje “Valor iterado: ”
concatenado con el valor de i

Ejemplo salida:

Valor iterado: 1

Valor iterado: 2 */

public class CicloFor {

    public void main() {
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Valor iterado: " + i);
        }        
    }
    
}