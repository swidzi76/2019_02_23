package interfaces;

public class Insects implements Animal, Flyable{
    @Override
    public String getname() {
        return "Insects";
    }

    @Override
    public String speak() {
        return "Speak of insects";
    }

    @Override
    public boolean fly() {
        return true;
    }

    @Override
    public int getAge() {
        return 3;
    }
}
