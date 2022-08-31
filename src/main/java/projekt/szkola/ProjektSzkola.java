package projekt.szkola;

import system.ksiegowy.Pracownik;
import system.ksiegowy.TeamLeaderzy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProjektSzkola {

    //lista uczniów:
    List<Uczen> uczniowie = new ArrayList<>();

    //lista nauczycieli:
    List<Nauczyciel> nauczyciele = new ArrayList<>();

    //metoda dodająca ucznia do listy:
    public void dodajUcznia(Uczen uczen) {
        uczniowie.add(uczen);
    }
    //metoda dodająca nauczyciela do listy:
    public void dodajNauczyciela(Nauczyciel nauczyciel){
        nauczyciele.add(nauczyciel);
    }


    //metody wyswietlające listy:
    public void pokazUczniow(){
        System.out.println("Lista uczniow: \n" + uczniowie);
    }
    public void pokazNauczycieli(){
        System.out.println("Lista nauczycieli: \n" + nauczyciele);
    }


    //metody usuwające uczniów/nauczycieli z ich list:
    public void usunUcznia(Uczen uczen){
        uczniowie.remove(uczen);
    }
    public void usunNauczyciela(Nauczyciel nauczyciel){
        nauczyciele.remove(nauczyciel);
    }

    //metoda która zmienia klasę i nauczyciela danemu uczniowi
    public void ustawKlaseInauczyciela(Uczen edytowanyUczen, Klasa nowaKlasa, String nowyNauczyciel) {
        int szukanyIndexUcznia = uczniowie.indexOf(edytowanyUczen); //szukam indeksu w liscie
        Uczen szukanyUczen = uczniowie.get(szukanyIndexUcznia); // pobieram ucznia z listy
        szukanyUczen.zmienKlaseInauczyciela(nowaKlasa, nowyNauczyciel); // za pomocą metody zmienTL zmienia uczniowi parametry klasy i nauczyciela
    }

    //metoda sortująca listę uczniów wg klasy
    public void sortujPoKlasie(){
        Collections.sort(uczniowie, Comparator.comparing(Uczen::getKlasa));
        uczniowie.forEach(System.out::println);
    }






}
