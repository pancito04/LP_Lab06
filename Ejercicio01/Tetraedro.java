package Ejercicio01;

import java.lang.Math;
public class Tetraedro extends FiguraTridimensional{
	
	private double area;
	private double volumen;
	
	public Tetraedro(double altura, String descripcion) {
		super(altura, descripcion);
		
	}
	@Override
	public void area() {
		this.area = Math.sqrt(3)*Math.pow(getAltura(), 2);
		
	}

	@Override
	public void Volumen() {
		this.volumen = (Math.sqrt(2)*Math.pow(getAltura(), 3))/12;
		
	}
	
	@Override
	public String toString() {
		return "---Tetraedro---"+ 
				"\nDescripcion: "+ getDescripcion()+
				"\nRadio: " + getAltura() +
				"\nArea Superficial: " + area +
				"\nVolumen: " + volumen;
	}		
}