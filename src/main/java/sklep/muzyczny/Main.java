//3a. Projekt - sklep muzyczny

//Sklep składa się z nastepujących klas
//1. Album
//2. Artysta
//3. Cena
//Zakładamy, że w sklepie znajduje się n albumów. Każdy album to 1-n artystów.
// Album posiada cenę w 2 walutach (dowolnych) i gatunek
//Napisz definicje klas oraz podstawowe metody do obsługi sklepu - dodawanie i usuwanie albumów.
// (trzeba użyć konstruktora z parametrami)


package sklep.muzyczny;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SklepMuzyczny sklep = new SklepMuzyczny();

        Artysta artysta1 = new Artysta("Pearl Jam");
        Artysta artysta2 = new Artysta("Mettalica");
        Artysta artysta3 = new Artysta("Bayer Full");

        sklep.dodajArtyste(artysta1);
        sklep.dodajArtyste(artysta2);
        sklep.dodajArtyste(artysta3);


        Album album1 = new Album("Yeld", 1990, new ArrayList<>(Arrays.asList(artysta1, artysta3)) , new Cena(50));
        Album album2 = new Album("Master of Puppets", 1995, new ArrayList<>(Arrays.asList(artysta2)), new Cena(60));
        Album album3 = new Album("Majteczki w Kropeczki", 1990, new ArrayList<>(Arrays.asList(artysta3)), new Cena(150));



        sklep.dodajAlbum(album1);
        sklep.dodajAlbum(album2);
        sklep.dodajAlbum(album3);






        sklep.pokazAlbumy();
        sklep.pokazArtystow();

    }





}
