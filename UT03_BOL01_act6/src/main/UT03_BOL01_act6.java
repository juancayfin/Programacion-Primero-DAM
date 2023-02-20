package main;
import java.util.Scanner;

public class UT03_BOL01_act6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una frase: ");
		String frase = sc.nextLine().toLowerCase().replaceAll("//s", "");
		String reverso = new StringBuilder(frase).reverse().toString();
		
		if (frase.equals(reverso)) {
			System.out.println("Tu frase es un palíndromo.");
		} else {
			System.out.println("Tu frase no es un palíndromo.");
		}
	}
}
