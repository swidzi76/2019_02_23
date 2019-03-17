package collections;

// ZADANIE 6
// * Rozszerz klasę Car z przykładu i dodaj do niej pola opisujące własności samochodu.
// Utwórz kolekcję samochodów możliwych do kupna (przynajmniej 10 pozycji).
// Następnie napisz program pozwalający użytkownikowi na przeszukiwanie kolekcji na
// podstawie podawanych parametrów. Wynikiem powinna być lista dostępnych pojazdów.

import java.util.Objects;

public class Car implements Comparable<Car> {
    private final String name;

    private String color;
    private String brand; // producent

    public Car(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }
    public String geColor() {
        return color;
    }
    public String getBrand() {
        return brand;
    }

    @Override
    public int compareTo(Car o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "" + name + " kolor : " + this.geColor() + " producent : " + this.getBrand();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

//    public static void main(String[] args) {
//        Car car1 = new Car("Tesla Model S");
//        Car car2 = new Car("Tesla Model X");
//
//        System.out.println(car1.compareTo(car2));
//    }
}
