package UF2.registrenotes;

public class funcion3 {

    public double calcularMitjana(double[] arraynotasD) {
        double suma = 0;
        for (int i = 0; i < arraynotasD.length; i++) {
            suma = suma + arraynotasD[i];
        }
        return suma/arraynotasD.length;
    }
}