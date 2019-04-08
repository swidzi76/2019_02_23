package pro1.queue;

public class Queue<T> {
    private QueueItem<T> head;
    private QueueItem<T> tail;
    private int size;

    public Queue() {
        clear();
    }
    public boolean isEmpty(){
        if(head == null && tail == null){
            return true;
        }
        return false;
    }
    public void offer(T value){
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
    public T peek(){
        if(isEmpty()){
            return null;
        }
        return head.getValue();
    }
    public T pool(){
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
    public int size(){
        return size;
    }
    public void clear(){
        head = null;
        tail = null;
        size = 0;
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
