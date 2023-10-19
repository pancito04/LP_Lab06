package Ejercicio01;

public class Circulo extends FiguraBidimensional{
	
	private double resultado;
	
	public Circulo(double altura, String descripcion) {
		super(altura, descripcion);
	}


	@Override
	public void area() {
		this.resultado = 3.14*Math.pow(getAltura(),2);
		
	}

	@Override
	public String toString() {
		return "---Circulo---"+ "\nTipo: "+getDescripcion()+"\nRadio: "+getAltura()+"\nresultado: " + resultado ;
	}
	

}