package sklep.muzyczny;

import java.util.List;

public class Album {
   private String tytul;
   private int rokWydania;
   private List<Artysta> tworcy;
   private  Cena cenaPln;





   public Album(String tytul, int rokWydania, List<Artysta> tworcy, Cena cenaPln){
       this.tytul = tytul;
       this.rokWydania = rokWydania;
       this.tworcy = tworcy;
       this.cenaPln = cenaPln;
   }

    @Override
    public String toString() {
        return "\n{" + "Album: " + tytul + ", " + tworcy + ", rok wydania:" + rokWydania + ", " + cenaPln.toString() +
                "}\n";
    }

}
