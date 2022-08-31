package system.ksiegowy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pracownik {
    private int id;
    private String imie;
    private String nazwisko;
    private TeamLeaderzy tLid;
    private Stanowisko rola;



    private Wynagrodzenie wyplata; //netto

    private List<LocalDate> urlop = new ArrayList<>();

    //konstruktor klasy system.ksiegowy.Pracownik przypisuje pola do parametrow
    public Pracownik(int id, String imie, String nazwisko, TeamLeaderzy tLid, Stanowisko rola, Wynagrodzenie wyplata) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.tLid = tLid;
        this.rola = rola;
        this.wyplata = wyplata;

    }

    //metoda publiczna która przypisuje parametr do pola tLid
    public void zmienTL(TeamLeaderzy nowytLid) {
        this.tLid = nowytLid;
    }


   //metoda dodająca urlop pracownikowi
    public void dodajUrlop(String data,long dni)
    {
       LocalDate localDate = LocalDate.parse(data);
        LocalDate endDate = localDate.plusDays(dni);

        urlop.add(localDate);
        urlop.add(endDate);
    }


   //metoda usuwająca urlop pracownikowi
    public void usunUrlop(String data, long dni)
    {
        LocalDate localDate = LocalDate.parse(data);
        LocalDate endDate = localDate.plusDays(dni);
        urlop.remove(localDate);
        urlop.remove(endDate);
    }

    public system.ksiegowy.TeamLeaderzy getTL() {
        return tLid;
    }

    public Wynagrodzenie getWyplata() {
        return wyplata;
    }
    public List<LocalDate> getUrlop() {
        return urlop;
    }


    //modyfikacja wyswietlania



    @Override
    public String toString() {
        return "\n{" + "id: " + id + ", " + imie + " " + nazwisko + ", " + rola + ", wynagrodzenie " + wyplata.toString() + ", TL: " + tLid + ", urlop: " +urlop+
                "}\n";
    }

//    public void setName(String imien) {
//        this.imie = imie;
//    }
//    public String getName(){
//        return imie;
//    }
//    public void setSurname(String nazwisko) {
//        this.nazwisko = nazwisko;
//    }
//    public String getSurname() {
//        return nazwisko;
//    }
//    public void setId(int id) {
//        this.id = id;
//    }
//    public int getId() {
//        return this.id;
//    }

//    public void setPosition(system.ksiegowy.Stanowisko rola) {
//        this.rola = rola;
//    }
//    public system.ksiegowy.Stanowisko getPosition() {
//        return rola;
//    }
//    public void setSalary(system.ksiegowy.Wynagrodzenie wyplata) {
//       this.wyplata = wyplata;
//    }

    }


