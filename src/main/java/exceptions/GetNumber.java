package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try {
            number = scanner.nextInt();
//        }catch (Exception e){
//            System.out.println(" Wyjątek :"+e);
        }catch (InputMismatchException ime){
            System.out.println(" NIEZGODNOŚĆ TYPÓW");
            System.out.println(" domyślny number to 0");
        }finally {
            System.out.println("SPRAWDZANIE WYJĄTKÓW koniec");
        }

        System.out.println(number);
    }
}
