package pro1;

public class StackApp {
    public static void main(String[] args) {
        int number = 255;
        int base = 16;
        for (int i = 0; i <= number; i++) {
            System.out.println(" liczba : "+ i +" w systemie "+base+" to "+ PositingSystem.changePositingSystem(i,base));
        }

    }
}
