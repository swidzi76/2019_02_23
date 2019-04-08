package pro1;

public class Item<T> {
    private Item next;
    private T value;

    public Item(Item next, T value) {
        this.next = next;
        this.value = value;
    }

    public Item getNext() {
        return next;
    }

    public T getValue() {
        return value;
    }
}
