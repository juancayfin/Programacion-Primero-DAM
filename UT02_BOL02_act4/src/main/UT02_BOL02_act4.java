package main;
import java.util.Scanner;

public class UT02_BOL02_act4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escribe un número positivo y entero: ");
		int numero = scanner.nextInt();
		
		if (numero <= 0) {
			System.out.println("El número tiene que ser positivo.");
			return;
		} 
		
		boolean primo = true;
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				primo = false;
				break;
			}
		}
		
		if (primo) {
			System.out.println("El número " + numero + " es primo.");
		} else {
			System.out.println("El número " + numero + " no es primo.");
		}
	}
}
