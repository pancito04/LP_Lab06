package Ejercicio01;

public class Principal {

	public static void main(String[] args) {
		Figura[] figuras = new Figura[5];

		figuras[0] = new Cuadrado(5.0, "Cuadrado");
		figuras[1] = new Triangulo(4.0, 3.0, "Triángulo");
		figuras[2] = new Circulo(2.5, "Círculo");
		figuras[3] = new Tetraedro(6.0, "Tetraedro");
		figuras[4] = new Cubo(4.0, "Cubo");

		for (Figura figura : figuras) {
			if (figura instanceof FiguraBidimensional) {
				FiguraBidimensional figuraBidimensional = (FiguraBidimensional) figura;
				figuraBidimensional.area();
				System.out.println(figuraBidimensional.toString());
			} else if (figura instanceof FiguraTridimensional) {
				FiguraTridimensional figuraTridimensional = (FiguraTridimensional) figura;
				figuraTridimensional.area();
				figuraTridimensional.Volumen();
				System.out.println(figuraTridimensional.toString());
			}
			System.out.println();
		}
	}

}