//2a. Projekt - biblioteka
//Biblioteka składa się z następujących klas

//1. Dział
//2. Regał
//3. Książka

//Zakładamy, że biblioteka posiada n działów, n regałów w każdym dziale i n książek na każdym regale.

//Napisz definicje klas oraz podstawowe metody do obsługi naszej biblioteki - dodawanie usuwanie regałów i książek
// (działy można zrobić chwilowo na sztywno bez możliwości dodawania nowych). (trzeba użyć konstruktora z parametrami)
//Zdefiniowane klasy nie muszą posiadać wszystkich możliwych pół - wystarczy zdefiniować te które będą potrzebne do realizacji zadania


package biblioteka;

public class Main {
    public static void main(String[] args) {

        Biblioteka biblioteka = new Biblioteka();

        Ksiazka ksiazka1 = new Ksiazka("Morderstwo w amoku","Hans Apfelstrudel","A", Dzial.KRYMINAŁY);
        Ksiazka ksiazka2 = new Ksiazka("Miłość i zdrada","Maria Nienormalna","B", Dzial.ROMANSE);
        Ksiazka ksiazka3 = new Ksiazka("Czarne Dziury","Albert Sztain","C", Dzial.POPULARNO_NAUKOWE);

        Regal regal1 = new Regal("A");
        Regal regal2 = new Regal("B");
        Regal regal3 = new Regal("C");

        biblioteka.dodajKsiazke(ksiazka1);
        biblioteka.dodajKsiazke(ksiazka2);
        biblioteka.dodajKsiazke(ksiazka3);

        biblioteka.dodajRegal(regal1);
        biblioteka.dodajRegal(regal2);
        biblioteka.dodajRegal(regal3);

        biblioteka.wyswietlKsiazki();
        biblioteka.wyswietlRegaly();
    }




}
