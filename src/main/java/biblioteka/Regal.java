package biblioteka;

public class Regal {
    private String regal;

    public Regal(String regal) {
        this.regal = regal;
    }

    @Override
    public String toString() {
        return "\n{"+ "regał: " + regal +
                "}\n";
    }

}
