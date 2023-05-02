package UF2.MitjanaMaxima;

public class CalculsArrayReals {
    public double calcularMitjana() {
        CalculsArrayReals programa = new CalculsArrayReals();
        programa.leerarray();
        return 0;
    }

    public static double[] leerarray(double[] arrayA) {
        double total = 0;
        for (int i = 0; i < arrayA.length; i++) {
            total = total + arrayA[i];
        }
        double mitjanaA = total / arrayA.length;
        return mitjanaA;
    }
}
