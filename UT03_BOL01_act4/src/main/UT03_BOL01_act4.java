package main;
import java.util.Scanner;	

public class UT03_BOL01_act4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Escribe tu nombre: ");
		String nombre = input.nextLine();
		
		System.out.print("Escribe tu primer apellido: ");
		String primer_apellido = input.nextLine();
		
		System.out.print("Escribe tu segundo apellido: ");
		String segundo_apellido = input.nextLine();
		
		String cod_usuario = (nombre.substring(0, 3) + primer_apellido.substring(0,3) + segundo_apellido.substring(0,3)).toUpperCase();
		
		System.out.println("Tu código de usuario es: " + cod_usuario);
		
		input.close();
	}
}