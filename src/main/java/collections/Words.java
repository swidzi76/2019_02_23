package collections;
// ZADANIE 5
// * Napisz klasę, która będzie przechowywała mapę słów (obiektów typu String),
// gdzie kluczem będzie pierwsza litera słowa a wartością zbiór unikalnych słów podanych przez użytkownika.
// Klasa powinna mieć metodę do podania pojedynczego słowa do klasy,
// metodę do pobrania zbioru słów na podaną literę i metodę do wyciągnięcia liczności słów dla podanej litery.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Words {
    Map<String, Character> map;

    public Words() {
        map = new HashMap<>();
    }
    public void addWord(String word){
        if((word != null)&&(word.length() > 0) ){
            map.put(word, word.charAt(0));
        }
    }
    List getWordsAtLetter(Character ch){
        List<String> list = new ArrayList<>();
        for (String string : map.keySet()) {
            if(ch == map.get(string)){
                list.add(string);
            }
        }
        return list;
    }
}
