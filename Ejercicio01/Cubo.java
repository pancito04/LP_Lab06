package Ejercicio01;

import java.lang.Math;

public class Cubo extends FiguraTridimensional{
	private double area;
	private double volumen;
	public Cubo(double altura, String descripcion) {
		super(altura, descripcion);
	}
	@Override
	public void area() {
		this.area = 6* Math.pow(getAltura(), 2);
	}
	
	@Override
	public void Volumen() {
		this.volumen = Math.pow(getAltura(), 3);
		
	}
	@Override
	public String toString() {
		return "---Cubo--- "+
				"\nTipo: " + getDescripcion()+
				"\nLado: "+ getAltura()+
				"\narea: " + area + 
				"\nvolumen: " + volumen;
	}

}