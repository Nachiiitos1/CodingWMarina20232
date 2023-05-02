package UF2.registrenotes;

public class funcion4 {
    public int calcularMaxim(int[] arraynotasI) {
        double max = arraynotasI[0];
        for (int i = 1; i < arraynotasI.length; i++) {
            if (max < arraynotasI[i]) {
                max = arraynotasI[i];
            }
        }
        return (int) max;
    }}

