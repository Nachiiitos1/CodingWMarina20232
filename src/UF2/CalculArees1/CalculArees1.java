package UF2.CalculArees1;
import java.util.Scanner;
public class CalculArees1 {
    private static String figura = "";
    private double area = 0;
    private Scanner scanner = new Scanner(System.in);
    public static void main (String args[]) {
        CalculArees1 programa = new CalculArees1();
        programa.inici();
    }
    public void inici() {
        menu();
        LeerFigura();
        CalcularFigura();
    }
    private void menu() {
        System.out.println("");
    }
    private void LeerFigura() {
        System.out.println("De que figura quieres ver el area???");
        System.out.println("Tienes las siguientes opciones: triangulo, cuadrado, rectangulo, trapezio, rombo, paralelograma o circulo");
        figura = scanner.nextLine();
    }
    private void CalcularFigura() {
        if (figura.equalsIgnoreCase("Triangulo")) {
            Triangulo(23.0,8.0);
        }
        else if (figura.equalsIgnoreCase("Triángulo")) {
            Triángulo(23.0,8.0);}
        else if (figura.equalsIgnoreCase("Quadrado")) {
            Cuadrado(37.0);
        }
        else if (figura.equalsIgnoreCase("Rectangulo")) {
            Rectangulo(68.0,39.0);
        }
        else if (figura.equalsIgnoreCase("Trapezio")) {
            Trapezio(16.0,5.0,35.0);
        }
        else if (figura.equalsIgnoreCase("Rombo")) {
            Rombo(75.0,30.0);
        }
        else if (figura.equalsIgnoreCase("Paralelograma")) {
            Paralelograma(45.0,13.0);
        }
        else if (figura.equalsIgnoreCase("Circulo")) {
            Circulo(45.0,13.0);
        }
        else {
            System.out.println("Reintentalo porfavor: ");
            inici();
            return;
        }
        imprimir();
    }
    public void Triangulo(double b, double h){
        area = (b*h)/2;

    }
    public void Cuadrado(double r){
        area = Math.pow(r, 2);

    }
    public void Rectangulo(double a, double b){
        area = a*b;

    }
    public void Trapezio(double b, double h, double a){
        area = (a*b*h)/2;

    }
    public void Rombo(double Dm, double dm){
        area = (Dm*dm)/2;

    }
    public void Paralelograma(double b, double h) {
        area = b*h;
    }
    public void Circulo(double b, double h){
        area = b*h;

    }
    private void imprimir() {
        System.out.println("El area de " + figura + " es " + area);
    }


    private void Triángulo(double v, double v1) {
        area = (v*v1)/2;
    }
    }