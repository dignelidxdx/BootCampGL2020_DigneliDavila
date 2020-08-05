package com.globallogic.app.entities.EstructurasBasicas.Empleado;

public class EmpleadoDemo {

    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.salario = 1000;

        System.out.println(empleado.nombre + " tiene un salario promedio de: " + empleado.salario);
    }

    // OutPut: Alex tiene un salario promedio de: 1000.0
    
}