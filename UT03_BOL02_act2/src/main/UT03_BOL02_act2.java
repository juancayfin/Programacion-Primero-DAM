package main;

import java.util.Scanner;

public class UT03_BOL02_act2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		

		System.out.print("Introduce N: ");
		int n = sc.nextInt();
		System.out.print("Introduce M: ");
		int m = sc.nextInt();
		
		
		int[] numeros = new int[n];
		int contador = 0;
		System.out.println("Introduce " + n + " números: ");
		for (int i = 0; i < n; i++) {
			int numero = sc.nextInt();
			if (numero % m == 0) {
				numeros[contador] = numero;
				contador++;
			}
		}
		
		
		System.out.println("Los múltiplos de " + m + " son: ");
		for (int i = 0; i < contador; i++) {
			System.out.print(numeros[i] + " ");
		}
	}
}
