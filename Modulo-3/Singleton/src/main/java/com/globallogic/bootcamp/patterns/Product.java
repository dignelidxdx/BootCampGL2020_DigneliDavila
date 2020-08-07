package com.globallogic.bootcamp.patterns;

/* Ejercicio 1.4: Crear una clase Product, con el atributo name (con valor "Clavos") siendo esta un singleton, e
incluir en la clase Order un atributo de esta clase. Agregar los tests necesarios para demostrar que se realizó
correctamente el ejercicio.
*/


public class Product {

    private String name;
    private Order order;

    private Product() {

        this.name = "Clavos";
    }

    
}