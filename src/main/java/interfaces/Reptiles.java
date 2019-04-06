package interfaces;

public class Reptiles implements Animal, Swimmable {
    @Override
    public String getname() {
        return "Reptiles";
    }

    @Override
    public String speak() {
        return "Speak of reptiles";
    }

    @Override
    public boolean swim() {
        return false;
    }

    @Override
    public int getAge() {
        return 17;
    }
}
