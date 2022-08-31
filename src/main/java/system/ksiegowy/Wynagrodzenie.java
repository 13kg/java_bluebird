package system.ksiegowy;

public class Wynagrodzenie {



    private double brutto;
    private double netto ;

    //konstruktor klasy system.ksiegowy.Wynagrodzenie przypisuje pole netto do parametru wypłata i wywołuje metode policzBrutto
    public Wynagrodzenie(double wyplata) {
        this.netto = wyplata;
        this.policzBrutto();
    }

    //metoda licząca kwotę brutto
    private void policzBrutto() {
        this.brutto = this.netto * 1.23;
    }

    public double getBrutto() {
        return brutto;
    }


    //modyfikacja wyświetlania
    @Override
    public String toString() {
        return "netto: " + netto +", brutto: " +brutto;
    }
}

