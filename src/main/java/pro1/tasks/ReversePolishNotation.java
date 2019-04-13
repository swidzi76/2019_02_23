package pro1.tasks;

import pro1.stack.Stack;

//Dla wszystkich symboli z wyrażenia ONP wykonuj:
//        jeśli i-ty symbol jest liczbą, to odłóż go na stos,
//        jeśli i-ty symbol jest operatorem to:
//        zdejmij ze stosu jeden element (ozn. a),
//        zdejmij ze stosu kolejny element (ozn. b),
//        odłóż na stos wartość b operator a.
//        jeśli i-ty symbol jest funkcją to:
//        zdejmij ze stosu oczekiwaną liczbę parametrów funkcji(ozn. a1...an)
//        odłóż na stos wynik funkcji dla parametrów a1...an
//        Zdejmij ze stosu wynik.
public class ReversePolishNotation {

    public static double calculate(String s){
        String[] arrStr = s.split(" ");
        Stack<Double> stack = new Stack<>();
        Double a, b;
        for (int i = 0; i < arrStr.length; i++) {
            switch (arrStr[i]){
                case "+" :{
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b + a);
                    break;
                }
                case "-" :{
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b - a);
                    break;
                }
                case "*" :{
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b * a);
                    break;
                }
                case "/" :{
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b / a);
                    break;
                }
                default:{
                    stack.push(Double.parseDouble(arrStr[i]));
                }
            }
        }
        return stack.pop();
    }
}
