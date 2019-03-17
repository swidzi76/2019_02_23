package collections;

import java.util.*;

public class CollectionsApp {
    public static void main(String[] args) {
        List<Triangle> list = new ArrayList<>();
        list.add(new Triangle(3,5));
        list.add(new Triangle(4,7));
        list.add(new Triangle(3,4));
        list.add(new Triangle(3,9));
        list.add(new Triangle(3,1));
        System.out.println(" liczba ele. listy triangle : "+list.size());
        for (Triangle tr :list) {
            System.out.println(tr+ "Pole : "+tr.getArea()+ " Obwód : "+tr.getPerimeter());
        }
        List<Rectangle> listR = new ArrayList<>();
        listR.add(new Rectangle(12, 40));
        listR.add(new Rectangle(34, 404));
        listR.add(new Rectangle(42, 4));
        listR.add(new Rectangle(6, 44));
        listR.add(new Rectangle(15, 7));
        System.out.println(" liczba ele. listy rectangle : "+listR.size());
        for (Rectangle rec :listR) {
            System.out.println(rec+ "Pole : "+rec.getArea()+ " Obwód : "+rec.getPerimeter());
        }

        List<Figure> listF = new ArrayList<>();
        listF.add(new Triangle(2,4));
        listF.add(new Rectangle(6,7));
        listF.add(new Triangle(6,44));
        listF.add(new Rectangle(2,4));
        listF.add(new Triangle(1,7));
        listF.add(new Rectangle(26,489));
        System.out.println(" liczba ele. listy rectangle : "+listF.size());
        for (Figure f :listF) {
            System.out.println(f+ "Pole : "+f.getArea()+ " Obwód : "+f.getPerimeter());
        }
// ----------------------------------------------------------------------------------------------
// ------------------------------------ ZADANIE 2 -----------------------------------------------
        System.out.println(" ------------------ ZADANIE 2 ---------------------------------------");
        List<String> list1 = new ArrayList<>();
        list1.add("pierwszy");
        list1.add("drugi");
        list1.add("trzeci");
        list1.add("czwarty");
        list1.add("piąty");
        System.out.println(" Lista list1");
        for (String str :list1) {
            System.out.println(str);
        }

        List<String > list2 = new ArrayList<>();
        list2.add("szósty");
        list2.add("drugi");
        list2.add("trzeci");
        list2.add("siódmy");
        list2.add("ósmy");
        System.out.println(" Lista list2");
        for (String str :list2) {
            System.out.println(str);
        }

        // porównanie list
        if(list1 == list2){
            System.out.println(" listy są tym samym miejscem w pamięci - są identyczne");
        }else {
            System.out.println(" listy są w innym miejscu pamięci");
        }
        if(list1.size() == list2.size()){
            System.out.println(" listy mają takie same rozmiary");
        }else{
            System.out.println(" listy mają różne rozmiary");
        }
        System.out.println(" Elementy występujące w obu listach");
        for (String str: list1) {
            if(list2.indexOf(str) >= 0)
                System.out.println(str);
        }
        System.out.println(" Elementy różne w obu listach");
        if(list1.size() > list2.size()){
            for (String str: list1) {
                if(list2.indexOf(str) < 0)
                    System.out.println(str);
            }
        }else{
            for (String str: list2) {
                if (list1.indexOf(str) < 0)
                    System.out.println(str);
            }
        }
// ----------------------------------------------------------------------------------------------
// ------------------------------------ ZADANIE 3 -----------------------------------------------
        System.out.println(" ------------------ ZADANIE 3 ---------------------------------------");
        // Napisz klasę o nazwie Person, która będzie zawierać pola: firstName i lastName.
        // Klasa powinna implementować interfejs Comparable.
        // Następnie utwórz kolekcję i dodaj do niej kilka obiektów klasy Person.
        // Kolekcja powinna sortować alfabetycznie wszystkie dodawane elementy.
        List<Person> people = new ArrayList<>();
        people.add(new Person("Adam", "Słodowy"));
        people.add(new Person("Jan", "Kowalski"));
        people.add(new Person("Rocky", "Balboa"));
        people.add(new Person("Forest", "Gump"));
        people.add(new Person("Barry", "Allen"));
        people.add(new Person("Bruce", "Wayne"));
        System.out.println(" LIczba elementów w kolekcji : "+people.size());
        System.out.println(" Kolekcja przed sortowaniem ");
        for (Person p : people) {
            System.out.println(p);
        }
        Collections.sort(people);
        System.out.println();
        System.out.println(" Kolekcja po sortowaniu - > first name");
        for (Person p : people) {
            System.out.println(p);
        }


// ----------------------------------------------------------------------------------------------
// ------------------------------------ ZADANIE 4 -----------------------------------------------
//        System.out.println(" ------------------ ZADANIE 4 ---------------------------------------");
//        Set<String> set = new HashSet<>();
//        Scanner scanner = new Scanner(System.in);
//        String name = "";
//        System.out.println(" Podaj imiona - q - koniec");
//        while(true){
//            System.out.print(">>>");
//            name = scanner.nextLine();
//            if("q".equalsIgnoreCase(name)){
//                break;
//            }
//            set.add(name);
//
//        }
//        System.out.println(" Liczba zapamiętanych imion : "+ set.size());
//        for (String str : set) {
//            System.out.println(str);
//        }
// ----------------------------------------------------------------------------------------------
// ------------------------------------ ZADANIE 5 -----------------------------------------------
        System.out.println(" ------------------ ZADANIE 5 ---------------------------------------");
        // Poćwicz wykorzystanie klas Arrays oraz Collections.
        // Zapoznaj się z ich API i postaraj się wykorzystać dostępne metody do operacji na tablicach i kolekcjach.
        List<String> list3 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list3.add("string nr "+ (i+1));
        }
        List<String> list4 = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list4.add(" string nr "+(i+1));
        }
        // wypisanie list 3 i list 3
        for (String str: list3) {
            System.out.println(str);
        }
//        for (String str: list4) {
//            System.out.println(str);
//        }
        String string =  list3.get(3);

        System.out.println(" czy skasowany : " + list3.remove(string));
        // wypisanie list 3 i list 3
        System.out.println(" Wypisanie listy 3");
        for (String str: list3) {
            System.out.println(str);
        }

// ----------------------------------------------------------------------------------------------
// ------------------------------------ ZADANIE 6 -----------------------------------------------
        System.out.println(" ------------------ ZADANIE 6 ---------------------------------------");
        // * Rozszerz klasę Car z przykładu i dodaj do niej pola opisujące własności samochodu.
        // Utwórz kolekcję samochodów możliwych do kupna (przynajmniej 10 pozycji).
        // Następnie napisz program pozwalający użytkownikowi na przeszukiwanie kolekcji na
        // podstawie podawanych parametrów. Wynikiem powinna być lista dostępnych pojazdów.
        List<Car> carList = new LinkedList<>();
        carList.add(new Car("pierwszy", "blue", "opel"));
        carList.add(new Car("drugi", "red", "vw"));
        carList.add(new Car("trzeci", "yellow", "audi"));
        carList.add(new Car("czwarty", "blue", "audi"));
        carList.add(new Car("piąty", "black", "mercedes"));
        carList.add(new Car("szósty", "black", "vw"));
        carList.add(new Car("siódmy", "blue", "honda"));
        carList.add(new Car("ósmy", "white", "fiat"));
        carList.add(new Car("dziewiąty", "red", "chevrolet"));
        carList.add(new Car("dziesiąty", "white", "opel"));
        // wypisanie wszystkich samochodów
        System.out.println("Samochody do wyboru");
        for (Car car : carList ) {
            System.out.println(car);
        }
        Scanner scanner1 = new Scanner(System.in);
        String string1 = "";
        System.out.println(" wyszukiwanie ze względu na kolor samochodu");
        while(true){
            System.out.println(" Podaj kolor - q - koniec");
            System.out.print(">>>");
            string1 = scanner1.nextLine();
            if("q".equalsIgnoreCase(string1)){
                break;
            }
            for (Car car : carList ) {
                if(car.geColor().equalsIgnoreCase(string1)) {
                    System.out.println(car);
                }
            }

        }


    }
}
