package main;
import java.util.Scanner;

public class UT02_BOL02_act3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escribe la base (número real): ");
		double base = scanner.nextDouble();
		
		System.out.print("Escribe el exponente (número entero y positivo): ");
		int exponente = scanner.nextInt();
		
		if (exponente <= 0) {
			System.out.print("El exponente debe de ser un número entero y positivo.");
			return;
		}
		
		double potencia = 1;
		for (int i = 1; i <= exponente; i++) {
			potencia *= base;
			System.out.println(base + " elevado a " + i + " = " + potencia);
		}
	}
}
