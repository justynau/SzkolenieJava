package zajecia4;

public class Czlowiek {

    private String imie;
    private String nazwisko;

    public Czlowiek(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void przedstawSie() {
        System.out.println("Nazywam się " + imie +" " + nazwisko);
    }
}
