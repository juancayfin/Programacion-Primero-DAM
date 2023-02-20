package main;
import java.util.Scanner;

public class UT03_BOL01_act2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce el texto: ");
		String texto = input.nextLine();
		
		String[] palabras = texto.split(" ");
		for (String palabra : palabras) {
			System.out.println(palabra);
		}
		
		input.close();
	}
}
