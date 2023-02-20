package main;

import java.util.Scanner;

public class UT03_BOL01_act5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe una frase: ");
		String frase = sc.nextLine().toLowerCase();
		
		int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;
		for (int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			switch(c) {
			case 'a':
				contadorA++;
				break;
				
			case 'e':
				contadorE++;
				break;
				
			case 'i':
				contadorI++;
				break;
				
			case 'o':
				contadorO++;
				break;
				
			case 'u':
				contadorU++;
				break;
				
			default:
				break;
			}
		}
		
		System.out.println("Esta es la cantidad de vocales que hay en tu frase:");
		System.out.println("Cantidad de A's: " + contadorA);
		System.out.println("Cantidad de E's: " + contadorE);
		System.out.println("Cantidad de I's: " + contadorI);
		System.out.println("Cantidad de O's: " + contadorO);
		System.out.println("Cantidad de U's: " + contadorU);
	}
}
