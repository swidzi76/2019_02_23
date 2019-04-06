package pro1.arrays;

import java.util.Arrays;
import java.util.List;

public class Tasks {

    public static void main(String[] args) {
        //#1
//        arraysOfStrings();

        //#2
        String[] words = {"one", "two", "three", "four"};
        System.out.println("Words = " + Arrays.toString(words));
//        String[] reversedWords = reverse(words);
//        System.out.println("reversedWords = " + Arrays.toString(reversedWords));

        //#3
        double[] numbers = {1.5, 6.9, -7.3, -7.5, 9, 10.1};
        double min = findMin(numbers);
        System.out.printf("min of %s is: %.2f%n", Arrays.toString(numbers), min);

        //#4
        String[] wordsExtended = copy(words, 10);
        System.out.println("wordsExtended = " + Arrays.toString(wordsExtended));

        //#4.1
        String[] wordsExtended2 = copy(10, "one", "two", "three", "four", "five");
        System.out.println("wordsExtended2 to 10 = " + Arrays.toString(wordsExtended2));
        wordsExtended2 = copy(3, "one", "two", "three", "four", "five");
        System.out.println("wordsExtended2 to 3 = " + Arrays.toString(wordsExtended2));

        //#5

        System.out.println(" dodawanie do tablicy");
        words = addElementToArray(words, "five");
        words = addElementToArray(words, "six");
        words = addElementToArray(words, "seven");
        System.out.println("wordsExtended = " + Arrays.toString(words));

        //#6
        System.out.println("-------- zadanie 6 -------------------");
        Car[] cars = {new Car("Porshe", 2011, 10),
                new Car("Skoda", 2004, 8), new Car("Ford", 2005, 9), new Car("Fiat", 2000, 4),
                      new Car("Audi", 2016, 8), new Car("Toyota", 2005, 7), new Car("Honda", 2011, 9), new Car("Ford", 2014, 9)};
        cars = sortCars(cars);
        System.out.println("cars sorted:");
        Arrays.stream(cars)
             .forEach(System.out::println);

        //#7
        System.out.println("----------- zadanie 7 -------------");
        cars = sortCarsByRating(cars);
        System.out.println("cars sorted by rating:");
        Arrays.stream(cars)
             .forEach(System.out::println);

        //#8* - dla chętnych
        //List<String> bestModels = extractTheBestModels(cars);
        //System.out.println("best models = " + bestModels);
    }

    /**
     * 1. Stwórz tablicę obiektów typu String. Wypisz na ekran pierwszy i ostatni element tablicy.
     * Następnie wypisz na ekran wszystkie stringi które zaczynają się na literę 'a'.
     */
    private static void arraysOfStrings() {
        String[] array ={"abc", "def","ghi","jk","ann"};
        System.out.println("pierwszy element : "+array[0]);
        System.out.println("ostatni element : "+array[array.length-1]);
        for (String s :array) {
            if(s.charAt(0) == 'a'){
                System.out.println(s);
            }
        }
    }

    /**
     * 2. Napisz metodę która odwróci kolejność występowania wyrazów w podanej tablicy
     */
    private static String[] reverse(String[] words) {
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            result[result.length-1 - i] = words[i];
        }
        return result;
    }

    /**
     * 3. Znajdź najmniejszą wartość w tablicy, zwróć ją jako wynik metody
     */
    private static double findMin(double[] numbers) {
        if(numbers.length == 0 || numbers == null){
            throw new IllegalArgumentException();
        }
        double min = numbers[0];
        for (double d : numbers) {
            if(d<min){
                min = d;
            }
        }
        return min;
    }

    /**
     * 4. Napisz metodę, która skopiuje elementy tablicy words do nowej tablicy o podanej wielkości (parametr length).
     * Jeżeli parametr length jest mniejszy niż wielkość tablicy words w nowej tablicy mają się znaleźć tylko elementy, które się zmieszczą.
     */
    private static String[] copy(String[] words, int length) {
        String[] result = new String[length];

        for (int i = 0; i < ((result.length < words.length) ? result.length: words.length); i++) {
            result[i] = words[i];
        }
        return result;
    }

    /**
     * 4.1 Spróbuj napisać podobną metodę ale zamiast tablicy words niech przyjmuje parametr typu varargs
     */
    private static String[] copy(int length, String... words) {
        String[] result = new String[length];

        for (int i = 0; i < ((result.length < words.length) ? result.length: words.length); i++) {
            result[i] = words[i];
        }
        return result;

//        return null;
    }

    /**
     * 5. Napisz metodę, która doda element do tablicy - jeżeli nie ma miejsca należy stworzyć nową tablicę dwukrotnie większą i skopiować elementy ze starej
     */
    private static String[] addElementToArray(String[] words, String word) {
        //czy jest puste miejsce
        int emptyPlace = -1;
        for (int i = 0; i < words.length; i++) {
            if(words[i] == null){
                emptyPlace = i;
                break;
            }

        }
        if(emptyPlace != -1){
            words[emptyPlace] = word;
            return words;
        }else{
            //powiększamy tablicę
            String[] result = new String[words.length*2];
            for (int i = 0; i < words.length; i++) {
                result[i] = words[i];
            }
            result[words.length] = word;
            return result;
        }
//        return null;
    }

    /**
     * 6. Dodaj do klasy Car możliwość sortowanie w porządku naturalnym (najpierw po marce, potem po roku produkcji).
     *    Następnie posortuj tablicę obiektów Car w porządku naturalnym i ją zwróć
     */
    private static Car[] sortCars(Car[] cars) {
        Arrays.sort(cars);
        return cars;
    }

    /**
     * 7. Posortuj tablicę obiektów Car w porządku dodatkowym, najpierw po ocenie malejąco, potem po marce rosnąco
     */
    private static Car[] sortCarsByRating(Car[] cars) {
        return null;
    }

    /**
     * 8*. Używając Stream API wyciągnij nazwy 3 modeli, które mają najwyższe oceny (w przypadku tej samej oceny młodszy wygrywa)
     */
    private static List<String> extractTheBestModels(Car[] cars) {
        return null;
    }
}