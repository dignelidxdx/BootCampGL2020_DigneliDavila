package com.globallogic.app.entities.EstructurasBasicas;

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
    
    public static void main(String[] args) {

        int myNum;
        myNum = 15;
        System.out.println(myNum);

        char myChar = 'a';
        System.out.println(myChar);

        boolean myBoolean = true;
        System.out.println(myBoolean);

        float myFloat = 24362.456F;
        System.out.println(myFloat);

        short myShort = 500;
        System.out.println(myShort);

        
    }

   // output:  15 a true 24362.455 50
   
}