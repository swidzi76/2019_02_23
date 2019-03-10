package interfaces;

public class Mammals implements Animal{
    @Override
    public String getname() {
        return " Mammals";
    }

    @Override
    public String speak() {
        return " speak od mammals";
    }

    @Override
    public int getAge() {
        return 80;
    }
}
