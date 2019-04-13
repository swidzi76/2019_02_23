package pro1.tasks;

import pro1.stack.Stack;

public class Brackets {
    public static boolean checkBrackets(String string){
        Stack<Character> stack = new Stack<>();
        for (int i = string.length()-1; i >= 0; i--) {
            if(string.charAt(i) == ')') stack.push(')');
            if(string.charAt(i) == '(') stack.pop();
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}
