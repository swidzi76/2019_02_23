package stat;
// ZADANIE 1
// Napisz własną klasę Math, która będzie posiadać metody statyczne:
// add, subtract, multiply, divide, min, max, pow
// gdzie każda z nich będzie przyjmowała dwa parametry liczbowe. Dla każdej z metod utwórz przykład użycia.

// ZADANIE 2
// Dodaj do klasy Math statyczną stałą PI = 3,14,
// a następnie dodaj metodę do wyliczania pola koła (πr2).
// W przykładzie użycia oblicz pole koła o promieniu: 8.

// ZADANIE 3
// Dodaj do swojej klasy konstruktor prywatny, który nie pozwoli utworzyć instancji klasy.

// ZADANIE 4
// * Dodaj do klasy Math statyczne klasy wewnętrzne i zadbaj o odpowiedni podział metod.
// Przykład: Operation [multiply, divide, add, minus], Compare [min, max]
// Zmodyfikuj swoje przykłady użycia.

public class Math {
    private static double PI = 3.14;

    private Math(){}
    public static class Operation {
        public static int add(int a, int b){
            return a+b;
        }
        public static int substract(int a, int b){
            return a - b;
        }
        public static int multiply(int a, int b){
            return a * b;
        }

        public static int divide(int a, int b){
            return a / b;
        }

    }
    public static class Compare {
        public static int min(int a, int b) {
            return ((a < b) ? a : b);
        }
        public static int max(int a, int b) {
            return ((a > b) ? a : b);
        }

    }

    public static double circularField(int radius){
        return PI * pow(radius,2);
    }

//    public static int min(int a, int b){
//        if(a < b){
//            return a;
//        }
//        else
//            return b;
//    }
//    public static int max(int a, int b){
//        if(a > b){
//            return a;
//        }
//        else
//            return b;
//    }
    public static int pow(int a, int b){
        int pow = 1;
        for (int i = 0; i < b; i++) {
            pow *= a;
        }
        return pow;
    }


}
