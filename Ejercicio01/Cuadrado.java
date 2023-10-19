package Ejercicio01;

public class Cuadrado extends FiguraBidimensional {
	private double resultado;
	public Cuadrado(double altura, String descripcion) {
		super(altura, descripcion);
	}

	public void area() {
		this.resultado= Math.pow(getAltura(),2);
		
	}

	@Override
	public String toString() {
		return "---Cuadrado---"+"\nTipo: " + getDescripcion()+"\nAltura: " + getAltura()+"\nresultado: " + resultado;
	}

}