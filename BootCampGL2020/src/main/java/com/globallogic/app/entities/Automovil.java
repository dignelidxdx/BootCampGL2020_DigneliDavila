package com.globallogic.app.entities;

abstract class Automovil {
    
    abstract void retroceder();

    void avanzar() {
        System.out.println("Soy el método avanzar de Automóvil");
    }
}