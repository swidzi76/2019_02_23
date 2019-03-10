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
// ------------------------------------ ZADANIE 4 -----------------------------------------------
        System.out.println(" ------------------ ZADANIE 4 ---------------------------------------");
        Set<String> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String name = "";
        System.out.println(" Podaj imiona - q - koniec");
        while(true){
            System.out.print(">>>");
            name = scanner.nextLine();
            if("q".equalsIgnoreCase(name)){
                break;
            }
            set.add(name);

        }
        System.out.println(" Liczba zapamiętanych imion : "+ set.size());
        for (String str : set) {
            System.out.println(str);
        }


    }

}
