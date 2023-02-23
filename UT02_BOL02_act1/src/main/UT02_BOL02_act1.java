package main;
import java.util.Scanner;

public class UT02_BOL02_act1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int contrasena = 1234;
		int intentos = 4;
		boolean acceso_permitido = false;
		
		System.out.println("Bienvenido, introduce la contraseña: ");
		
		while (intentos > 0 && !acceso_permitido) {
			String entrada_usuario = scanner.nextLine();
			
			if (entrada_usuario.length() != 4) {
				System.out.println("Código no válido.");
				continue;
			}
			
			int entrada_numero;
			try {
				entrada_numero = Integer.parseInt(entrada_usuario);
			} catch (NumberFormatException e) {
				System.out.println("Código incorrecto.");
				continue;
			}
			
			if (entrada_numero == contrasena) {
				acceso_permitido = true;
				System.out.println("Acceso permitido.");
			}else {
				intentos--;
				System.out.println("Incorrecto, te quedan " + intentos + " intentos.");
			}
		}
		
		if (!acceso_permitido) {
			System.out.println("Lo siento, has agotado todos tus intentos.");
		}
	}
}
