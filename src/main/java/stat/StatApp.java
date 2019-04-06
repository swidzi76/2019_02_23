package stat;

// ZADANIE 5
// Utwórz klasę Product z polami: id, name, price.
// Dodaj konstruktor z polami name i price, gettery i metodę toString().
// Pole id powinno być inicjalizowane w bloku incjacyjnym i powinno mieć wartość pobieraną
// ze statycznego pola counter, które zlicza wszystkie stworzone produkty -
// liczenie powinno się zaczynać od liczby 100.

public class StatApp {
    public static void main(String[] args) {
        System.out.println(" dodawanie 5 + 7 = "+Math.Operation.add(5,7));
        System.out.println(" odejmowanie 5 - 7 = "+Math.Operation.substract(5,7));
        System.out.println(" wart min 30 i 7  = "+Math.Compare.min(30,7));
        System.out.println(" wart max 5 i 7 = "+Math.Compare.max(5,7));
        System.out.println(" dzielenie 40 / 7 = "+Math.Operation.divide(40,7));
        System.out.println(" mnożenie 40 * 7 = "+Math.Operation.multiply(40,7));
        System.out.println(" potęgowanie 2 ^ 8 = "+Math.pow(2,8));
        System.out.println(" pole kołą o promieniu 8 = "+Math.circularField(8));

        // Zadanie 5
        // Utwórz kilka produktów i wyświetl informacje o nich na konsoli.

        Product product1 = new Product("Produkt nr 1", 2.78);
        Product product2 = new Product("Produkt nr 1", 6.88);
        Product product3 = new Product("Produkt nr 1", 26.08);
        Product product4 = new Product("Produkt nr 1", 5.00);
        System.out.println(product1.toString());
        System.out.println(product2.toString());
        System.out.println(product3.toString());
        System.out.println(product4.toString());
    }
}
