package UT04_ejercicio8;

public abstract class Aves {
	private String pico;
	private String vuela;
	
	public Aves(String pico, String vuela) {
		this.pico = pico;
		this.vuela = vuela;
	}
	
	public String getPico() {
		return pico;
	}
	
	
	public String getVuela() {
		return vuela;
	}
	
	
	public abstract void volar();

	public void muestra() {
		// TODO Auto-generated method stub
		
	}

	public void saluda() {
		// TODO Auto-generated method stub
		
	}

	public void habla() {
		// TODO Auto-generated method stub
		
	}	
}
