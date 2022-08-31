package system.ksiegowy;//[10/06/2022 12:00] Bartłomiej Kulig
//4a. Projekt - system księgowySystem składa się z następujących klas:
// 1. system.ksiegowy.Pracownik
// 2. system.ksiegowy.Stanowisko (definiujemy TL i Dev)
// 3. system.ksiegowy.Wynagrodzenie (netto i brutto - metoda wyliczenia dowolna)
// Kazdy pracownik ma 1 stanowisko, każdy dev ma 1 TLa i 1 TL ma n devsow
// Napisz definicje klas oraz podstawowe metody do obsługi systemu - dodawanie i usuwanie pracownikow oraz przywiązywanie ich do TLa
// Zdefiniowane klasy nie muszą posiadać wszystkich możliwych pół - wystarczy zdefiniować te które będą potrzebne do realizacji zadania
// Kalendarz urlopowy (wywalic enumowych team liderow) Mapy z listami? wbudowane typy czasowe local date i kalendarze


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String args[]) {

        //Inicjalizuje obiekt "system" klasy SystemKsięgowy
        SystemKsiegowy system = new SystemKsiegowy();

        //Tworzenie pracowników;
        Pracownik teamLeader1 = new Pracownik(1,"Jan","Fasola", TeamLeaderzy.N_D, Stanowisko.TEAM_LEADER, new Wynagrodzenie(3600));
        Pracownik teamLeader2 = new Pracownik(2,"Baba","Jaga", TeamLeaderzy.N_D, Stanowisko.TEAM_LEADER,new Wynagrodzenie(4600));

        Pracownik pracownik1 = new Pracownik(3,"Zosia", "Parówa", TeamLeaderzy.JAN_FASOLA, Stanowisko.DEVELOPER,new Wynagrodzenie(1823));
        Pracownik pracownik2 = new Pracownik(4,"Marek", "Belka", TeamLeaderzy.BABA_JAGA, Stanowisko.DEVELOPER,new Wynagrodzenie(1200));
        Pracownik pracownik3 = new Pracownik(5,"Kasia", "Zioło", TeamLeaderzy.JAN_FASOLA, Stanowisko.DEVELOPER,new Wynagrodzenie(1554));
        Pracownik pracownik4 = new Pracownik(6,"Paweł", "Gaweł", TeamLeaderzy.JAN_FASOLA, Stanowisko.DEVELOPER,new Wynagrodzenie(1700));
        Pracownik pracownik5 = new Pracownik(7,"Jarek", "Kaczor", TeamLeaderzy.BABA_JAGA, Stanowisko.DEVELOPER,new Wynagrodzenie(2200));
        Pracownik pracownik6 = new Pracownik(8,"Beata", "Buła", TeamLeaderzy.BABA_JAGA, Stanowisko.DEVELOPER,new Wynagrodzenie(2400));

        //Dodawanie pracowników do listy:
        system.dodajPracownika(teamLeader1);
        system.dodajPracownika(teamLeader2);

        system.dodajPracownika(pracownik1);
        system.dodajPracownika(pracownik2);
        system.dodajPracownika(pracownik3);
        system.dodajPracownika(pracownik4);
        system.dodajPracownika(pracownik5);
        system.dodajPracownika(pracownik6);

        //wyswietlenie listy
        system.pokazPracownikow();

        //zmiana TL:
        system.ustawTL(pracownik3, TeamLeaderzy.BABA_JAGA);

        //usuwanie pracownika:
        system.usunPracownika(pracownik6);

        system.pokazPracownikow();

        //dodawanie urlopu
        system.dodajUrlopPracownikowi(teamLeader1,"2022-08-09",2);
        system.dodajUrlopPracownikowi(teamLeader1,"2022-11-10",7);
        system.dodajUrlopPracownikowi(pracownik1,"2022-12-01",14);


        system.pokazPracownikow();

        //usuwanie urlopu
    system.usunUrlopPracownikowi(pracownik1,"2022-12-01",14);
        system.pokazPracownikow();

    }
}
