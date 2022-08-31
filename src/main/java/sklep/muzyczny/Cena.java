package sklep.muzyczny;

public class Cena {

    private double cenaEuro;
    private double cenaPln;
    private double przelicznik = 0.21;

    public Cena(double cenaPln) {
        this.cenaPln = cenaPln;
        this.policzEuro();

    }

    private void policzEuro() {this.cenaEuro = this.cenaPln * przelicznik; }

    double getPrzelicznik() {
        return this.przelicznik;
    }

    @Override
    public String toString() {
        return "cena: "  + cenaPln + "zł, " +cenaEuro +"€";
    }

}