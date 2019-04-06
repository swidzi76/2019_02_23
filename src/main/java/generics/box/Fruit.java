package generics.box;

public abstract class Fruit {
    private boolean rotten;

    public Fruit(boolean rotten) {
        this.rotten = rotten;
    }

    public void isRotten() {
        System.out.println("Is this fruit rotten?");
    }
}