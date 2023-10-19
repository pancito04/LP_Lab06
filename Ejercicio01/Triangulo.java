package Ejercicio01;

import java.lang.Math;
public class Triangulo extends FiguraBidimensional{
	private double resultado;
	public Triangulo(double base, double altura, String descripcion) {
		super(base, altura, descripcion);
	}

	@Override
	public void area() {
		this.resultado = (getBase()*getAltura())/2;
		
	}

	@Override
	public String toString() {
		return "---Triangulo---"+ 
				"\nTipo: " + getDescripcion()+
				"\nBase: " + getBase() + 
				"\nAltura: " + getAltura()+
				"\nresultado:" + resultado  
				 ;
	}

}