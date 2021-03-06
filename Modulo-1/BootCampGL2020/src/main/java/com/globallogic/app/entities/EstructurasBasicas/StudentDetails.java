package com.globallogic.app.entities.EstructurasBasicas;

import java.util.Scanner;
/*Ejercicio 3.4:

Crear una nueva clase StudentDetails.

Agregar un método studentAge, dentro crear una variable de tipo int con nombre age, valor 0 y sumar el valor
5.
Imprimir el valor de la variable agregando como mensaje lo siguiente “La edad del estudiante es :”.
En el main, crear una variable de tipo local de nombre estudiante, asignar una instancia de StudentDetails y
luego invocar al método studentAge. Validar que la salida sea la correcta.
Luego modificar el método para que imprima la edad que reciba por parámetro en vez del valor hardcodeado
5.
Validar que imprima el valor pasado por parámetro.*/


public class StudentDetails {
    
    public static Scanner Teclado = new Scanner (System.in);
    private int age;

    public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
    
    public void studentAge(int numero) {
    
        age = 0 + numero;  

        System.out.println("La edad del estudiante es: " + age);
        
        
    }

    public static void main(String[] args) {

        MensajeUsuario();
        int numero = Teclado.nextInt();
        StudentDetails estudiante = new StudentDetails();	
        estudiante.studentAge(numero);	
        
        estudiante.setAge(numero);

    }

    public static void MensajeUsuario() {
        System.out.println("Ingrese un numero");
    }	

    // OutPut: La edad del estudiante es: 10

}