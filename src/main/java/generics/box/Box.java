package generics.box;

public class Box<T extends Fruit> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void isRotten(){
        item.isRotten();
    }

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(new Apple(true));
        Box<Orange> orangeBox = new Box<>(new Orange(true));


        appleBox.isRotten();
    }
}
