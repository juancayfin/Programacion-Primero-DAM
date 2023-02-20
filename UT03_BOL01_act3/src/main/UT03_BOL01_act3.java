package main;
import java.util.Scanner;

public class UT03_BOL01_act3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce el texto: ");
		String texto1 = input.nextLine();
		
		System.out.println("Introduce el segundo texto: ");
		String texto2 = input.nextLine();
		
		if (texto1.equalsIgnoreCase(texto2)) {
			System.out.println("Los textos son iguales, sin incluír mayus y minus en el análisis.");
		} else {
			System.out.println("Los textos son diferentes, sin incluír mayus y minus en el análisis.");
		}
		
		if (texto1.equals(texto2)) {
			System.out.println("Los textos son iguales, incluyendo mayus y minus en el análisis.");
		} else {
			System.out.println("Los textos son diferentes, incluyendo mayus y minusen el análisis.");
		}
		
		input.close();
	}
}
