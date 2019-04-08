package pro1.algorithms;

public class FibonacciApp {
    public static void main(String[] args) {
        int number  = 10;
        for (int i = 0; i <=number ; i++) {
            System.out.println("wyraz nr: "+i+" to :"+fib(i));
        }
        System.out.println(" rekurencja ");
        for (int i = 0; i <=number ; i++) {
            System.out.println("wyraz nr: "+i+" to :"+fibRec(i));
        }
    }
    public static int fib(int n){
        int[] result = new int[n+1];
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i <= n; i++) {
            result[i] = result[i-1] + result[i-2];
        }
        return result[n];
    }
    public static int fibRec(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}
