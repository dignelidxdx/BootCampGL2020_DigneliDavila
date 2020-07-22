package com.globallogic.app.entities;


public class StudentDetails {
    
    public int age;

    public void studentAge(int numero) {
       
        age = 0 + numero;  

        System.out.println("La edad del estudiante es:" + age);

        
    }
}