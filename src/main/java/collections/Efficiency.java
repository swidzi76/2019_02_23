package collections;

// ZADANIE 7
// * Napisz program, który porówna wydajność działania operacji na kolekcjach typu
// ArrayList, LinkedList, HashSet, TreeSet oraz HashMap, TreeMap.

import java.util.*;

public class Efficiency {
    public static void main(String[] args) {
        final  int MAX_NUMBER = 20000;
        final  int MAX_COUNT = 200_000;
        System.out.println("   -----   Zadanie polega na wylosowaniu "+MAX_COUNT+" liczb losowych");
        System.out.println("   -----    z przedziału od 0 do "+MAX_NUMBER);
        System.out.println(" Test dla ArrayList");
        List<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < MAX_COUNT; i++) {
            arrayList.add(random.nextInt(MAX_NUMBER));
        }
        long timeStop = System.currentTimeMillis();
        System.out.println(" Czas wykonania "+MAX_COUNT+" operacji to :"+(timeStop-timeStart)+" ms");
        // -----------------------------------------------------------------------------------------
        System.out.println(" Test dla LinkedList");
        List<Integer> linkedList = new LinkedList<>();
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < MAX_COUNT; i++) {
            linkedList.add(random.nextInt(MAX_NUMBER));
        }
        timeStop = System.currentTimeMillis();
        System.out.println(" Czas wykonania "+MAX_COUNT+" operacji to :"+(timeStop-timeStart)+" ms");
        // -----------------------------------------------------------------------------------------
        System.out.println(" Test dla HashSet");
        Set<Integer> hashSet = new HashSet<>();
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < MAX_COUNT; i++) {
            hashSet.add(random.nextInt(MAX_NUMBER));
        }
        timeStop = System.currentTimeMillis();
        System.out.println(" Czas wykonania "+MAX_COUNT+" operacji to :"+(timeStop-timeStart)+" ms");
        // -----------------------------------------------------------------------------------------
        System.out.println(" Test dla TreeSet");
        Set<Integer> treeSet = new TreeSet<>();
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < MAX_COUNT; i++) {
            treeSet.add(random.nextInt(MAX_NUMBER));
        }
        timeStop = System.currentTimeMillis();
        System.out.println(" Czas wykonania "+MAX_COUNT+" operacji to :"+(timeStop-timeStart)+" ms");
        // -----------------------------------------------------------------------------------------
        System.out.println(" Test dla HashMap");
        Map<Integer, Integer> hashMap = new HashMap<>();
        timeStart = System.currentTimeMillis();
        for (int i = 0; i < MAX_COUNT; i++) {
        //    hashMap.entrySet(random.nextInt(MAX_NUMBER), random.nextInt(MAX_NUMBER));
        }
        timeStop = System.currentTimeMillis();
        System.out.println(" Czas wykonania "+MAX_COUNT+" operacji to :"+(timeStop-timeStart)+" ms");

    }
}
