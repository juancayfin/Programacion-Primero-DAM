package main;
import java.util.Scanner;

public class UT03_BOL02_act4 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] valores = new int[100];
		for (int i = 0; i < valores.length; i++) {
			valores[i] = (int) (1 + Math.random() * 10);
		}
		
		
		System.out.print("Introduce un numero entero entre 1 y 10: ");
		int n = sc.nextInt();
		
		
		boolean encontrado = false;
		System.out.println("El valor " + n + " aparece en las posiciones: ");
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] == n) {
				System.out.println(i + " ");
				encontrado = true;
			}
		}
		
		
		if (!encontrado) {
			System.out.println("El valor " + n + " no aparece en el array.");
		} else {
			System.out.println();
		}
	}
}
