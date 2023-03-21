package ut04_ejercicio9;
import java.time.LocalDate;

public class Profesor extends Trabajador {
	private String departamento;
	
	public Profesor(String dni, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, String nrp, LocalDate fechaIncorporacion, String departamento) {
		super(dni, nombre, apellido1, apellido2, fechaNacimiento, nrp, fechaIncorporacion);
		this.departamento = departamento;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
}
