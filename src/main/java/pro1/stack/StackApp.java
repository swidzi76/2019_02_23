package pro1.stack;

import pro1.tasks.PositingSystem;

public class StackApp {
    public static void main(String[] args) {
        int number = 255;
        int base = 16;
        for (int i = 0; i <= number; i++) {
            System.out.println(" liczba : "+ i +" w systemie "+base+" to "+ PositingSystem.changePositingSystem(i,base));
        }

    }
}
