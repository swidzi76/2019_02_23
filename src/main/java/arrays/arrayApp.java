package arrays;

import HelloApp.Car;
import HelloApp.Entertaiment;

public class arrayApp {
    public static void main(String[] args) {
        System.out.println("------------------------ ZADANIE 1 ----------------------------");
        String[] s = {"abc", "sbdshd", "shdgsdgs", "sdjgds"};
        showStringArray(s); // Zadanie 1
        int[] arrayInt = {3, 7, 8, 9,12};

        System.out.println("------------------------ ZADANIE 2 ----------------------------");
        System.out.println( sumArrayInt(arrayInt)); // zadanie 2

        System.out.println("------------------------ ZADANIE 3 ----------------------------");
        showIntArray(makeArrayOfEvenNumbers(10)); /// zadanie 3
        // Zadanie 4
        System.out.println("------------------------ ZADANIE 4 ----------------------------");
        double[] arrayDouble = {3.8, 7.9, 7.0, -34.7};
        System.out.println("tablica liczb rzeczywistych");
        showDoubleArray(arrayDouble);
        makeDoubleArray(arrayDouble);
        System.out.println("podwojona tablica liczba rzeczywistych");
        showDoubleArray(arrayDouble);

        //Zadanie 5
        System.out.println("------------------------ ZADANIE 5 ----------------------------");
        showFirstMiddleLastElementOfArrayDouble(arrayDouble);
        double[] arrayDouble1 = {3.8};
        showFirstMiddleLastElementOfArrayDouble(arrayDouble1);

        // Zadanie 6

        System.out.println("----------------- ZADANIE 6 -----------------------");
        Entertaiment rOff = new Entertaiment(false, 0);
        Entertaiment rOn = new Entertaiment(true, 50);
        Car car1 = new Car("Opel", "red", rOff);
        Car[] arrayOfCar = new Car[]{   new Car("Audi", "white", rOn),
                                        new Car("ford", "black", rOff),
                                        new Car("Opel", "green", rOn),
                                        new Car("Hyundai", "blue", rOff)};


        System.out.println("Wypisanie tablicy el. Car");
        showArrayOfCar(arrayOfCar);
        System.out.println("Wypisanie odwóconej tablicy el. Car");
        showArrayOfCar(reverseArrayOfCar(arrayOfCar));

        // Zadanie 7
        // Przerób każdą z poprzednich metod (poza nr 3)
        // tak żeby przyjmowała parametry jako varargs.
        System.out.println("------------------------ ZADANIE 7 ----------------------------");

        // Zadanie 8
        // Przerób metodę z zadania nr 2 tak, żeby metoda przyjmowała tablicę dwuwymiarową typu int[][] i
        // liczyła sumę z wszystkich tablic.
        System.out.println("------------------------ ZADANIE 8 ----------------------------");
        int[][] arrayInt2d = new int[][]{
                {2, 4, 5, 6, 8, 12},
                {-2, -5, 7, 9, 34, 6}
        };
        showArrayInt2d(arrayInt2d);
        System.out.println(" suma wszystkich elementów = " + sumArrayInt2d(arrayInt2d));

    }
    // ------------------------------------------------------------------------------
    // -------------------- funkcje relizujące zadania ------------------------------
    // ------------------------------------------------------------------------------


//    public static void showStringArray(String[] str){
//        for(int i=0; i < str.length; i++)
//            System.out.print(str[i]+", ");
//        System.out.println("");
//    }
    // Zadanie 1 -> Zadanie 7 - zamiana na varagrs
    private static void showStringArray(String... str){
        for(int i=0; i < str.length; i++)
            System.out.print(str[i]+", ");
        System.out.println();
    }

    private static void showIntArray(int[] str){
        for(int i=0; i < str.length; i++)
            System.out.print(str[i]+", ");
        System.out.println();
    }
//    private static void showDoubleArray(double[] str){
    private static void showDoubleArray(double... str){
        for(int i=0; i < str.length; i++)
            System.out.print(str[i]+", ");
        System.out.println();
    }
    // Zadanie 2
    //private static int sumArrayInt(int[] array){
    private static int sumArrayInt(int... array){
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        return sum;
    }

    private static int[] makeArrayOfEvenNumbers(int n){
        int[] temp = new int[n];
        for(int i = 0; i < temp.length; i++)
            temp[i] = 2*(i+1);
        return temp;
    }

    private static void makeDoubleArray(double... tab){
        for(int i = 0; i< tab.length; i++)
            tab[i] *= 2;
    }

    private static void showFirstMiddleLastElementOfArrayDouble(double... arr){
        System.out.println("pierwszy element to :"+ arr[0]);
        if((arr.length % 2) != 0){
            // nieparzysta liczba elementów zwacamy środkowy
            System.out.println("Element środkowy to :"+arr[(arr.length-1)/2]);
        }else{
            // parzysta liczba elementów - zwracamy dwa
            System.out.println("Elementy środkowe to:"+arr[(arr.length/2)-1]+ " oraz "+ arr[(arr.length/2)]);;
        }
        System.out.println("ostatni element to:"+ arr[arr.length-1]);
        double sum = 0;
        for(int i = 0; i < arr.length; i++)
            sum += arr[i];
        System.out.println(" Wartość średnia elementów tablicy to :"+sum / arr.length);


    }
    private static void showArrayOfCar(Car... arr){
        for (Car c: arr) {
            System.out.println(c);
        }
    }
    private static Car[] reverseArrayOfCar(Car... arr){
        Car cTemp;
        for (int i = 0; i < (arr.length / 2); i++) {
            cTemp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = cTemp;
        }
        return arr;
    }
    // Zadanie 8
    private static int sumArrayInt2d(int[][] arrInt2d){
        int sum = 0;
        for (int i = 0; i < arrInt2d.length;  i++) {
            for (int j = 0; j < arrInt2d[i].length; j++) {
                sum += arrInt2d[i][j];
            }

        }
        return sum;
    }
    private static void showArrayInt2d(int[][] arrInt2d){
        for (int i = 0; i < arrInt2d.length ; i++) {
            for (int j = 0; j < arrInt2d[i].length-1; j++) {
                System.out.print(arrInt2d[i][j]+", ");
            }
            System.out.println(arrInt2d[i][arrInt2d[i].length-1]);


        }
    }



}
