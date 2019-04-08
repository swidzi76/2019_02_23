package pro1.stack;

public class Stack<T>{
    private Item<T> head;
    private int size;

    public Stack() {
        this.head = null;
        size = 0;
    }
    public void push(T value){
        Item<T> tempItem = new Item(this.head, value);
        head = tempItem;
        size++;
    }
    public boolean isEmpty(){
        if(head == null){
            return true;
        }else{
            return false;
        }
    }
    public T peek(){
        if(!isEmpty()) return head.getValue();
        return null;
    }
    public T pop(){
        if(isEmpty()){
            return null;
        }
        Item<T> temp = head.getNext();
        T result = head.getValue();
        head = temp;
        size--;
        return result;
    }
    public int size(){
        return size;
    }
}
