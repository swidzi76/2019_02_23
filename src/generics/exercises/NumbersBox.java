package generics.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
  * 4. Uzupełnij klasę NumbersBox która ma przechowywać listę obiektów klasy Number.
             * Dodaj metody które:
             * - sprawdzą czy lista jest pusta
             * - pobierze pierwszy element listy
             * - pobierze pierwszy element listy jako int
             * - pobierze ostatni element listy
             * - pobierze ostatni element listy jako int
 */

public class NumbersBox<T extends Number> {
    private  List<T> list = new ArrayList<>();

    public NumbersBox(List<T> list) {
        this.list = list;
    }

    public NumbersBox(Set<T> set) {
        for (T t : set) {
            list.add(t);
        }
    }

    public boolean isEmpty(){
        if(list.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public T getFirst(){
        if(!isEmpty()){
            return list.get(0);
        }
        return null;
    }
    public int getFirstAsInt(){
        T firstElement = getFirst();
        if(firstElement == null){
            return 0;
        }

        return firstElement.intValue();
    }
    public T getLast(){
        if(!isEmpty()){
            return list.get(list.size()-1);
        }
        return null;
    }
    public int getLastAsInt(){
        if(!isEmpty()){
            T nb = list.get(list.size()-1);
                return nb.intValue();

        }
        return 0;
    }

    @Override
    public String toString() {
        return "NumbersBox{" +
                "list=" + list +
                '}';
    }
}