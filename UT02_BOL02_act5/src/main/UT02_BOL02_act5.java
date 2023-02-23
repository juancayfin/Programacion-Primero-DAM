package main;
import java.util.Scanner;

public class UT02_BOL02_act5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escribe un número entero y positivo: ");
		int numero = scanner.nextInt();
		
		if (numero < 0) {
			System.out.println("El número tiene que ser positivo.");
			return;
		}
		
		int suma = 0;
		for (int i = numero + 1; i <= numero + 100; i++) {
			suma += i;
		}
		
		System.out.println("La suma de los 100 números siguientes es: " + suma);
	}
}
