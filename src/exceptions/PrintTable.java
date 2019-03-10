package exceptions;

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        try {
            index = scanner.nextInt();
        }catch (Exception e){
            System.out.println(" Wyjątek :"+e);
            System.out.println(" index to 0");
        }

        String[] fruits = new String[]{"apple", "organe", "mango", "cheery"};
        try {
            System.out.println(fruits[index]);
        }catch (Exception e){
            System.out.println(" wyjątek :"+e);

        }finally {
            System.out.println("SPRAWDZANIE WYJĄTKÓW koniec");
        }
    }
}
