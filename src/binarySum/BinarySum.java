package binarySum;

import java.util.Scanner;

public class BinarySum {
    public static void main(String[] args) {
        Scanner utente = new Scanner(System.in);
        System.out.println("Questo programma somma 2 valori binari");
        System.out.println("Inserisci il numero binario più lungo");
        String primoNum = utente.nextLine();
        System.out.println("Inserisci il secondo numero binario");
        String secondoNum = utente.nextLine();
        int primaLungh = primoNum.length();
        int secondaLungh = secondoNum.length();
        int differenza = Math.abs(primaLungh - secondaLungh);

        int j = 1;
        while (j <= differenza) {
            if (primaLungh < secondaLungh) {
                primoNum = "0" + secondoNum;
            } else {
                secondoNum = "0" + secondoNum;
                j = j + 1;
            }
        }
        int i = primoNum.length() - 1;
        String risultato = "";
        int riporto = 0;
        while (i >= 0) {

            int bit1 = primoNum.charAt(i) - '0';
            int bit2 = secondoNum.charAt(i) - '0';
            int somma = bit1 + bit2 + riporto;
            riporto = somma / 2;
            int resto = somma % 2;
            risultato = resto + risultato;
            i = i - 1;

        }
        if (riporto == 1) {
            risultato = riporto + risultato;
        }
        utente.close();
        System.out.println("Il risultato è : " + risultato);
        System.out.println("I numeri inseriti sono  " + primoNum + "   " + secondoNum);

    }

}
