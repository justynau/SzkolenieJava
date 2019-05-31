package zajecia7;

public abstract class Pojazd {
    protected String numerRejestracyjny;
    protected String kolor;
    protected Integer cena;
    protected String marka;
    protected String model;
    protected Integer spalanie;
    protected String silnik;
    protected Integer stanZbiornikaPaliwa;
    protected Integer licznikPerzejechanychKilometrow;

    Pojazd(String numerRejestracyjny, String kolor, Integer cena, Integer spalanie, String silnik,
           Integer stanZbiornikaPaliwa, Integer licznikPerzejechanychKilometrow){
        this.numerRejestracyjny = numerRejestracyjny;
        this.kolor = kolor;
        this.cena = cena;
        this.spalanie = spalanie;
        this.silnik = silnik;
        this.stanZbiornikaPaliwa = stanZbiornikaPaliwa;
        this.licznikPerzejechanychKilometrow = licznikPerzejechanychKilometrow;
        }



}
//shift f6 - do zmiany nazwy