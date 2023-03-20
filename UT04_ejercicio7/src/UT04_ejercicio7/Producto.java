package UT04_ejercicio7;

public class Producto {
	private String nombre;
	private double precio_sin_iva;
	private final double iva = 0.21;
	private int cuantos_quedan;
	
	public Producto(String nombre, double precio_sin_iva, int cuantos_quedan) {
		this.nombre = nombre;
		this.precio_sin_iva = precio_sin_iva;
		this.cuantos_quedan = cuantos_quedan;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getprecio_sin_iva() {
		return precio_sin_iva;
	}
	
	public double getprecio_con_iva() {
		return precio_sin_iva * (1 + iva);
	}
	
	public int getcuantos_quedan() {
		return cuantos_quedan;
	}
	
	public void setprecio_sin_iva(double d) {
		this.precio_sin_iva = precio_sin_iva;
	}
	
	public void setcuantos_quedan(int cuantos_quedan) {
		this.cuantos_quedan = cuantos_quedan;
	}
	
	@Override
	public String toString() {
		return nombre + " - Precio:" + precio_sin_iva + "€ - IVA:" + (int)(iva * 100) + "% - PVP:" + getprecio_sin_iva() + "€";
	}

}
