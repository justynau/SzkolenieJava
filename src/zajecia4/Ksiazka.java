package zajecia4;

public class Ksiazka {
    private String tytul;
    private String autor;
    private Integer iloscStron;
    private Integer iloscPrzeczytanychStron;

    public Ksiazka(String tytul, String autor, Integer iloscStron) {
        this.tytul = tytul;
        this.autor = autor;
        this.iloscStron = iloscStron;
        this.iloscPrzeczytanychStron = 0;
    }

    public void coToZaKsiazka() {
        System.out.println("Tutuł: " + tytul);
        System.out.println(" Autor: " + autor);
        System.out.println("Ilość stron: " + iloscStron);
        System.out.println("Ilość przeczytanych stron: " + iloscPrzeczytanychStron);
    }

    public void czytaj(Integer doPrzeczytania) {
        if (iloscStron - iloscPrzeczytanychStron >= doPrzeczytania) {
            iloscPrzeczytanychStron += doPrzeczytania;
            int doKonca = iloscStron - iloscPrzeczytanychStron;
            System.out.println("Do przeczytania pozostało " + doKonca);
        } else {
            System.out.println("Nie ma tyle stron");
        }
    }

    public void czyPrzeczytana() {
        if (iloscPrzeczytanychStron == iloscStron) {
            System.out.println("Przeczytano");
        } else {
            System.out.println("Czytaj dalej");
        }
    }

}
