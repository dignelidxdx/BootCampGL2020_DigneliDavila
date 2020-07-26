package com.globallogic.app.entities.Interfaces;

public interface Animal {
    
    public void dormir();
    public void sonidoAnimal();
    // default: son de manera implícita públicos
    default void come(String s);
    static void camina(String animal);


    
}