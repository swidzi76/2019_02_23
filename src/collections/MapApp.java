package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapApp {
    public static void main(String[] args) {
        Map<String, String> vocabulary = new HashMap<>();

        //dodaj
        vocabulary.put("kot", "cat");
        vocabulary.put("pies", "dog");
        vocabulary.put("lew", "lion");
        vocabulary.put("wąż", "snake");

        // sprawdź
        System.out.println("contains dog :" + vocabulary.containsValue("dog"));
        System.out.println("contains snake :" + vocabulary.containsValue("snake"));
        System.out.println("contains lew :" + vocabulary.containsKey("lew"));
        System.out.println("contains snake :" + vocabulary.containsKey("snake"));

        // pobierz pojedynczy element
        String dogInEnglish = vocabulary.get("pies");
        System.out.println("dogInEnglish = " + dogInEnglish);
        String snakeInEnglish = vocabulary.get("wąż");
        System.out.println("snakeInEnglish = " + snakeInEnglish);
        snakeInEnglish = vocabulary.getOrDefault("wąż", "snake");
        System.out.println("snakeInEnglish = " + snakeInEnglish);

        //usuń
        String removed = vocabulary.remove("wąż");
        System.out.println("removed = " + removed);
        System.out.println(" after removed = " + vocabulary.get("wąż"));

        //rozmiar
        System.out.println(" Liczba elementów : " + vocabulary.size());

        // wypisz
        Set<String> keys = vocabulary.keySet();
        for (String key : keys) {
            System.out.println(key + " = " + vocabulary.get(key));
        }
    }
}
