package UF2.notasmarina;

import java.util.Scanner;

public class notasmarina {
    private Scanner scanner1 = new Scanner(System.in);
    private double[] arraynotas = new double[5];
    public static void main(String[] args) {
        notasmarina programa = new notasmarina();
        programa.inici();
    }

    public void inici() {
        mostrarmenu();
        leerdatos();
        determinarnota();
    }

    private void determinarnota() {
        for (int i = 0; i < arraynotas.length; i++){
            if (arraynotas[i] >= 9) {
                System.out.println("Excelente");
            } else if (arraynotas[i]>=6.5) {
                System.out.println("Notable");
            } else if (arraynotas[i]>=5) {
                System.out.println("Aprobado");
            }else {
                System.out.println("Suspendido");
            }
        }
    }

    private void mostrarmenu() {
        System.out.println("Inserte su nota ");
    }
    public void leerdatos() {
        for (int i = 0; i < arraynotas.length; i++) {
            arraynotas[i] = scanner1.nextDouble();
        }
    }

}