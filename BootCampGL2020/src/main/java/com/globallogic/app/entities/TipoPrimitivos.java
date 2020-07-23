package com.globallogic.app.entities;

/* Ejercicio 3.1 : Creación de tipo de datos primitivos

Pasos:

Crear una clase TiposPrimitivos con un método main()

Dentro del método crear una variable llamada myNum de tipo int y asígnarle el valor 15.

Imprimir el valor utilizando System.out.println(myNum);

Crear una variable de tipo char, asignar el valor 'a' e imprimir su valor.

Crear una variable de tipo booleano, asignar el valor true e imprimir su valor.

Crear una variable de tipo float, asignar el valor '2436.2456' e imprimir su valor.

Crear una variable de tipo short, asignar el valor '500' e imprimir su valor. */

public class TipoPrimitivos {
    


    public void main() {
        int myNum;
        myNum = 15;
        System.out.println(myNum);
        char myChar = 'a';
        System.out.println(" Hola mi nombre empieza con: " + myChar);
        boolean myBoolean = true;
        System.out.println(" Hola mi nombre es Digneli y es : " + myBoolean);
        float myFloat = 24362.456F;
        System.out.println(" El valor de mifloat es: " + myFloat);
        short myShort = 500;
        System.out.println("El valor de mishort es: " + myShort);

        
    }
}