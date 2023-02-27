package main;
import java.util.Scanner;


public class Producto{
		private String nombre;
		private double precio;
		private final double iva = 0.21;
		private int cuantosQuedan;
		
		public Producto(String nombre, double precio, int cuantosQuedan) {
			this.nombre = nombre;
			this.precio = precio;
			this.cuantosQuedan = cuantosQuedan;
		}
		
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		
		public String getNombre(){
			return nombre;
		}
		
		public double getPrecio() {
			return precio;
		}
		
		public double getIva() {
			return iva;
		}
		
		public int getCuantosQuedan() {
			return cuantosQuedan;
		}
		
public class App {
	public static void main(String[] args) {
		Producto producto = new Producto("Calcetin", 10.0, 5);
		double pvp = producto.getPrecio() * (1 + producto.getIva());

		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce nuevo precio: ");
		double nuevoPrecio = scanner.nextDouble();
		producto.setPrecio(nuevoPrecio);
		pvp = producto.getPrecio() * (1 + producto.getIva());

		
		scanner.close();
	}
}
}

