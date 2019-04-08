package pro1.stack;

public class StackArr {
    private int[] arr = new int[10];
    private int head;

    public StackArr() {
        this.head = -1;
    }
    public void push(int value){
        head++;
        // if(head = arr.length())...............
        arr[head] = value;
    }
    public boolean isEmpty(){
        if(head == -1){
            return true;
        }
        return false;
    }
    public int pop(){
        if(!isEmpty()){
            return arr[head--];
        }else{
            return -1;//////?????????
        }
    }
    public int peek(){
        if(!isEmpty()){
            return arr[head];
        }else{
            return -1;/////////////???
        }
    }
}
