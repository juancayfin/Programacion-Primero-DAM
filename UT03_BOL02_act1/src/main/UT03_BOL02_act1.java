package main;
import java.util.Scanner;

public class UT03_BOL02_act1 {
	public static void main(String[] args) {
		int[] numeros = new int[15];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe 15 números: ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		
		
		int ultimo = numeros[numeros.length - 1];
		for (int i = numeros.length - 1; i > 0; i--) {
			numeros[i] = numeros[i - 1];
		}
		numeros[0] = ultimo;
		
		
		System.out.println("El array ya rotado es: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}
}
