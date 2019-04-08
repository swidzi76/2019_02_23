package pro1.queue;

public class Dequeue<T> {
    private QueueItem<T> head;
    private QueueItem<T> tail;
    private int size;

    public Dequeue() {
        clear();
    }
    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty(){
        if(head == null && tail == null){
            return true;
        }
        return false;
    }
    public void offerLast(T value){
        if(isEmpty()){
            QueueItem<T> tempItem = new QueueItem<>(value, null, null);
            head = tempItem;
            tail = tempItem;
        }else {
            QueueItem<T> tempItem = new QueueItem<>(value,null, tail);
            tail.setNext(tempItem);
            tail = tempItem;
        }
        size++;
    }
    public void offerFirst(T value){
        if(isEmpty()){
            QueueItem<T> tempItem = new QueueItem<>(value, null, null);
            head = tempItem;
            tail = tempItem;
        }else {
            QueueItem<T> tempItem = new QueueItem<>(value,head, null);
            head.setPrevious(tempItem);
            head = tempItem;
        }
        size++;
    }
    public T peekFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.getValue();
    }
    public T peekLast() {
        if (isEmpty()) {
            return null;
        }
        return tail.getValue();
    }
    public T poolFirst(){
        if(isEmpty()){
            return null;
        }
        QueueItem<T> temp = head.getNext();
        if(temp!=null){
            temp.setPrevious(null);
        }else{
            tail = null;
        }
        T result = head.getValue();
        head = temp;
        size--;
        return result;
    }
    public T poolLast(){
        if(isEmpty()){
            return null;
        }
        QueueItem<T> temp = tail.getPrevious();
        if(temp!=null){
            temp.setNext(null);
        }else{
            head = null;
        }
        T result = tail.getValue();
        tail = temp;
        size--;
        return result;
    }
    public int size(){
        return size;
    }
    public boolean contains(T value){
        if(isEmpty()){
            return false;
        }
        QueueItem<T> temp = head;
        while(temp != null){
            if(temp.getValue().equals(value)){
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

}
