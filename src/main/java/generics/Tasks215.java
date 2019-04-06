package generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tasks215 {
    public static void main(String[] args) {
        // ZADANIE 1
        // Stwórz metodę, która przyjmie listę obiektów typu Integer i
        // wyświeli na ekran tylko liczby większe od 10.
        List<Integer> listInteger = new ArrayList<>();
        List<Double> listDouble = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listInteger.add(i);
            listDouble.add(i * 3.89);
        }
        task1(listInteger);

        // ZADANIE 2
        // Stwórz metodę, która jako parametry przyjmie:
        // kolekcję (Set) zawierającą zestaw fraz oraz pojedynczy wyraz którego szukamy w kolekcji.
        // Metoda zwróci ilość wystąpień szukanego wyrazu w podanej kolekcji.
        // Weź pod uwagę sytuację gdy szukany wyraz jest częścią frazy z kolekcji.
        Set<String> strings = new HashSet<>();
        strings.add("jan");
        strings.add("janek");
        strings.add("jarek");
        strings.add("janusz");
        strings.add("justyna");
        strings.add("michał");
        strings.add("bartek");
        strings.add("bolek");
        //show strings
        for (String string : strings) {
            System.out.println(string);
        }
        String str = "b";
        System.out.println(" liczba wystąpień '"+str+"' = "+ task2(strings, str));

        // ZADANIE 3
        // Zmień metodę z pkt.1 tak żeby przyjmowała listę dowolnych obiektów dziedziczących po klasie Number.
        // Sprawdź czy metoda będzie działała z: List<Double> i List<Integer>
        System.out.println(" -------------------- ZADANIE 3 ------------------------");
        task3(listInteger);
        task3(listDouble);

        // ZADANIE 4
        // Utwórz klasę, która pozwoli ustawić parę obiektów różnego typu.
        // Sygnatura klasy powinna zawierać dwa generyki,
        // a następnie konstruktor pozwalający zainicjalizować obiekt klasy z dwoma instancjami obiektów.
        Pair<String, Integer> pair = new Pair<>("abc", 3);

        // ZADANIE 5
        // Stwórz klasę, która będzie zawierała mapę gdzie klucz = String, a wartość = Integer.
        // Klasa powinna mieć metody: addWord() i getWordCount() -
        // które dodadzą słowo i zwrócą ilość wcześniej dodanych słów lub zero jeżeli słowo nie występuje.
        System.out.println(" -------------------- ZADANIE 5 ------------------------");
        Words words = new Words();
        words.addWord("abc");
        words.addWord("bca");
        words.addWord("abc");
        words.addWord("aadd");
        words.addWord("kfjgf");
        words.addWord("abc");
        words.addWord("btt");
        words.show();
        System.out.println(words.getWordCount("abc"));
        // ZADANIE 6
        // Ogranicz możliwość podania dowolnego typu obiektów dla klasy z pkt. 4.

        // ZADANIE 7
        // * Utwórz klasę Forest która będzie zawierała zbiór różnego rodzajów drzew (liściastych i iglastych
        // - dodaj odpowiednie klasy).
        // Dodaj metody, które zwrócą wszystkie drzewa,
        // tylko liściaste albo tylko iglaste. Dodaj metodę, która zwróci drzewa starsze niż podany parametr.
        System.out.println(" --------------------- ZADANIE 7 ------------------------");
        Forest forest = new Forest();
        forest.add(new DeciduousTree(50, "Lipa"));
        forest.add(new DeciduousTree(40, "Brzoza"));
        forest.add(new ConiferousTree(30, "Sosna"));
        forest.add(new ConiferousTree(20, "Świerk"));
        forest.add(new DeciduousTree(15, "Topola"));

        System.out.println(" ---- Drzewa iglaste w  lesie ----------");
        for (Tree tree : forest.getConiferousTrees()) {
            System.out.println(tree);
        }

        System.out.println(" ---- Drzewa liściaste w lesie ----------");
        for (Tree tree : forest.getDeciduousTrees()) {
            System.out.println(tree);
        }

        System.out.println(" ---- Drzewa starsze niż 30 lat w lesie ----------");
        for (Tree tree : forest.getOlderThan(30)) {
            System.out.println(tree);
        }
    }//main

    // metody statyczne
    // -----------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------
    public static <T extends Number> void task3(List<T> list){
        for(T number : list){
            if(number.intValue() > 10){
                System.out.println(number);
            }
        }
    }
    public static void task1(List<Integer> list){
        for (Integer integer : list) {
            if(integer > 10){
                System.out.println(integer);
            }
        }

    }

    public static int task2(Set<String> set, String string){
        int count = 0;
        for (String s : set) {
            if(s.indexOf(string) != -1){
                count++;
            }
        }
        return count;
    }
}
