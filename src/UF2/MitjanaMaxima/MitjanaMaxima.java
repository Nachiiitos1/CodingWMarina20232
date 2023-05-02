package UF2.MitjanaMaxima;

public class MitjanaMaxima {
    public static void main(String[] args) {
        MitjanaMaxima calc = new MitjanaMaxima();
        System.out.println("1r vector");
        double[] arrayA = new double[6];
        arrayA = calc.leerArray(arrayA);
        System.out.println("2ndo vector");
        double[] arrayB = new double[6];
        arrayB = calc.leerArray(arrayB);

        MitjanaMaxima programa = new MitjanaMaxima();
        programa.inici();
    }

    public void inici() {
        double[] arrayA = {2, 10.5, 6.3, 4.9, 0, 7.1, 8.3};
        double[] arrayB = {9.4, 6.0, 2.2, 1.0, 8.1};
        //Per cridar els m todes cal inicialitzar la classe que els cont 
        CalculsArrayReals calculador = new CalculsArrayReals();
        //Un cop fet, cal cridar−los usant com a prefix l’identificador
        double mitjanaA = calculador.calcularMitjana();
        double mitjanaB = calculador.calcularMitjana();
        if (mitjanaA > mitjanaB) {
            System.out.println("arrayA té una mitjana més alta.");
        }
        else if (mitjanaA < mitjanaB) {
            System.out.println("arrayB té una mitjana més alta.");
        }
        else {
            System.out.println("Les dues mitjanes són iguals!");
        }
    }
}
