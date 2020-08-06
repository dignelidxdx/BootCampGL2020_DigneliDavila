package com.globallogic.bootcamp.patterns;


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