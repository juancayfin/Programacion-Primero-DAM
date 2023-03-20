package UT04_ejercicio7;

public class App {
	public static void main(String[] args) {
		Producto pijama = new Producto("Pijama", 10.0, 20);
		System.out.println(pijama);
		
		pijama.setprecio_sin_iva(20.0);
		System.out.println(pijama);
	}
}
