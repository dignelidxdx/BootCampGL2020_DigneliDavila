package com.globallogic.app.entities.Interfaces;

public interface Persona {
    
    public void hablar();
    public void dormir();
    default void come();
}