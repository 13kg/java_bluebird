package projekt.szkola;
//1a. Projekt - szkoła
//Szkoła powinna składać się z następujących klas Javy:

//1. Klasa
//2. Uczeń
//3. Nauczyciel

//Zakładamy, że jedna klasa ma jednego nauczyciela i n uczniów.
//Napisz definicje klas oraz podstawowe metody do obsługi naszej klasy - dodawanie i usuwanie uczniów (trzeba użyć konstruktora z parametrami)

import java.util.Collections;
import java.util.Comparator;

//Zdefiniowane klasy nie muszą posiadać wszystkich możliwych pół - wystarczy zdefiniować te które będą potrzebne do realizacji zadania
public class Main {
    public static void main(String[] args) {

        //Inicjalizuje obiekt "szkola" klasy ProjektSzkola
        ProjektSzkola szkola = new ProjektSzkola();

        //Tworzenie uczniów:
        Uczen uczen1 = new Uczen("Marek","Ast",Klasa.I,"Maria Straszna");
        Uczen uczen2 = new Uczen("Asia","Buła",Klasa.I,"Maria Straszna");
        Uczen uczen3 = new Uczen("Julia","Wiadro",Klasa.I,"Maria Straszna");

        Uczen uczen4 = new Uczen("Bolek","Łopata",Klasa.II,"Jan Maruda");
        Uczen uczen5 = new Uczen("Maja","Pszczoła",Klasa.II,"Jan Maruda");
        Uczen uczen6 = new Uczen("Gucio","Trzmiel",Klasa.II,"Jan Maruda");

        Uczen uczen7 = new Uczen("Graża","Warzywo",Klasa.III,"Jan Maruda");
        Uczen uczen8 = new Uczen("Jaś","Fasola",Klasa.III,"Jan Maruda");
        Uczen uczen9 = new Uczen("Ola","Fasola",Klasa.III,"Jan Maruda");

        //Tworzenie nauczycieli:
        Nauczyciel nauczyciel1 = new Nauczyciel("Maria","Straszna", Collections.singletonList("I,II"));
        Nauczyciel nauczyciel2 = new Nauczyciel("Jan","Maruda", Collections.singletonList("III"));

        //dodawanie uczniów do listy uczniowie:
        szkola.dodajUcznia(uczen1);
        szkola.dodajUcznia(uczen2);
        szkola.dodajUcznia(uczen3);
        szkola.dodajUcznia(uczen4);
        szkola.dodajUcznia(uczen5);
        szkola.dodajUcznia(uczen6);
        szkola.dodajUcznia(uczen7);
        szkola.dodajUcznia(uczen8);
        szkola.dodajUcznia(uczen9);

        //dodawanie nauczycieli do listy nauczyciele:
        szkola.dodajNauczyciela(nauczyciel1);
        szkola.dodajNauczyciela(nauczyciel2);

        //wyswietlanie list:
        szkola.pokazUczniow();
        szkola.pokazNauczycieli();

        //usuwanie uczniów/nauczycieli:
//        szkola.usunNauczyciela(nauczyciel1);
//        szkola.usunUcznia(uczen9);

        //zmiana klasy i nauczyciela dla danego ucznia:
        szkola.ustawKlaseInauczyciela(uczen1,Klasa.III,"Jan Maruda");

        //sortowanie listy uczniów wg klasy
        szkola.sortujPoKlasie();


       szkola.pokazUczniow();
       szkola.pokazNauczycieli();
    }
}
