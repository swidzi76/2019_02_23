package pro1.algorithms;

public class FractionApp {
    // obliczanie silni rekurencją
    public static void main(String[] args) {
        int number = 10;
        for (int i = 0; i <=10 ; i++) {
            System.out.println(" Silnia dla argumentu : "+i+" to :"+fraction(i));
        }

    }
    public static int fraction(int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        return n * fraction(n-1);
    }
}
