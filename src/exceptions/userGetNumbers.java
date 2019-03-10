package exceptions;

import java.util.Scanner;

public class userGetNumbers {
    public static void main(String[] args) {
        String string = "";
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Q - exit");
            System.out.print(">>>");
            string = scanner.nextLine();

            if("q".equalsIgnoreCase(string))
                break;
            try {
                String[] arrayStr = string.split(" ");
                for (String str : arrayStr) {
                    sum += Integer.parseInt(str);
                }

            }catch (Exception e){
                System.out.println(" wyjątek : "+e);
            }
            System.out.println("suma = "+sum);

        }
    }

}
