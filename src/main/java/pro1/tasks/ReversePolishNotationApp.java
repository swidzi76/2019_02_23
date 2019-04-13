package pro1.tasks;

import static pro1.tasks.ReversePolishNotation.calculate;

public class ReversePolishNotationApp {
    public static void main(String[] args) {
        String s = "12 2 3 4 * 10 5 / + * +";
        System.out.println(" Odwrotna Notacja Polska");
        System.out.println(" oblicznie dla : "+s+" daje :"+calculate(s));
    }
}
