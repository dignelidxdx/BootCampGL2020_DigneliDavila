package com.globallogic.bootcampgl.junitTest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
       
	}
	
	public int suma(int numero, int numero2) {
        int suma = numero + numero2;

        return suma;
    }
    
    public boolean Ejercicio(int valorMaximo) {

		int contador = 0;
    	for(int valorInicial = 0; valorInicial < valorMaximo; valorInicial++ ) {  			
			contador++;
		}

		if(contador == 3) {
			return true;
		} else {
			return false;
		}		
	
	}
	
}
