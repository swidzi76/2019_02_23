package interfaces;

public class Birds implements Animal, Flyable{
    @Override
    public String getname() {
        return " Birds";

    }

    @Override
    public String speak() {
        return " speak of birds";
    }

    @Override
    public boolean fly() {
        return true;
    }

    @Override
    public int getAge() {
        return 16;
    }

    @Override
    public boolean isAlive() {
        if(getAge() < 20){
            return true;
        }else
            return false;
    }
}
