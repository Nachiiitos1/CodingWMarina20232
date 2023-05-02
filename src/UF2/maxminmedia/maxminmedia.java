package UF2.maxminmedia;
import java.util.Scanner;

public class maxminmedia {
    private double suma = 0;
    private double media = 0;
    private double minima = 0;
    private Scanner scanner1 = new Scanner(System.in);
    private double[] arraynotas = new double[5];
    private double max = arraynotas[0];

    public static void main(String[] args) {
        maxminmedia programa = new maxminmedia();
        programa.inici();
    }

    public void inici() {
        mostrarmenu();
        leerdatos();
        calcularmax();
        calcularmin();
        calcularmedia();
        imprimir();
    }

    private void calcularmedia() {
        for (int i = 0; i < arraynotas.length; i++) {
            suma = suma + arraynotas[i];
        }
        media = suma / arraynotas.length;
    }

    private void imprimir() {
        System.out.print("nota maxima " + max + " nota minima " + minima + " nota media " + media);
    }

    public void mostrarmenu() {
        System.out.println("Porfavor inserte 5 numeros");
    }

    public void leerdatos() {
        for (int i = 0; i < arraynotas.length; i++) {
            arraynotas[i] = scanner1.nextDouble();
        }
    }

    public void calcularmax() {

        for (int i = 0; i < arraynotas.length; i++) {
            if (arraynotas[i] > max)
                max = arraynotas[i];
        }
    }
    public void calcularmin() {
        minima = arraynotas[0];
        for (int i = 0; i < arraynotas.length; i++) {
            if (arraynotas[i] < minima)
                minima = arraynotas[i];
        }
    }
}
