package generics;
// ZADANIE 5
// Stwórz klasę, która będzie zawierała mapę gdzie klucz = String, a wartość = Integer.
// Klasa powinna mieć metody: addWord() i getWordCount() -
// które dodadzą słowo i zwrócą ilość wcześniej dodanych słów lub zero jeżeli słowo nie występuje.

import java.util.HashMap;
import java.util.Map;

public class Words {
    private Map<String, Integer> map;

    public Words() {
        map = new HashMap<>();
    }
    public void addWord(String string){
        if(getWordCount(string) == 0){
            map.put(string, 1);// pierwsze wystapienie
        }else{
            map.replace(string, map.get(string)+1);
        }



    }
    public int getWordCount(String word){
        int count = 0;
        for (String str : map.keySet() ) {
            if(str.equals(word)){
                count = map.get(word);
            }
        }
        return count;
    }
    public void show(){
        System.out.println(" liczba el m2 : " + map.size());
        for (String s : map.keySet()) {
            System.out.println(s + " - " + map.get(s));
        }
    }
}
