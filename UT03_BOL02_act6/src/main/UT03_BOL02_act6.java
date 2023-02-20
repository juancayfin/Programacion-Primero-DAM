package main;
import java.util.Scanner;

public class UT03_BOL02_act6 {
	public static void main(String[] args) {
		int[] array_enteros = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		boolean salir = false;
		
		while(!salir) {
			System.out.println("Menú: ");
			System.out.println("a. Mostrar valores.");
			System.out.println("b. Introducir valor.");
			System.out.println("c. Salir.");
			
			
			System.out.print("Introduce una opción: ");
			String opcion = scanner.nextLine();
			
			switch(opcion) {
			case "a":
				System.out.println("Valores del array: ");
				for (int i = 0; i < array_enteros.length; i++) {
					System.out.println(array_enteros[i]);
				}
				break;
				
			case "b":
				System.out.print("Introduce el valor: ");
				int valor = scanner.nextInt();
				System.out.print("Introduce la posición: ");
				int posicion = scanner.nextInt();
				array_enteros[posicion] = valor;
				break;
				
			default:
				System.out.println("Opción inválida. Inténtalo de nuevo.");
				break;
			}
		}
		
		scanner.close();
	}
}
