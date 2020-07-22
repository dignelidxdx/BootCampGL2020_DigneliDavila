package com.globallogic.app.entities;

public class EmpleadoDemo {

    Empleado empleado = new Empleado();
    public void main() {

        Empleado.salario = 1000;

        System.out.println(empleado.nombre + " tiene un salario promedio de: " + empleado.salario);
    }
    
}