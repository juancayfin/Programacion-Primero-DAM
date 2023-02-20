package main;
import java.util.ArrayList;

public class UT03_BOL03_act4 {
	public static void main(String[] args) {
		ArrayList<String> colores = new ArrayList<String>();
		
		colores.add("rojo");
		colores.add("verde");
		colores.add("azul");
		
		String color = colores.get(1);
		
		System.out.println("El color en el índice 1 es: " + color);
	}
}
