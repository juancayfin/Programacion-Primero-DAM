package main;
import java.util.Scanner;

public class UT02_BOL02_act5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escribe el primer número: ");
		int numero1 = scanner.nextInt();
		
		System.out.print("Escribe el segundo número: ");
		int numero2 = scanner.nextInt();
		
		if (numero1 <= 0 || numero2 <= 0 || numero1 == numero2) {
			System.out.println("Los números deben ser positivos y diferentes.");
			return;
		}
		
		int menor = Math.min(numero1, numero2);
		int mayor = Math.min(numero1, numero2);
		
		for (int i = menor; i <= mayor; i++) {
			System.out.println("El número es: " + i);
		}
	}
}
