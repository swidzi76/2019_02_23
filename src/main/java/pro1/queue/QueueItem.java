package pro1.queue;

public class QueueItem<T> {
    T value;
    QueueItem<T> next;
    QueueItem<T> previous;

    public QueueItem(T value, QueueItem<T> next, QueueItem<T> previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public T getValue() {
        return value;
    }

    public QueueItem<T> getNext() {
        return next;
    }

    public QueueItem<T> getPrevious() {
        return previous;
    }

    public void setPrevious(QueueItem<T> previous) {
        this.previous = previous;
    }

    public void setNext(QueueItem<T> next) {
        this.next = next;
    }
}
