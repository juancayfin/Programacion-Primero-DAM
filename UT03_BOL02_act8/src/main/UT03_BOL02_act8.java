package main;
import java.util.Scanner;
import java.util.Arrays;

public class UT03_BOL02_act8 {
	public static void main(String[] args) {
		int[] array = new int[1000];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escribe un número entero entre 0 y 99: ");
		int n = scanner.nextInt();
		
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == n) {
				contador++;
			}
		}
		
		if (contador > 0) {
			System.out.println("El valor " + n + " existe en el arrar " + contador + " veces.");
		} else {
			System.out.println("El valor " + n + " no existe en el array.");
		}
	}
}
