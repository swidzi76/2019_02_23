package exceptions;

public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(){
        super();
    }
    public NotEnoughMoneyException(String string){
        super(string);
    }
}
