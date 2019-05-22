package zajecia4;

import java.util.Scanner;

public class Zajecia4 {

    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);   // wczytywanie zmiennych
        System.out.println("Podaj imię: "); // przy pomocy Scanner
        String imiie = scan.next();
        System.out.println("Podaj nazwisko: "); // przy pomocy Scanner
        String nazwisko = scan.next();
*/
      /*  Czlowiek osoba = new Czlowiek();
        osoba.imie = imiie;
        osoba.nazwisko = nazwisko;
        osoba.przedstawSie();*/

  /*    Czlowiek osba = new Czlowiek(imiie,nazwisko);
      osba.przedstawSie();
*/
        Ksiazka ksiazka = new Ksiazka("Tytuł","Grochola",100);
        ksiazka.coToZaKsiazka();
        ksiazka.czyPrzeczytana();
        ksiazka.czytaj(101);

        ksiazka.czytaj(20);

    }

}
