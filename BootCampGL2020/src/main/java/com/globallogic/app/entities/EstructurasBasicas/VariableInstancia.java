package com.globallogic.app.entities.EstructurasBasicas;

import java.util.Scanner;

/*Ejercicio 3.5: Crear una nueva clase VariableInstancia.
En la clase agregamos 3 variables entera engPoints, mathsPoints y phyPoints..
Crear otra clase PointDemo que posea un método main().
En el método main() crear una variable de tipo VariableInstancia con nombre vI y la inicializamos.
Le asignamos a engPoints el valor 50 y a mathsPoints el valor 80.
Imprimir el valor.*/

public class VariableInstancia {

    public static Scanner Teclado = new Scanner (System.in);
   
    private int engPoints;
    private int mathsPoints;
    private int phyPoints;

	public int getEngPoints() {
		return this.engPoints;
	}

	public void setEngPoints(int engPoints) {
		this.engPoints = engPoints;
	}

	public int getMathsPoints() {
		return this.mathsPoints;
	}

	public void setMathsPoints(int mathsPoints) {
		this.mathsPoints = mathsPoints;
	}

	public int getPhyPoints() {
		return this.phyPoints;
	}

	public void setPhyPoints(int phyPoints) {
		this.phyPoints = phyPoints;
    }
    
    
    public static void main( String[] args ) {

        VariableInstancia vI = new VariableInstancia();
        vI.setEngPoints(50);
        vI.setMathsPoints(80);

        System.out.println("El valor de entProing es: " + vI.getEngPoints() + " y el valor de mathsPoints es: " + vI.getMathsPoints());
        
    }

    // OutPut: El valor de entProing es: 50 y el valor de mathsPoints es: 80

}