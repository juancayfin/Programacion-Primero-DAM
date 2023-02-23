package main;
import java.util.Scanner;

public class UT02_BOL02_act7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int contador = 0;
		int suma_impares = 0;
		int cantidad_impares = 0;
		int mayor_par = Integer.MIN_VALUE;
		
		while (true) {
			System.out.print("Escribe un número: ");
			int numero = scanner.nextInt();
			
			if (numero < 0) {
				break;
			}
			
			contador++;
			
			if (numero % 2 == 0) {
				if (numero > mayor_par) {
					mayor_par = numero;
				}
			} else {
				cantidad_impares++;
				suma_impares += numero;
			}
		}
		
		if (contador == 0) {
			System.out.println("No se han introducido números.");
		} else {
			double media_impares = cantidad_impares == 0 ? 0 : (double) suma_impares / cantidad_impares;
			
			System.out.println("Se han introducido " + contador + " números.");
			System.out.println("La media de los impares es: " + media_impares);
			
			if (mayor_par == Integer.MIN_VALUE) {
				System.out.println("No se han introducido números pares.");
			} else {
				System.out.println("El mayor de los números pares es: " + mayor_par);
			}
		}
	}
}