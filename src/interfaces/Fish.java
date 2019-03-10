package interfaces;

public class Fish implements Animal, Swimmable{
    @Override
    public String getname() {
        return "Fish";
    }

    @Override
    public String speak() {
        return "Speak of fish";
    }

    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public int getAge() {
        return 10;
    }
}
