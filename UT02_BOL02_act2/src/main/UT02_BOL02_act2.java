package main;
import java.util.Scanner;

public class UT02_BOL02_act2 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		double suma = 0;
		int contador = 0;
		
		System.out.println("Introduce números positivos: ");
		double numero = scanner.nextDouble();
		
		while (true) {
			
			if (numero < 0) {
				break;
			}
			
			suma += numero;
			contador++;
		}
		
		if (contador == 0) {
			System.out.println("No has introducido números positivos.");
		} else {
			double media = suma / contador;
			System.out.println("La media de tus números es: " + media);
		}
	}
}
