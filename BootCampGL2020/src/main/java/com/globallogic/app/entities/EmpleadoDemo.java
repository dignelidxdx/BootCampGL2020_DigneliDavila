package com.globallogic.app.entities;

public class EmpleadoDemo {

    EmpleadoDos empleado = new EmpleadoDos();
    public void main() {

        empleado.salario = 1000;

        System.out.println(empleado.nombre + " tiene un salario promedio de: " + empleado.salario);
    }
    
}