package pro1;

public class Stack<T>{
    Item<T> head;

    public Stack() {
        this.head = null;
    }
    public T getHead(){
        return head.getValue();
    }
    public void push(int value){
        Item<T> tempItem = new Item(this.head, value);
        head = tempItem;
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
        return result;
    }
}
