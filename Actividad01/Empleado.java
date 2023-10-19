package Actividad01;

public abstract class Empleado implements PorPagar{
	private String primerNombre;
	private String apellidoPaterno;
	private String numeroSeguroSocia1;
	// constructor con tres argumentos
	public Empleado( String nombre, String apellido, String nss) {
		primerNombre = nombre;
		apellidoPaterno = apellido;
		numeroSeguroSocia1 = nss;
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getNumeroSeguroSocia1() {
		return numeroSeguroSocia1;
	}
	public void setNumeroSeguroSocia1(String numeroSeguroSocia1) {
		this.numeroSeguroSocia1 = numeroSeguroSocia1;
	}
	
}