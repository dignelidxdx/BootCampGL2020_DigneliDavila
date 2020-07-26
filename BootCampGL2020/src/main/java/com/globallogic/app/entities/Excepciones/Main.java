package com.globallogic.app.entities.Excepciones;

public class Main {

    
    public static void main(String[] args) {

        try {
            Exception exception = new Exception();   

             //public Exception(String nombre) {
              //   this.nombre = nombre;
	}

        } catch(Exception exception) {

            System.out.println("Error");
            System.out.println(exception);
        } finally {
            
            System.out.println("Esto se ejecuta sin importar si se presentan errores");
        }

 
     }
    
}