public class TriangleApp {
    public static void main(String[] args) {
        Triangle trojkat = new Triangle();
        if (trojkat.isRectangular(5,4,3) == true)
            System.out.println("prostokąty");
        else
            System.out.println("nieprostokątny");
    }
}
