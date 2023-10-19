package Ejercicio02;

public class Auto implements ImpactoEcologico {
    private double kilometraje;
    private double emisionesCO2;

    public Auto(double kilometraje, double emisionesCO2) {
        this.kilometraje = kilometraje;
        this.emisionesCO2 = emisionesCO2;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Fórmula ficticia para el cálculo del DATO_ACTIVIDAD de un Auto
        double datoActividad = kilometraje * emisionesCO2;
        // Factor de emisión para Auto
        double factorEmision = 0.3;
        return datoActividad * factorEmision;
    }
}
