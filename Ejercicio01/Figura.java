package Ejercicio01;

public abstract class Figura {

	private double base;
	private double altura;
	private String descripcion;

	public Figura(String descripcion) {
		this.descripcion = descripcion;
	}
	public Figura(double altura, String descripcion) {
		this.altura = altura;
		this.descripcion = descripcion;
	}
	public Figura(double base, double altura, String descripcion) {
		super();
		this.base = base;
		this.altura = altura;
		this.descripcion = descripcion;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
