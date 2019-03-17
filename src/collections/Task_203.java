package collections;

import java.util.*;

public class Task_203 {
    public static void main(String[] args) {
        // Zadanie 1
        // Stwórz mapę, która jako klucze będzie zawierała obiekty Integer,
        // a jako wartości obiekty typu String.
        // Wypisz na ekran rozmiar mapy oraz wszystkie wartości (klucz - wartość).
        Map<Integer, String> map =  task1(); // metoda zwraca mapę(Integer, String)

        // ZADANIE 2
        // Policz w mapie z pkt 1 (za pomocą pętli) ilość kluczy,
        // które mają wartość mniejszą od zera oraz takich które mają wartość większą lub równą zeru.
        // Wypisz wyniki na ekran.
        task2(map);


        // ZADANIE 3
        // Z mapy stworzonej w pkt 1 wyciągnij wszystkie klucze,
        // które mają wartość mniejszą od zera i dodaj je do nowej listy obiektów Integer.
        // Następnie usuń z mapy wszystkie wartości, których klucze znajdują się w liście.
        // Wypisz wszystkie pozostałe wartości mapy (klucz - wartość) na ekran.
        task3(map);

        // ZADANIE 4
        // Stwórz metodę, która jako parametr przyjmie listę obiektów pl.sda.collections.Product
        // i zwróci mapę gdzie kluczem będzie id produktu a wartością obiekt klasy Product.
        // - zmień implementację mapy tak żeby kolejność produktów w mapie odpowiadała kolejności z listy wejściowej
        // - zmień implementację mapy tak żeby kolejność produktów w mapie odpowiadała kolejności idków produktów

        System.out.println("------------ ZADANIE 4 --------------------------------");
        List<Product> arrayProduct = new ArrayList<>();
        arrayProduct.add(new Product(2, "Pierwszy"));
        arrayProduct.add(new Product(21, "Dwudziesty pierwszy"));
        arrayProduct.add(new Product(5, "Piąty"));
        Map<Integer, Product> map1 = task4(arrayProduct);
        //show map
        for (Integer integer : map1.keySet()) {
            System.out.println(integer + " - " + map1.get(integer).toString());
        }
        // ZADANIE 5
        // * Napisz klasę, która będzie przechowywała mapę słów (obiektów typu String),
        // gdzie kluczem będzie pierwsza litera słowa a wartością zbiór unikalnych słów podanych przez użytkownika.
        // Klasa powinna mieć metodę do podania pojedynczego słowa do klasy,
        // metodę do pobrania zbioru słów na podaną literę i metodę do wyciągnięcia liczności słów dla podanej litery.
        System.out.println(" ---------------------- ZADANIE 5 --------------------------");
        Words words = new Words();
        words.addWord("Justyna");
        words.addWord("Michał");
        words.addWord("Jarek");
        words.addWord("Bartek");
        words.addWord("Janusz");
        Character ch = 'J';
        List<String> list = words.getWordsAtLetter(ch);
        // show list
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println(" ile słów na "+ch+" : "+words.getWordsAtLetter(ch).size() );


    }
    public static Map task4(List<Product> arrayProduct){
//        Map<Integer, Product> productMap =  new HashMap<>();
//        Map<Integer, Product> productMap = new LinkedHashMap<>();
        Map<Integer, Product> productMap = new TreeMap<>();
        for (Product product : arrayProduct) {
            productMap.put(product.getId(), product);
        }
        return productMap;
    }

    public static Map<Integer, String> task1(){
        System.out.println("------------ ZADANIE 1 --------------------------------");
        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(0, "zerowy");
        integerStringMap.put(1," pierwszy");
        integerStringMap.put(2," drugi");
        integerStringMap.put(3," trzeci");
        integerStringMap.put(4," czwarty");
        integerStringMap.put(5," piąty");
        integerStringMap.put(6," szósty");
        integerStringMap.put(7," siódmy");
        integerStringMap.put(8," ósmy");
        integerStringMap.put(-1, "minus pierwszy");
        integerStringMap.put(-2, "minus drugi");

        System.out.println(" liczba elementów - size : " + integerStringMap.size());
        Set<Integer>  keys = integerStringMap.keySet();
        for (Integer i : keys ) {
            System.out.println(i.toString()+ " = " + integerStringMap.get(i));
        }
        return integerStringMap;
    }
    public static void task2(Map<Integer, String> integerStringMap){
        System.out.println("------------ ZADANIE 2 --------------------------------");
        int lessThenZero = 0;
        int moreThenZeroOrEqual = 0;
        int numberOfKeys = 0;

        Set<Integer> keys = integerStringMap.keySet();
        for (Integer i : keys ) {
            numberOfKeys++;
            if(i < 0){
                lessThenZero++;
            }else{
                moreThenZeroOrEqual++;
            }
        }
        System.out.println(" liczba kluczy = "+ numberOfKeys);
        System.out.println(" liczba kluczy mniejszych od zera = "+ lessThenZero);
        System.out.println(" liczba kluczy większa/równa zero = " + moreThenZeroOrEqual);

    }
    public static void task3(Map<Integer, String > integerStringMap){
        System.out.println("------------ ZADANIE 3 --------------------------------");
        List<Integer> integerList = new ArrayList<>();
        Set<Integer> keys = integerStringMap.keySet();
        for (Integer i : keys ) {
            if(i < 0) {
                integerList.add(i);
            }
        }
        // usuwanie kluczy z Mapy integerStringMap które sa w liscie integerList
        for (Integer i : integerList ) {
            integerStringMap.remove(i);
        }

        //wypisanie Mapy
        System.out.println(" Wypisanie mapy po usunięciu elementów z listy");
        System.out.println(" liczba elementów - size : " + integerStringMap.size());
        keys = integerStringMap.keySet();
        for (Integer i : keys ) {
            System.out.println(i.toString()+ " = " + integerStringMap.get(i));
        }

    }
}
