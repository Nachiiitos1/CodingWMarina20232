package UF2.mastermind;

import java.util.Scanner;

//Un programa per jugar al MasterMind.
public class mastermind {
    //Constants
    public final static char TOT_CORRECTE = '0';
    public final static char MALA_POSICIO = 'X';
    public final static char INCORRECTE = '-';
    public final int LONG_SECRET = 3;
    public final static String abc = "abcdefghijklmnopqrstuvwxyz";
    public static String secret = "";
    public static String resposta = "";

    //Mètodes associats al problema general
    public static void main(String[] args) {
        //desenvolupeu el codi d'aquesta funció
        mastermind programa = new mastermind();
        programa.inici();
    }


    public void inici() {
        //desenvolupeu el codi d'aquesta funció
        boolean end = false;
        while (!end){
            preguntarResposta();
            end = resoldreResposta(secret, resposta);
        }
    }


    //Mètodes associats al primer nivell de descomposició
    //Param. entrada: no tiene
    //Param. sortida: return string res
    public String generarParaulaSecreta() {
        String res = "";
        for (int i = 0; i < LONG_SECRET; i++) {
            res = res + generarLletraAleatoria();
        }
        return res;
    }

    //Param. entrada: cap, tot s’obté del teclat
    // Param. sortida: la paraula de resposta (un String)
    public String preguntarResposta() {
        //desenvolupeu el codi d'aquesta funció
        System.out.println("Escribe la palabra secreta");
        Scanner lector = new Scanner(System.in);
        resposta = lector.nextLine();
        return resposta;
    }

    //Param. entrada:  string secret, string resposta
    //Param. sortida: return boolean fi
    public boolean resoldreResposta(String secret, String resposta) {
        String res = generarPista(secret, resposta);
        boolean fi = false;
        System.out.print("La resposta és [" + res + "].");
        if (resposta.equals(secret)){
            System.out.println("Has encertat!");
            fi = true;
        } else {
            System.out.println("Continua intentant−ho!");
        }
        return fi;
    }

    //Mètodes associats al segon nivell de descomposició
    //Param. entrada: no tiene
    //Param. sortida: return char abc
    public char generarLletraAleatoria() {
        long nano = System.nanoTime();
        int index = (int) (nano % abc.length());
        return abc.charAt(index);
    }

    //Param. entrada: String resposta
    //Param. sortida:return false y true
    public boolean comprovarResposta(String resposta) {
        if (resposta.length() != LONG_SECRET) {
            return false;
        }
        for (int i = 0; i < resposta.length(); i++) {
            char c = resposta.charAt(i);
            if ( -1 == abc.indexOf(c)){
                return false;
            }
        }
        return true;
    }

    //Param. entrada:String s string r
    //Param. sortida: return string res
    public String generarPista(String s, String r) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char charSecret = s.charAt(i);
            char charResposta = r.charAt(i);
            if (charSecret == charResposta) {
                res = res + TOT_CORRECTE;
            }
            else if (s.indexOf(charResposta) != - 1){
                res = res + MALA_POSICIO;
            }
            else {
                res = res + INCORRECTE;
            }
        }
        return res;
    }
}