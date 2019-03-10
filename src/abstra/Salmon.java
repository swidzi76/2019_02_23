package abstra;

public class Salmon extends Meat {
    public Salmon(String name) {
        super(name);
    }

    @Override
    public String getTaste() {
        return "SALMON";
    }

}
