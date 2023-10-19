package Ejercicio02;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<ImpactoEcologico> objetosImpacto = new ArrayList<>();

        Edificio edificio = new Edificio(1000, 500);
        Auto auto = new Auto(10000, 0.2);
        Bicicleta bicicleta = new Bicicleta(5000, false);
        Bicicleta bicicleta2 = new Bicicleta(5000, true);
        objetosImpacto.add(edificio);
        objetosImpacto.add(auto);
        objetosImpacto.add(bicicleta);
        objetosImpacto.add(bicicleta2);
        for (ImpactoEcologico objeto : objetosImpacto) {
            System.out.println(objeto.getClass().getSimpleName() + ":");
            System.out.println("Impacto Ecológico: " + objeto.obtenerImpactoEcologico() + " GEI");
            System.out.println();
        }
    }
}