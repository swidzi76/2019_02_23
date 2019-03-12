package exceptions;
// * Napisz klasę Account, która będzie zawierać metodę:
// withdraw() w celu podjęcia środków.
// Metoda powinna obsługiwać przypadek niedostatecznej ilości środków na koncie za pomocą wyjątku.

public class Account {
    private int accountCash;

    public Account(int accountCash) {
        this.accountCash = accountCash;
    }

    public  void withDraw(int money) throws NotEnoughMoneyException{
        if(money > this.accountCash){
            throw new NotEnoughMoneyException("Za mało środków na koncie");
        }
        this.accountCash -= money;
//        return this.accountCash;
    }
    public String toString(){
        return "Stan konta : "+ this.accountCash;
    }
}
