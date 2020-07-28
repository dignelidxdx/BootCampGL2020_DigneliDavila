package com.globallogic.app.entities.Excepciones;

// Ejercicio 8.4: Crear su propia clase de excepción (Llamada MiExcepcion) extendiendo la clase
// Exception. Dicha clase deberá almacenar internamente una referencia de tipo String. Escriba un
// método que muestre la cadena de caracteres almacenada.
// Crear otra clase llamada "PropiaClaseExcepcion" donde capture la excepción anterior y utilice el
// método para mostrar el sting almacenado.

public class MiExcepcion extends Exception {
    
	String mensaje;
    
    public MiExcepcion(String mensaje) {
        this.mensaje = mensaje;        
    }
        
    public String getMensaje() {    
        return "Class MiExcepcion" + mensaje;
    }
}
