package UF2.PrediccioPersona;

import java.util.Scanner;

public class PrediccioPersona {
  private Scanner s = new Scanner(System.in);
  private String equipFutbol = "";
  private String llenguatgeProgramacio = "";
  private int numSort = 0;
  private int edat=0;
  private String nom = "";
  private String mesNaixement = "";

  public static void main(String args[]) {
    PrediccioPersona programa = new PrediccioPersona();
    programa.inicio();
  }

  public void inicio() {
    mesnacimiento();
    nombre();
    edad();
    prediccio();
    imprimirfinal();
  }
  private void edad() {
    System.out.print("\n");
    System.out.print("Per acabar, quants anys tens?\n");
    //recollim la dada a la variable edat
    edat = s.nextInt();

    System.out.print("\n\n");
  }

  private void mesnacimiento() {
    //demanem a l'usuari el mes en què va nèixer
    System.out.print("Escriu el mes en què vas nèixer.");
    System.out.print("\n");
    System.out.print("Gener\tFebrer\tMarc\n");
    System.out.print("Abril\tMaig\tJuny\n");
    System.out.print("Juliol\tAgost\tSetembre\n");
    System.out.print("Octubre\tNovembre\tDesembre");
    System.out.print("\n\n");

    mesNaixement = s.nextLine();
  }

  private void nombre() {
    System.out.print("\n");
    System.out.print("Com et dius?\n");

    nom = s.nextLine();
  }
  private void prediccio() {
    if (mesNaixement.equals("Gener") || mesNaixement.equals("gener")) {
      numSort = edat * 3/2;
      equipFutbol = "Bayern de Munich";
      llenguatgeProgramacio = "C++";
    }
    else if (mesNaixement.equals("Febrer")|| mesNaixement.equals("febrer")){
      numSort = edat - 4;
      equipFutbol = "Atlético de Madrid";
      llenguatgeProgramacio = "Python";
    }
    else if (mesNaixement.equals("Marc")|| mesNaixement.equals("marc")){
      numSort = edat / 2;
      equipFutbol = "Chelsea";
      llenguatgeProgramacio = "JavaScript";
    }
    else if (mesNaixement.equals("Abril")|| mesNaixement.equals("abril")){
      numSort = edat % 4;
      equipFutbol = "Manchester city";
      llenguatgeProgramacio = "Python si o si";
    }
    else if (mesNaixement.equals("Maig")|| mesNaixement.equals("maig")){
      numSort = edat * 3/6;
      equipFutbol = "Liverpool";
      llenguatgeProgramacio = "React";
    }
    else if (mesNaixement.equals("Juny")|| mesNaixement.equals("juny")){
      numSort = edat + edat;
      equipFutbol = "Real Madrid";
      llenguatgeProgramacio = "C#";
    }
    else if (mesNaixement.equals("Juliol")|| mesNaixement.equals("juliol")){
      numSort = edat * edat / 5;
      equipFutbol = "BVB";
      llenguatgeProgramacio = "Swift";
    }
    else if (mesNaixement.equals("Agost")|| mesNaixement.equals("agost")){
      numSort = edat * 1/2 * edat;
      equipFutbol = "FCB";
      llenguatgeProgramacio = "Java";
    }
    else if (mesNaixement.equals("Setembre")|| mesNaixement.equals("setembre")){
      numSort = edat / edat;
      equipFutbol = "Juve";
      llenguatgeProgramacio = "PHP";
    }
    else if (mesNaixement.equals("Octubre")|| mesNaixement.equals("octubre")){
      numSort = edat * 4 / 3;
      equipFutbol = "PSG";
      llenguatgeProgramacio = "R";
    }
    else if (mesNaixement.equals("Novembre")|| mesNaixement.equals("novembre")){
      numSort = edat % 2 + 23;
      equipFutbol = "Sevilla CF";
      llenguatgeProgramacio = "Go";
    }
    else if (mesNaixement.equals("Desembre")|| mesNaixement.equals("desembre")){
      numSort = (edat + edat) / 2;
      equipFutbol = "Manchester United";
      llenguatgeProgramacio = "Ruby";
    }
    else {
      numSort = 0;
      equipFutbol = "no tinc equip de fútbol perquè m'he equivocat escrivint el meu mes d'aniversari";
      llenguatgeProgramacio = "no tinc llenguatge de programació preferit perquè m'he equivocat escrivint el meu mes d'aniversari";
      System.out.print("No he entès el que m'has dit!!!!!!!!!!!!\n\n");
    }
  }
  private void imprimirfinal() {
    System.out.print("------------------------------------------------\n");

    System.out.print("Un plaer conèixer-te " + nom + ". Amb les dades que m'has donat, mira què he arribat a saber de tu... \n");
    System.out.print("\n\n");

    System.out.print(">>> El teu número de la sort és el " + numSort + "!");
    System.out.print("\n\n");

    System.out.print(">>> El teu equip de fútbol preferit, encara que no ho diguis en veu alta, és el " + equipFutbol + ".");
    System.out.print("\n\n");

    System.out.print(">>> El teu llenguatge de programació més estimat serà " + llenguatgeProgramacio + "!");
    System.out.print("\n\n");

    System.out.print("Torna quan vulguis!\n");
    System.out.print("------------------------------------------------\n\n\n");

  }
}