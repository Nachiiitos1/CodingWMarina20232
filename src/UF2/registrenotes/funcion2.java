
package UF2.registrenotes;

public class funcion2 {
    public double calcularMinim(double[] arraynotasD) {

        double min = arraynotasD[0];
        for (int i = 1; i < arraynotasD.length; i++) {
        if (min > arraynotasD[i]) {
        min = arraynotasD[i];
        }
        }
        return min;
        }
}