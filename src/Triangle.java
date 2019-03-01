public class Triangle {
    private int a;
    private int b;
    private int c;

    /*public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }*/
    public boolean isRectangular(int a, int b, int c){
        int tmp;
        System.out.println("a ="+a+"b="+b+"c="+c);
        if (a > b){
            tmp = a;
            a = b;
            b = tmp;
        }
        if (a > c){
            tmp = a;
            a = c;
            c = tmp;
        }
        if (b > c){
            tmp = b;
            b = c;
            c = tmp;
        }
        System.out.println("a ="+a+"b="+b+"c="+c);
        if((a*a)+(b*b) == c*c)
            return true;
        else
            return false;
    }
}
