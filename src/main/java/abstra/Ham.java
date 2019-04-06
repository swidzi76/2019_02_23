package abstra;

public class Ham extends Meat{
    public Ham(String name) {
        super(name);
    }

    @Override
    public String getTaste() {
        return "HAM";
    }
}
