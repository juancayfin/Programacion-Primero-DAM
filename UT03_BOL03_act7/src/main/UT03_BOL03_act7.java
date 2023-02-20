package main;
import java.util.ArrayList;

public class UT03_BOL03_act7 {
	public static void main(String[] args) {
		ArrayList<String> colores = new ArrayList<String>();
		
		colores.add("rojo");
		colores.add("verde");
		colores.add("azul");
		colores.add("amarillo");
		
		String colorBuscado = "verde";
		
		if(colores.contains(colorBuscado)) {
			System.out.println("El color " + colorBuscado + " se encuentra en la lista.");
		} else {
			System.out.println("El color " + colorBuscado + " no se encuentra en la lista.");
		}
	}
}
