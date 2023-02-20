package main;
import java.util.Scanner;

public class UT03_BOL02_act3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] numeros = new double[50];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Math.random();
		}
		
		System.out.print("Escribe un valor R entre 0 y 1: ");
		double r = sc.nextDouble();
		
		
		int contador = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] >= r) {
				contador++;
			}
		}
	}
}
