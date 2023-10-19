package Ejercicio01;

public abstract class FiguraBidimensional extends Figura{

	public abstract void area();

	public FiguraBidimensional(double altura, String descripcion) {
		super(altura, descripcion);
	}

	public FiguraBidimensional(double base, double altura, String descripcion) {
		super(base, altura, descripcion);
	}
}
