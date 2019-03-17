package generics.exercises;

import java.util.*;

public class Tasks {

    public static void main(String[] args) {
        //#1
        //Set<Double> doubles = setOfDoubles();

        //#2
        //Map<Integer, String> genericMap = genericMap();

        //#3
        List<Number> numbers = doublesToNumbers(setOfDoubles());
        System.out.println("numbers = " + numbers);

        //#4
        NumbersBox<Number> numbersBox = numbersToNumbersBox(numbers);
        System.out.println("Zadanie 4 - numbersBox = " + numbersBox);
        //#5
        NumbersBox<Double> doubleNumbersBox = boxOfDoubles(setOfDoubles());
        System.out.println("Zad.5 " + doubleNumbersBox);
    }

    /**
     * 1. Stwórz kolekcję typu Set, zawierającą obiekty klasy Double. Dodaj do niej kilka liczb.
     * Następnie pobierz i wyświetl w konsoli wszystkie elementy kolekcji.
     * Metoda powinna zwrócić stworzoną kolekcję.
     */
    private static Set<Double> setOfDoubles() {
        Set<Double> doubleSet = new HashSet<>();
        doubleSet.add(23.6);
        doubleSet.add(2.6);
        doubleSet.add(-3.6);
        doubleSet.add(3.6);
        doubleSet.add(423.6);

        for (Double aDouble : doubleSet) {
            System.out.println(aDouble);
        }
        return doubleSet;
    }

    /**
     * 2. Stwórz mapę zawierającą obiekty typu Integer jako klucze i String jako wartości. Dodaj kilka obiektów do mapy.
     * Pobierz i wyświetl w konsoli pojedyncze elementy.
     * Następnie pobierz i wyświetl w konsoli wszystkie elementy mapy.
     * Metoda powinna zwrócić stworzoną mapę.
     */
    private static Map<Integer, String> genericMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, " drugi");
        map.put(4, " czwarty");
        map.put(7, " siódmy");
        map.put(9, " dziewiąty");
        map.put(20, " dwudziesty");

        for (Integer integer : map.keySet()) {
            System.out.println(integer + " - " + map.get(integer));
        }
        return map;
    }

    /**
     * 3. Skopiuj podany zbiór liczby Double do listy obiektów klasy Number.
     * Nie kopiuj obiektu jeżeli jest równy null.
     * Zwróć nową listę jako wynik metody.
     */
    private static List<Number> doublesToNumbers(Set<Double> doubles) {
        List<Number> numbers = new ArrayList<>();
        for (Double d : doubles) {
            if(d!=null){
                numbers.add(d);
            }
        }
        return numbers;
    }

    /**
     * 4. Uzupełnij klasę NumbersBox która ma przechowywać listę obiektów klasy Number.
     * Dodaj metody które:
     * - sprawdzą czy lista jest pusta
     * - pobierze pierwszy element listy
     * - pobierze pierwszy element listy jako int
     * - pobierze ostatni element listy
     * - pobierze ostatni element listy jako int
     * Zwróć obiekt klasy NumbersBox jako wynik tej metody.
     */
    private static NumbersBox numbersToNumbersBox(List<Number> numbers) {
        NumbersBox<Number> numbersBox = new NumbersBox<>(numbers);
        System.out.println(" czy pusty : " + numbersBox.isEmpty());
        System.out.println(" zwróć pierwszy : " + numbersBox.getFirst());
        System.out.println(" zwróć ostatni : " + numbersBox.getLast());
        System.out.println(" zwróć pierwszy  jako int : " + numbersBox.getFirstAsInt());
        System.out.println(" zwróć ostatni jako int : " + numbersBox.getLastAsInt());
        return numbersBox;
    }

    /**
     * 5. Zmień klasę NumbersBox - tak żeby przyjmowała różne typy liczbowe - np. Double
     * Zwróć obiekt klasy NumbersBox jako wynik tej metody.
     */
    private static NumbersBox<Double> boxOfDoubles(Set<Double> doubles) {
        NumbersBox<Double> numbersBox = new NumbersBox<>(doubles);
        return numbersBox;

    }
}
