package system.ksiegowy;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SystemKsiegowyTest {

    @Test
    public void checkIfEmployeeIsAddedToList(){

        SystemKsiegowy system = new SystemKsiegowy();

        Pracownik pracownik1 = new Pracownik(3,"Zosia", "Parówa", TeamLeaderzy.JAN_FASOLA, Stanowisko.DEVELOPER,new Wynagrodzenie(1823));
        system.dodajPracownika(pracownik1);

        assertEquals(1,system.getPracownicy().size());
    }

    @Test
    public void checkIfEmployeeIsRemovedFromList(){

        SystemKsiegowy system = new SystemKsiegowy();

        Pracownik pracownik1 = new Pracownik(3,"Zosia", "Parówa", TeamLeaderzy.JAN_FASOLA, Stanowisko.DEVELOPER,new Wynagrodzenie(1823));

        system.dodajPracownika(pracownik1);
        system.usunPracownika(pracownik1);

        assertEquals(0,system.getPracownicy().size());
    }

    @Test
    public void checkIfTeamLeaderIsChanged(){

        SystemKsiegowy system = new SystemKsiegowy();

        Pracownik pracownik1 = new Pracownik(3,"Zosia", "Parówa", TeamLeaderzy.JAN_FASOLA, Stanowisko.DEVELOPER,new Wynagrodzenie(1823));

        system.dodajPracownika(pracownik1);

        system.ustawTL(pracownik1, TeamLeaderzy.BABA_JAGA);
        assertEquals(pracownik1.getTL(),TeamLeaderzy.BABA_JAGA);

        system.ustawTL(pracownik1, TeamLeaderzy.JAN_FASOLA);
        assertEquals(pracownik1.getTL(),TeamLeaderzy.JAN_FASOLA);
    }

    @Test
    public void checkIfVacationIsAdded(){

        SystemKsiegowy system = new SystemKsiegowy();

        Pracownik pracownik1 = new Pracownik(3,"Zosia", "Parówa", TeamLeaderzy.JAN_FASOLA, Stanowisko.DEVELOPER,new Wynagrodzenie(1823));
        system.dodajPracownika(pracownik1);

        system.dodajUrlopPracownikowi(pracownik1,"2022-12-01",14);

        List<LocalDate> list = new ArrayList<LocalDate>();
        LocalDate localDate = LocalDate.parse("2022-12-01");
        LocalDate endDate = localDate.plusDays(14);

        list.add(localDate);
        list.add(endDate);

        assertEquals(pracownik1.getUrlop(),list);
    }

    @Test
    public void checkIfVacationIsRemoved(){

        SystemKsiegowy system = new SystemKsiegowy();

        Pracownik pracownik1 = new Pracownik(3,"Zosia", "Parówa", TeamLeaderzy.JAN_FASOLA, Stanowisko.DEVELOPER,new Wynagrodzenie(1823));
        system.dodajPracownika(pracownik1);

        system.dodajUrlopPracownikowi(pracownik1,"2022-12-01",14);
        system.usunUrlopPracownikowi(pracownik1,"2022-12-01",14);

        List<LocalDate> list = new ArrayList<LocalDate>();

        assertEquals(pracownik1.getUrlop(),list);
    }

    @Test
    public void checkIfBruttoIsCorrect(){

        SystemKsiegowy system = new SystemKsiegowy();
        Pracownik pracownik1 = new Pracownik(3,"Zosia", "Parówa", TeamLeaderzy.JAN_FASOLA, Stanowisko.DEVELOPER,new Wynagrodzenie(1000));
        system.dodajPracownika(pracownik1);

        assertEquals(pracownik1.getWyplata().getBrutto(),1230.0);

    }



}