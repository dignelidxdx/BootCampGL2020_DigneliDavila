package ar.com.gl.modulo8.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {		
		
		parte1();		
		parte2();

		//final List<String> cities = Arrays.asList("Quito", "Barcelona", "Madrid", "La Habana", "Paris", "New York", "Bogotá", "Rio de Janeiro", "Lima", "Buenos Aires");
	}

	private static void parte1() {
		final int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

		List<Integer> numeros = Arrays.stream(values).boxed().collect(Collectors.toList());

		ejecutarJava7(numeros);
	}

	private static void ejecutarJava7(List<Integer> numeros) {
		System.out.println("Java 7");
		InterfazFuncional instancia = new InterfazFuncionalImpl();
		for (int x : numeros) {
			System.out.println(instancia.ejecutar(x));
		}
	}
	private static void ejecutarJava8Stream(List<Integer> numeros) {
		System.out.println("Java 8 stream");
		InterfazFuncional instancia = new InterfazFuncionalImpl();
		numeros.stream().map(instancia::ejecutar).forEach(System.out::println);
	}
	private static void ejecutarJava8InterfazFuncional(List<Integer> numeros) {
		System.out.println("Java 8 interfaz funcional");
		InterfazFuncional instancia = x -> x*3;
		numeros.stream().map(instancia::ejecutar).forEach(System.out::println);
	}
	private static void ejecutarJava8Lambda(List<Integer> numeros){
		System.out.println("Java 8 lambda");
		numeros.stream().map(x -> x * 3).forEach(System.out::println);
	}
	private static void ejecutarJava8LambdaFiltro(List<Integer> numeros) {
		System.out.println("Java 8 Lambda y filtro");
		numeros.stream().filter(x -> x % 2 == 0).map(x -> x * 3).forEach(System.out::println);
	}
	private static void parte2() {
		System.out.println();
		System.out.println("Ejemplo interface default y static");
		System.out.println();
		InterfazDefault intDefaultImpl = new InterfazDefaultImpl();
		InterfazDefault intDefaultOvImpl = new InterfazDefaultOverrideImpl();

		InterfazDefault.metodoEstatico();
		System.out.println();
		intDefaultImpl.ejecutar();
		System.out.println();
		intDefaultOvImpl.ejecutar();
	}

}
