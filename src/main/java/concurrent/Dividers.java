package concurrent;

import java.util.ArrayList;
import java.util.List;

public class Dividers implements Runnable {
    private int num;
    List<Integer> result;

    public Dividers(int num) {
        this.num = num;
        result = new ArrayList<>();
    }

    @Override
    public void run() {
        for (int i = 1; i <= this.num; i++) {
            if((num % i) == 0){
                result.add(i);
            }
        }
//        System.out.print("Dzielniki liczby "+this.num+" to :");
        String s = "dzielniki liczby " + num + " ti :";
        for (Integer integer : result) {
            s+= integer+ ", ";
        }
//        System.out.println(s);
    }

}
