package UT04_ejercicio8;


public class Loro extends Aves{
	private String origen;
	private String habla;
	
	public Loro(String pico, String vuela) {
		super(pico, vuela);
		this.origen = origen;
		this.habla = habla;
	}
	
	public String getOrigen() {
		return origen;
	}
	
	public String getHabla() {
		return habla;
	}
	
	@Override
	public void muestra() {
		System.out.println("Esta es la muestra");
	}
	
	@Override
	public void saluda() {
		System.out.println("Hola");
	}

	@Override
	public void volar() {
		System.out.println("Vuela");
	}
}