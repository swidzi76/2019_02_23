package exceptions;

public class MyNewException extends Exception{
    private int sum = 0;
    public MyNewException() {
        super();
    }
    public MyNewException(String string, int sum){
        super(string);
        this.sum = sum;
    }
    public int getSum(){
        return this.sum;
    }
}
