package com.globallogic.app.entities;

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