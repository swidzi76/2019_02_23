package exceptions;

public class AccountApp {
    public static void main(String[] args) {
        Account account = new Account(200);
        System.out.println(account.toString());
        for (int i = 0; i < 6; i++) {
            System.out.println(" Wypłacamy z konta 50 "+(i+1)+"raz");
            try {
                account.withDraw(50);

            }catch (NotEnoughMoneyException neme){
                System.out.println(" wyjątek : "+neme+
                        " \n info : "+neme.getMessage());

            }
            System.out.println(account.toString());
        }
    }
}
