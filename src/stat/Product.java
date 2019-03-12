package stat;
// ZADANIE 5
// Utwórz klasę Product z polami: id, name, price.
// Dodaj konstruktor z polami name i price, gettery i metodę toString().
// Pole id powinno być inicjalizowane w bloku incjacyjnym i powinno mieć wartość pobieraną
// ze statycznego pola counter, które zlicza wszystkie stworzone produkty -
// liczenie powinno się zaczynać od liczby 100.

// ZADANIE 6
// Utwórz kilka produktów i wyświetl informacje o nich na konsoli.

// ZADANIE 7
// * Dodaj do klasy Product stałą DISCOUNT.
// W statycznym bloku incjacyjnym ustaw wartość pola DISCOUNT na 0.3 (30%)
// jeżeli dzisiaj jest poniedziałek i 0.0 w pozostałych przypadkach.
// Uwzględnij rabat przy wyliczaniu ceny.

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private double price;
    private static int counter = 100;
    private final double DISCOUNT;
    {
        id = counter++;
        LocalDate localDate = LocalDate.now();
        if(localDate.getDayOfWeek() == DayOfWeek.MONDAY){
            DISCOUNT = 0.3;
        }else{
            DISCOUNT = 0.0;
        }
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    private double getDiscountPrice(){
        return price - price * DISCOUNT;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", discount price = " + getDiscountPrice()+
                '}';
    }
}
