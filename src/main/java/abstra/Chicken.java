package abstra;

public class Chicken extends Meat{

    public Chicken(String name) {
        super(name);
    }

    @Override
    public String getTaste(){
        return "KURCZAK";
    }
}
