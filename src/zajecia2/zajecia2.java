package zajecia2;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class zajecia2 {

    public static void main(String[] args) {
        zadanie6();

        // skopiwanie main i uruchomienie go z poziomu nowej klasy

        //System.out.println("hell789o");
    }

    public static void zad1() {

        int dzienTygodnia = 2;

        switch (dzienTygodnia) {
            case 1:
                System.out.println(" Dziś jest poniedziałek");
                break;
            case 2:
                System.out.println("Dziś jest wtorek");
                break;
            case 3:
                System.out.println("Dziś jest środa");
                break;
            case 4:
                System.out.println("Dziś jest czwartek");
                break;
            case 5:
                System.out.println("Dziś jest piątek");
                break;
            case 6:
                System.out.println("Dziś jest sobota");
                break;
            case 7:
                System.out.println("dziś jest niedziela");
            default:
                System.out.println("A to jest default");
        }
    }

    public static void zad2() {
        String miesiac = "Maj";


        switch (miesiac) {
            case "Kwiecień":
            case "Maj":
            case "Czerwiec":
                System.out.println("Wiosna, ach to Ty");
                break;
            case "Lipiec":
            case "Sierpień":
            case "Wrzesień":
                System.out.println("Lato");
                break;
            case "Październik":
            case "Listpad":
            case "Grudzień":
            case "Styczeń":
            case "Luty":
            case "Marzec":
                System.out.println("Zima");
                break;
            default:
                System.out.println("nie podałej miesiąca");


        }

    }

    public static void zad4() {
        int tab[] = new int[5];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(100);
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

        public static void zad5(){
        char a = 'a';
        int ascii = (int) a;
        System.out.println(ascii);
        char b = (char) ascii;
        System.out.println(b);

    }
    public static void zadanie6() {
        int liczba1;
        int liczba2;




        Scanner scan = new Scanner(System.in);   // wczytywanie zmiennych
        System.out.println("Podaj pierwszą liczbę:"); // przy pomocy Scanner
        liczba1 = scan.nextInt();
        System.out.println("Podaj drugą liczbę:");
        liczba2 = scan.nextInt();
//        operator = wej.next().charAt(0);  // pobieramy symbol operacji od użytkownika

        System.out.println("Podaj operator +,-,/,*:");
        char operator = scan.next().charAt(0);

        int odejmowanie = liczba1 - liczba2;
        int mnozenie = liczba1 * liczba2;

        switch (operator) {
            case '+':
                System.out.println("Wynik dodawania: " + (liczba1 + liczba2));
                break;
            case '-':
                System.out.println("Wynik: " + odejmowanie);
                break;
            case '*':
                System.out.println("Wynik: " + mnozenie);
                break;
            case '/':
                if (liczba2 != 0){
                    int dzielenie = liczba1 / liczba2;
                    System.out.println("Wynik: " + dzielenie);
                }
                    else {
                    System.out.println("Nie wolno dzielić przez 0");
                }
                break;



        }
    }


}