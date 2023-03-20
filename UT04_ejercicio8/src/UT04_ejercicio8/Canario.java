package UT04_ejercicio8;

public class Canario extends Aves{
	private String color;
	private String canta;
	
	public Canario(String pico, String vuela) {
		super(pico, vuela);
		this.color = color;
		this.canta = canta;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getCanta() {
		return canta;
	}
	
	@Override
	public void muestra() {
		System.out.println("Esta es la muestra");
	}
	
	@Override
	public void habla() {
		System.out.println("Pía");
	}

	@Override
	public void volar() {
		System.out.println("Vuela");
	}
}
