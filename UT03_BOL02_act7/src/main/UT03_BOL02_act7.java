package main;
import java.util.Scanner;
import java.util.Arrays;

public class UT03_BOL02_act7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		
		
		for(int i = 0; i < 20; i++) {
			System.out.print("Introduce un valor entero: ");
			int valor = scanner.nextInt();
			if(i < 10) {
				array1[i] = valor;
			} else {
				array2[i-10] = valor;
			}
		}
		
		if (Arrays.equals(array1, array2)) {
			System.out.println("Las dos arrays son iguales.");
		} else {
			System.out.println("Los dos arrays son diferentes.");
		}
	}
}
