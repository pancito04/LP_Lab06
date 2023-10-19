package Ejercicio01;

import java.lang.Math;
public class Esfera extends FiguraTridimensional{
	
	private double area;
	private double volumen;
	
	public Esfera(double altura, String descripcion) {
		super(altura, descripcion);
	}

	@Override
	public void area() {
		this.area = 4*(Math.PI*Math.pow(getAltura(), 2));
		
	}

	@Override
	public void Volumen() {
		this.volumen = 4/3*(Math.PI*Math.pow(getAltura(), 3));
		
	}

	@Override
	public String toString() {
		return "---Esfera---" + 
				"\nDescripcion: "+ getDescripcion()+
				"\nRadio: " + getAltura() +
				"\nArea Superficial: " + area +
				"\nVolumen: " + volumen;
	}

}

