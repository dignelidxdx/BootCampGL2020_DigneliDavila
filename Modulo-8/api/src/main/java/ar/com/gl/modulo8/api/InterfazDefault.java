package ar.com.gl.modulo8.api;

public interface InterfazDefault {
    
    public static void metodoEstatico() {
        System.out.println("Ejecutando metodo Estatico!");        
    }
    public default void ejecutar() {
        System.out.println("Comportamiento default");
    }
}
