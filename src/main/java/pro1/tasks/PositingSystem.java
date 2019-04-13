package pro1.tasks;

import pro1.stack.Stack;

public class PositingSystem {
    static public String changePositingSystem(int value, int base){
        Stack<Integer> stack = new Stack<Integer>();
        String result = "";
        stack.push(value % base);
        value /= base;
        while(value > 0){
            stack.push(value % base);
            value /= base;
        }
        Integer s;
        while(!stack.isEmpty()){
            s = stack.pop();
            switch (s){
                case 10 : { result+="A"; break;}
                case 11 : { result+="B"; break;}
                case 12 : { result+="C"; break;}
                case 13 : { result+="D"; break;}
                case 14 : { result+="E"; break;}
                case 15 : { result+="F"; break;}
                default:{result+=s;}
            }
//            result += stack.pop();
        }
        return result;
    }
}
