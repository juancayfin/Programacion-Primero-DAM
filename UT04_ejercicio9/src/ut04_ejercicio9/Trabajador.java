package ut04_ejercicio9;
import java.time.LocalDate;
import java.time.Period;

public class Trabajador extends Persona{
	private String nrp;
	private LocalDate fechaIncorporacion;
	
	public Trabajador(String dni, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, String nrp, LocalDate fechaIncorporacion) {
		super(dni, nombre, apellido1, apellido2, fechaNacimiento);
		this.nrp = nrp;
		this.fechaIncorporacion = fechaIncorporacion;
	}
	
	public String getNrp() {
		return nrp;
	}
	
	public void setNrp(String nrp) {
		this.nrp = nrp;
	}
	
	public LocalDate getFechaIncorporacion() {
		return fechaIncorporacion;
	}
	
	public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
		this.fechaIncorporacion = fechaIncorporacion;
	}
	
	public int getAntiguedad() {
		return Period.between(fechaIncorporacion, LocalDate.now()).getYears();
	}
}
