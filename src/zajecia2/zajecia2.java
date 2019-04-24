package zajecia2;

import java.util.Random;

public class zajecia2 {

    public static void main(String[] args) {
        zad4();

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

            public static void zad5() {
            char a = 'a';
            int ascii = (int) a;
            System.out.println(ascii);
            char b = (char) ascii;
            System.out.println(b);
        }

    }


}