package sklep.muzyczny;

public class Artysta {
    private String imieAlboNazwa;


    public Artysta (String imieAlboNazwa){
        this.imieAlboNazwa = imieAlboNazwa;

    }
    @Override
    public String toString() {
        return imieAlboNazwa;
    }


}
