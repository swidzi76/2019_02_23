package collections;

public interface Figure {
    double PI = 3.14159;
    String name = "";

    double getArea();

    double getPerimeter();

    String getName();

    default void print() {
        System.out.println(getArea());
        System.out.println(getPerimeter());
    }
}
