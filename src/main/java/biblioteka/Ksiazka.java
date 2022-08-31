package biblioteka;

public class Ksiazka {
    private String tytul;
    private String autor;
    private String regal;
    private Dzial dzial;

    public Ksiazka(String tytul, String autor, String regal, Dzial dzial){
        this.tytul = tytul;
        this.autor = autor;
        this.regal = regal;
        this.dzial = dzial;
    }

    @Override
    public String toString() {
        return "\n{" +"\"" + tytul+"\"" + ", " + autor + ", regał:" + regal + ", dzał: " + dzial +
                "}\n";
    }

}
