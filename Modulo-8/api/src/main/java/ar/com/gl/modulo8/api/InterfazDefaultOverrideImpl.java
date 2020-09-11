package ar.com.gl.modulo8.api;

public class InterfazDefaultOverrideImpl implements InterfazDefault {
    @Override
    public void ejecutar() {
        InterfazDefault.super.ejecutar();
        System.out.println("Ejecutando metodo sobreescrito!");
    }   
}
