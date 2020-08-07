package com.globallogic.bootcamp.patterns;

/*
Ejercicio 1.2: Crear una clase Currency, con el atributo name, siendo esta un singleton. Para ello:
Crear la clase como normalmente se crea.
Hacer su constructor por default sea privado e inicialice name con el valor "ARS"
Crear un atributo de clase instance del tipo Currency y asignarle una nueva instancia.
Crear un método de clase getInstance que retorne el valor de la instancia.
Armar un test de JUnit que compruebe al utilizar 2 veces el método getInstance de la clase retorne el
mismo objeto.  */

public class Currency {

    private String name;
    private static Currency instance;

    private Currency() {
        this.name = "ARS";
    }

    public static Currency getInstance(){
        if(instance == null){
            Currency instance = new Currency();
        }
        return instance;
    }

    public void show() {
        System.out.println("El nombre es: " + this.name);
    }
    
}