package Actividad01;

public class EmpleadoAsalariado extends Empleado{
	private double salarioSemanal;
	public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario ) {
		super(nombre, apellido, nss);
		setSalarioSemanal(salario); // valida y almacena el salario
	}
	public double obtenerMontoPago() {
		return getSalarioSemanal();
	}
	public double getSalarioSemanal() {
		return salarioSemanal;
	}
	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}
	@Override
	public String toString() {
		return "EmpleadoAsalariado [salarioSemanal=" + salarioSemanal + "]";
	}

}