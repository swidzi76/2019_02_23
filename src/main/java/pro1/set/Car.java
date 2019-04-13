package pro1.set;

import java.util.Objects;

public class Car {
    private String brand;
    private String color;
    private String yearProduction;
    private String vin;

    public Car(String brand, String color, String yearProduction, String vin) {
        this.brand = brand;
        this.color = color;
        this.yearProduction = yearProduction;
        this.vin = vin;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getYearProduction() {
        return yearProduction;
    }


    @Override
    public String toString() {
        return String.format("%s %s %s, vin:%s",brand, color,  yearProduction, vin);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return vin == car.vin;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin);
    }
}
