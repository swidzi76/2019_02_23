package arrays;

import HelloApp.Car;

public class arrayApp {
    public static void main(String[] args) {
        String[] s = {"abc", "sbdshd", "shdgsdgs", "sdjgds"};
        showStringArray(s);
        int[] arrayInt = {3, 7, 8, 9,12};
        System.out.println( sumArrayInt(arrayInt));
        showIntArray(makeArrayOfEvenNumbers(10)); /// zadanie 3
        // Zadanie 4
        double[] arrayDouble = {3.8, 7.9, 7.0, -34.7};
        System.out.println("tablica liczb rzeczywistych");
        showDoubleArray(arrayDouble);
        makeDoubleArray(arrayDouble);
        System.out.println("podwojona tablica liczba rzeczywistych");
        showDoubleArray(arrayDouble);

        //Zadanie 5
        showFirstMiddleLastElementOfArrayDouble(arrayDouble);
        double[] arrayDouble1 = {3.8};
        showFirstMiddleLastElementOfArrayDouble(arrayDouble1);

        // Zadanie 6
        Car car1 = new Car("Opel", "red");
        Car[] arrayOfCar = new Car[]{   new Car("Audi", "white"),
                                        new Car("ford", "black"),
                                        new Car("Opel", "green"),
                                        new Car("Hyundai", "blue")};


        //showArrayOfCar(Car[] arr);
        //showArrayOfCar(reverseArrayOfCar(arrayOfCar));

    }

//    public static void showStringArray(String[] str){
//        for(int i=0; i < str.length; i++)
//            System.out.print(str[i]+", ");
//        System.out.println("");
//    }

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
    private static void showDoubleArray(double[] str){
        for(int i=0; i < str.length; i++)
            System.out.print(str[i]+", ");
        System.out.println();
    }
    private static int sumArrayInt(int[] array){
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

    private static void makeDoubleArray(double[] tab){
        for(int i = 0; i< tab.length; i++)
            tab[i] *= 2;
    }

    private static void showFirstMiddleLastElementOfArrayDouble(double[] arr){
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

}
