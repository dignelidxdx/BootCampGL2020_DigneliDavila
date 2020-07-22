package com.globallogic.app.entities;

/*Ejercicio 4.3: Mediantes la cláusula IF resolver la siguiente problemática

En Tienda se hace un 20% de descuento a los clientes cuya compra sea igual a $300, del 25% a los
clientes cuya compra sea mayor a $350 y sin descuento cuando no se cumple ninguna de las anteriores
condiciones.

En el caso de tener descuento, imprimir los siguientes mensajes:

El descuento es de: <valor>

En el caso de no tener descuento, imprimir el siguiente mensaje:

Sin descuentos, el total es: <valor>

Ejecutar este ejemplo, tomando como entrada una compra de $400 */

public class Tienda {
    double pagoActual = 0;
    double descuentoUno = 0.80;
    double descuentoDos = 0.75;
    double compra;

    public double promo(double pago) {
        if(pago == 300) {
            pagoActual = pago * descuentoUno;
            System.out.println("El descuento es de: " + pagoActual); 
        } else if(pago > 350) {
            pagoActual = pago * descuentoDos;
            System.out.println("El descuento es de: " + pagoActual); 
        } else {
            System.out.println("Sin descuento, el total es: " + pago); 
            pagoActual = pago;
        }      
		return pagoActual;
    }
    
}