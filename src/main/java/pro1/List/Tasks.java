package pro1.List;

import com.google.common.collect.Lists;

import java.util.*;

public class Tasks {

    public static void main(String[] args) {
        //#1
        listOfIntegers();

        //#2
        System.out.println("----------- zadanie 2 -----------");
        List<String> list1 = Lists.newArrayList("apple", "pear", "plum");
        List<String> list2 = Lists.newArrayList("orange", "pear");
        List<String> list3 = Lists.newArrayList("lemon", "peach", "cherry", "apple");
        List<String> fruits = merge(list1, list2, list3);
        System.out.println("fruits = " + fruits);

        //#3
        System.out.println("----------- zadanie 3 ---------------");
        List<Double> numbers = Lists.newArrayList(3.5, 0.5, 3.1, 7., 0.9);
        List<Double> sortedNumbers = selectionSort(numbers);
        System.out.println("sortedNumbers = " + sortedNumbers);

        //#4
        System.out.println("------------ zadanie 4 ---------------");
        List<String> strings = Lists.newArrayList("ford", "lion", "orange", "adam", "julia", "elephant");
        boolean isLionFound = binarySearch(strings, "lion");
        boolean isCatFound = binarySearch(strings, "cat");
        System.out.println("isLionFound = " + isLionFound);
        System.out.println("isCatFound = " + isCatFound);

        //#5
        System.out.println("-------------- zadanie 5 ------------");
        List<Product> products = Lists.newArrayList(
                                        new Product(1, "SmartTV", 1999.99),
                                        new Product(2, "Laptop HD", 1500.55),
                                        new Product(3, "Pencil", 15.59),
                                        new Product(4, "SmartWatch", 999.05),
                                        new Product(5, "Pen", 15.59),
                                        new Product(6, "Laptop FullHD", 1500.55)
                                        );
        products = sortProducts(products);
        System.out.println("products sorted:");
        products.forEach(System.out::println);
    }

    /**
     * 1. Stwórz listę obiektów typu Integer. Wypisz na ekran pierwszy, środokowy i ostatni element listy.
     * Następnie wypisz na ekran co drugą liczbę z listy.
     */
    private static void listOfIntegers() {
        List<Integer> lista = new ArrayList<>();
        List<Integer> additionalList = Lists.newArrayList(1,6,7,89,67,89,-4,-4,8);
        lista.addAll(additionalList);
        System.out.println("Pierwszy : "+ lista.get(0));
        System.out.println("Ostatni : "+ lista.get(lista.size()-1));
        if((lista.size() % 2) == 0){
            // zwaracamy dwa środkowe
            System.out.println("Środkowy : "+ lista.get((lista.size()-1)/2));
            System.out.println("Środkowy : "+ lista.get(((lista.size()-1)/2)+1));
        }else{

            System.out.println("Środkowy : "+ lista.get(lista.size()/2));
        }
        for (int i = 0; i < lista.size(); i++) {
            if(i%2 == 0){
                System.out.println("element nr : " + i +" = " + lista.get(i));
            }
        }
    }

    /**
     * 2. Napisz metodę która połączy wszystkie element 3 list w jedną listę, która ma być zwrócona z metody.
     *    Zwrócona lista nie powinna zawierać duplikatów.
     */
    private static List<String> merge(List<String> list1, List<String> list2, List<String> list3) {
        List<String > lista = new LinkedList<>();
        for (String s : list1) {
            if(lista.indexOf(s)<0) lista.add(s);
        }
        for (String s : list2) {
            if(lista.indexOf(s)<0) lista.add(s);
        }
        for (String s : list3) {
            if(lista.indexOf(s)<0) lista.add(s);
        }
        return lista;
    }

    /**
     * 3. Posortuj podane liczby bez użycia metod z klasy Collection - za pomocą algorytmu sortowanie przez wybieranie
     */
    private static List<Double> selectionSort(List<Double> numbers) {
        Double min;
        for (int i = 0; i < numbers.size(); i++) {
            min = numbers.get(i);
            // szukamy el mniejszego w dalszej częci tabeli
            for (int j = i+1; j < numbers.size(); j++) {
                if(numbers.get(j) < min) {
                    min = numbers.get(j);
                    numbers.set(j,numbers.get(i));
                    numbers.set(i, min);
                }
            }
        }
        return numbers;
    }

    /**
     * 4. Napisz metodę, która wyszuka podany element w liście i zwróci true jeżęli element zostanie znaleziony, false - w przeciwnym przypadku
     */
    private static boolean binarySearch(List<String> strings, String searchedPhrase) {
        if(strings.indexOf(searchedPhrase) == -1){
            return false;
        }else{
            return true;
        }
    }

    /**
     * 5*. Posortuje listę produktów po cenie rosnąco i po nazwie rosnąco. Zwróć posortowaną listę.
     */
    private static List<Product> sortProducts(List<Product> products) {
        Comparator<Product> productComparatorByNameAndAge = Comparator.comparing(Product::getPrice).thenComparing(Product::getName);
//        Lists  sort(products, productComparatorByNameAndAge);
        Collections.sort(products, productComparatorByNameAndAge);

        return products;
    }
}