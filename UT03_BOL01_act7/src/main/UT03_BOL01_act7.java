package main;

import java.util.Scanner;

public class UT03_BOL01_act7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una frase: ");
		String frase = sc.nextLine();
		
		
		//Reemplazo de A mayúsculas por a minúsculas
		StringBuilder sb = new StringBuilder();
		boolean precedidodeespacio = true;
		for (int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			if (c=='a') {
				if (precedidodeespacio) {
					sb.append(c);
				} else {
					sb.append(Character.toUpperCase(c));
				}
			} else {
				sb.append(c);
			}
			precedidodeespacio = (c == ' ');
		}
		String nuevaFrase = sb.toString();
		System.out.println("Frase reemplazada: ");
		System.out.println(nuevaFrase);
		
		
		//Mostrar iniciales
		sb = new StringBuilder();
		sb.append(Character.toUpperCase(nuevaFrase.charAt(0)));
		for (int i = 1; i < nuevaFrase.length(); i++) {
			char c = nuevaFrase.charAt(i);
			if (c == ' ') {
				sb.append(Character.toUpperCase(nuevaFrase.charAt(i+1)));
			}
		}
		String iniciales = sb.toString();
		System.out.println("Estas son las iniciales: ");
		System.out.println(iniciales);
		
		
		//Mostrar letras impares en mayus, y pares en minus.
		sb = new StringBuilder();
		for (int i = 0; i < nuevaFrase.length(); i++) {
			char c = nuevaFrase.charAt(i);
			if (i % 2 == 0) {
				sb.append(Character.toLowerCase(c));
			} else {
				sb.append(Character.toUpperCase(c));
			}
		}
		String nuevaFrase2 = sb.toString();
		System.out.println("Esta es la nueva frase con letras impares en mayúsculas, y pares en minúsculas: ");
		System.out.println(nuevaFrase2);
	}
}













