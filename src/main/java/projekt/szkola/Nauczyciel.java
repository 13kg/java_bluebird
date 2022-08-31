package projekt.szkola;

import java.util.List;

public class Nauczyciel {
    private String imie;
    private String nazwisko;
    private List klasyNauczyciela;


    public Nauczyciel(String imie, String nazwisko,List klasyNauczyciela){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.klasyNauczyciela = klasyNauczyciela;
    }

    //Modyfikacja wyświetlania:
    @Override
    public String toString() {
        return "\n{" + imie + " " + nazwisko + ", " +  "klasy: "+ klasyNauczyciela +
                "}\n";
    }
}
