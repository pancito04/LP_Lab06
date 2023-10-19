package Ejercicio02;

public class Bicicleta implements ImpactoEcologico {
    private int distanciaRecorrida;
    private boolean esElectrica;

    public Bicicleta(int distanciaRecorrida, boolean esElectrica) {
        this.distanciaRecorrida = distanciaRecorrida;
        this.esElectrica = esElectrica;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Fórmula ficticia para el cálculo del DATO_ACTIVIDAD de una Bicicleta
        double datoActividad = esElectrica ? distanciaRecorrida*1.1 : distanciaRecorrida;
        // Factor de emisión para Bicicleta
        double factorEmision = 0.05;
        return datoActividad * factorEmision;
    }
}
