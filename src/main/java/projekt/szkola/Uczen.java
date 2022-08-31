package projekt.szkola;

import system.ksiegowy.TeamLeaderzy;

public class Uczen {

    private String imie;
    private  String nazwisko;
    private  Klasa klasa;
    private  String nauczyciel;


    public Uczen(String imie, String nazwisko, Klasa klasa,String nauczyciel){

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.klasa = klasa;
        this.nauczyciel = nauczyciel;
    }

    //metoda która przypisuje parametry klasy i nauczyciela do pól, potrzebne do zmiany tych parametrów
    public void zmienKlaseInauczyciela(Klasa nowaKlasa, String nowyNauczyciel) {
        this.klasa = nowaKlasa;
        this.nauczyciel = nowyNauczyciel;
    }

    //getter klasy, potrzebny do metody sortującej listę uczniów
    public Klasa getKlasa() {
        return klasa;
    }

    //modyfikacja wyświetlania
    @Override
    public String toString() {
        return "\n{"  + imie + " " + nazwisko + ", klasa:" + klasa + ", nauczyciel: " + nauczyciel +
                "}\n";
    }

}
