
package UF2.registrenotes;

public class funcion5 {
    public double calcularMinim(int[] arraynotasI) {

        int min = (int) arraynotasI[0];
        for (int i = 1; i < arraynotasI.length; i++) {
        if (min > arraynotasI[i]) {
        min = (int) arraynotasI[i];
        }
        }
        return min;
        }
}