package UF2.registrenotes;

public class funcion6 {

    public double calcularMitjana(int[] arraynotasI) {
        int suma = 0;
        for (int i = 0; i < arraynotasI.length; i++) {
            suma = (int) (suma + arraynotasI[i]);
        }
        return suma/arraynotasI.length;
    }
}