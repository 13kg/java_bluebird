


package sklep.muzyczny;

import java.util.ArrayList;
import java.util.List;

public class SklepMuzyczny {

    List<Album> albumy = new ArrayList<>();
    List<Artysta> artysci = new ArrayList<>();

    public void dodajAlbum(Album album){albumy.add(album);}
    public void dodajArtyste(Artysta artysta){artysci.add(artysta);}

    public void usunAlbum(Album album){albumy.remove(album);}
    public void usunArtyste(Artysta artysta){artysci.remove(artysta);}

    public void pokazAlbumy(){
        System.out.println("Lista albumów: \n" + albumy);
    }
    public void pokazArtystow(){
        System.out.println("Lista artystów: \n" + artysci);
    }


}
