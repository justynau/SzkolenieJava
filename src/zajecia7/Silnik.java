package zajecia7;

public abstract class Silnik {
    protected String silnikBenzynowy;
    protected String silnikSpalinowy;
    protected String  silnikElektryczny;

    Silnik(String silnikBenzynowy, String silnikSpalinowy, String silnikElektryczny) {
        this.silnikBenzynowy = silnikBenzynowy;
        this.silnikSpalinowy = silnikSpalinowy;
        this.silnikElektryczny = silnikElektryczny;
    }


}



