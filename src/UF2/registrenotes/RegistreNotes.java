package UF2.registrenotes;
import java.util.Scanner;
public class RegistreNotes {
    private double[] arraynotasD = new double[8];
    private int[] arraynotasI = new int[8];
    private Scanner scanner1 = new Scanner(System.in);
    public static void main(String[] args) {

        RegistreNotes programa = new RegistreNotes();
        programa.inici();
    }

    public void inici() {
        escanear();;

    }

    private void escanear() {

        System.out.println("Double (D) o Int (I)?");
        String doubleorint= scanner1.nextLine();
        if (doubleorint.equalsIgnoreCase("D")){
            System.out.println("Inserta todas las notas, maximo 8");
            doble();
        } else if (doubleorint.equalsIgnoreCase("I")) {
            System.out.println("Inserta todas las notas, maximo 8");
            integer();
        }
    }

    private void integer() {
        for (int i = 0; i < arraynotasI.length; i++) {
            arraynotasI[i] = scanner1.nextInt();
        }
        funcion4 pabliño4 = new funcion4();
        funcion5 pabliño5 = new funcion5();
        funcion6 pabliño6 = new funcion6();
        int max = pabliño4.calcularMaxim(arraynotasI);
        int min = (int) pabliño5.calcularMinim(arraynotasI);
        int mitjana = (int) pabliño6.calcularMitjana(arraynotasI);

        System.out.println("La nota màxima és " + max + ".");
        System.out.println("La nota mínima és " + min + ".");
        System.out.println("La mitjana de les notes és " + mitjana + ".");
    }


    private void doble() {
        for (int i = 0; i < arraynotasD.length; i++) {
            arraynotasD[i] = scanner1.nextDouble();
        }
        funcion1 pabliño = new funcion1();
        funcion2 pabliño2 = new funcion2();
        funcion3 pabliño3 = new funcion3();
        double max = pabliño.calcularMaxim(arraynotasD);
        double min = pabliño2.calcularMinim(arraynotasD);
        double mitjana = pabliño3.calcularMitjana(arraynotasD);

        System.out.println("La nota màxima és " + max + ".");
        System.out.println("La nota mínima és " + min + ".");
        System.out.println("La mitjana de les notes és " + mitjana + ".");
    }


}
