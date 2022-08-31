package system.ksiegowy;

import java.util.ArrayList;
import java.util.List;

public class SystemKsiegowy {

    //utworzenie listy pracowników "pracownicy":
    private List<Pracownik> pracownicy = new ArrayList<>();

    //metoda dodająca pracownika do listy:
    public void dodajPracownika(Pracownik pracownik){
        pracownicy.add(pracownik);
    }

    //metoda usuwająca pracownika z listy:
    public void usunPracownika(Pracownik pracownik){
        pracownicy.remove(pracownik);
    }

    //metoda znieniająca teamlidera:
    public void ustawTL(Pracownik edytowanyPracownik,TeamLeaderzy nowytlid) {
        int szukanyIndex = pracownicy.indexOf(edytowanyPracownik); //szukam indeksu w liscie
        Pracownik szukanyPracownik = pracownicy.get(szukanyIndex); // pobieram pracownika z list
        szukanyPracownik.zmienTL(nowytlid); // za pomocą metody zmienTL zmienia parametr tLid na nowy nowytlid
    }

    //metoda dodajaca urlop do listy
    public void dodajUrlopPracownikowi(Pracownik edytowanyPracownik, String data, long dni){
        int szukanyIndex = pracownicy.indexOf(edytowanyPracownik); //szukam indeksu w liscie
        Pracownik szukanyPracownik = pracownicy.get(szukanyIndex);
        szukanyPracownik.dodajUrlop(data, dni);

    }

    //metoda usuwajaca urlop z listy
    public void usunUrlopPracownikowi(Pracownik edytowanyPracownik, String data, long dni){
        int szukanyIndex = pracownicy.indexOf(edytowanyPracownik); //szukam indeksu w liscie
        Pracownik szukanyPracownik = pracownicy.get(szukanyIndex);
        szukanyPracownik.usunUrlop(data, dni);
    }

    //metoda wyswietlająca listę pracownikow:
    public void pokazPracownikow() {
        System.out.println("Lista pracownikow: \n" + pracownicy);
    }


    public List<Pracownik> getPracownicy() {
        return pracownicy;
    }
}