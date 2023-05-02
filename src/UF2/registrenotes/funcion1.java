package UF2.registrenotes;

public class funcion1 {
    public double calcularMaxim(double[] arraynotasD) {
        double max = arraynotasD[0];
        for (int i = 1; i < arraynotasD.length; i++) {
            if (max < arraynotasD[i]) {
                max = arraynotasD[i];
            }
        }
        return max;
    }}

