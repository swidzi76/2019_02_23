package pro1.queue;

import static pro1.queue.Brackets.checkBrackets;

public class BracketsApp {
    public static void main(String[] args) {
        String s1 = "(())";
        String s2 = "()()";
        String s3 = "(()())";
        String s4 = ")()(";
        String s5 = "())(";
        System.out.println( s1 + " -> " + checkBrackets(s1));
        System.out.println( s2 + " -> " + checkBrackets(s2));
        System.out.println( s3 + " -> " + checkBrackets(s3));
        System.out.println( s4 + " -> " + checkBrackets(s4));
        System.out.println( s5 + " -> " + checkBrackets(s5));
    }
}
