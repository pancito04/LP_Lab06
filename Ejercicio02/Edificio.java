package Ejercicio02;

public class Edificio implements ImpactoEcologico {
    private double area;
    private double consumoEnergia;

    public Edificio(double area, double consumoEnergia) {
        this.area = area;
        this.consumoEnergia = consumoEnergia;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Fórmula ficticia para el cálculo del DATO_ACTIVIDAD de un Edificio
        double datoActividad = area * consumoEnergia;
        // Factor de emisión para Edificio
        double factorEmision = 0.5;
        return datoActividad * factorEmision;
    }
}
