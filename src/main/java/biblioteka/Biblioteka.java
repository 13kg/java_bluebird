package biblioteka;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka {

    List<Ksiazka>ksiazki = new ArrayList<>();

    List<Regal>regaly = new ArrayList<>();

    public void dodajKsiazke(Ksiazka ksiazka){ksiazki.add(ksiazka);}

    public void dodajRegal(Regal regal){regaly.add(regal);}

    public void usunKsiazke(Ksiazka ksiazka){ksiazki.remove(ksiazka);}

    public void usunRegal(Regal regal){regaly.remove(regal);}


    public void wyswietlKsiazki(){
        System.out.println("Lista książek: \n" + ksiazki);
    }
    public void wyswietlRegaly(){
        System.out.println("Lista regałów: \n" + regaly);



    }





}
