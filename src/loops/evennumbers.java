package loops;


import javax.swing.*;
import java.util.Scanner;

public class evennumbers {
    public static void main(String[] args) {
        evenNumbers(10);
        evenNumbers(20);

        System.out.println(" 2^8 ="+ power(2,8));
        System.out.println(" 2^30 ="+ power(2,30));
        System.out.println(" 9^10 ="+ power(9,10));
        System.out.println(" 1^8 ="+ power(1,8));
        bigLetters2();
        String s1 = "abcdefgh";
        String s2 = "abcdefgh";
        String s3 = " jfhdjhf";
        System.out.println("porównanie "+s1+" i "+s2+ " daje :"+ifEqualsString(s1,s2));
        System.out.println("porównanie "+s1+" i "+s3+ " daje :"+ifEqualsString(s1,s3));

        s1 = " zbfthyzbfjnhybhzbf";
        s2 = "zbf";
        System.out.println(" liczba wystąpień frazy '"+s2+"' w tekscie '"+s1+"' wynosi :"+howManyInstances(s1,s2));

        // zadanie 6
        //sumNumbersFromUser(5);
        // zadanie 7
        rectangle(8,5);
        // zadanie 8
        //sumNumbersFromUser1(5);
        //zadanie 9
        s1 = "kobyła ma mały bok";
        System.out.println("czy '" + s1+ "' jest palindromem :"+ palindrome(s1));
        s2 = "abcba";
        System.out.println("czy '" + s2+ "' jest palindromem :"+ palindrome(s2));
        s3 = "abfcba";
        System.out.println("czy '" + s3+ "' jest palindromem :"+ palindrome(s3));
    }

    // -----------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------
    // ------------------------------------- Rozwiązanie zadań ---------------------------------------------
    // -----------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------



    // Zadanie 1
    // Napisz metodę, która wyświetli na ekranie n-pierwszych liczb parzystych.
    // Zmienna n to parametr metody. Czyli np. dla n = 4 program powinien wypisać: 2, 4, 6, 8

    public static void evenNumbers( int ile){
        System.out.println(" wyświetlamy "+ ile+ " liczb parzystych");
        for(int i = 1; i <= ile; i++ )
            System.out.print(""+2*i+", ");
        System.out.println("");

    }
    // Zadanie 2
    // Napisz metodę, która policzy n-tą potęgę (n >= 0)
    // liczby całkowitej a. Parametry metody to: n i a.
    public static double power(int a, int n){
        if (n < 0)
            return -1;
        if (n == 0)
            return 1;
        double result = a;
        for(int i = 1 ; i < n; i++ ){
            result *=a;
        }
        return result;
    }

    // Zadanie 3
    // Wypisz na ekran co drugą, dużą literę alfabetu łacińskiego,
    // zaczynając od 'A' i kończąc na 'Z'.
    // Użyj pętli for, a potem spróbuj przerobić program używając pętli while.

    public static void bigLetters2(){
        System.out.println(" Co druga duża litera - wersja FOR");
        for(int i = 'A'; i <= 'Z'; i+=2 )
            System.out.print((char)i+", ");
        System.out.println("");

        System.out.println(" Co druga duża litera - wersja WHILE");
        int i = 'A';
        while(i <= 'Z'){
            System.out.print((char)i+", ");
            i+=2;
        }
        System.out.println("");
    }

    //Zadanie 4
    // Napisz metodę która sprawdzi czy dwa podane Stringi (zmienne typu String)
    // są takie same - bez użycia metody equals().
    //Podpowiedź: możesz porównać oba teksty znak po znaku używając jednej z metod klasy String.
    public static boolean ifEqualsString(String s1, String s2){
        if (s1 == null || s2 == null)
            return false;
        if(s1.length() != s2.length())
            return false;
        for(int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;

    }
    // Zadanie 5
    // Napisz metodę sprawdzającą ilość wystąpień frazy: phrase w tekście: text.
    // Parametry metody to: phrase i text.
    // Podpowiedź: użyj metody klasy String która sprawdza index dla podanej frazy
    // jeżeli metoda zwraca -1 to znaczy, że jest błąd
    public static int howManyInstances(String text, String phrase){
        if (text == null || phrase == null)
            return -1;
        int counter = 0;
        int index = 0;
        while(text.indexOf(phrase, index) >= 0){
            counter++;
            index = text.indexOf(phrase, index) + 1;
        }
        return counter;
    }
    // Zadanie 6
    // Zmień metodę pl.sda.loops.ForLoop.sumNumbersFromUser() tak by przyjmowała liczby typu float.
    // W podsumowaniu oprócz sumy wypisz także średnią arytmetyczną podanych liczb.
    public static void sumNumbersFromUser(int numbersSize){
        float sum = 0;
        for (int i = 1; i <= numbersSize; i++) {
            String numberInString = JOptionPane.showInputDialog("Podaj liczbę nr "+i+" z "+numbersSize);
            float numberFromUser = Float.valueOf(numberInString);
            System.out.println("Liczba nr " + i + " to: " + numberFromUser);
            sum += numberFromUser;
        }

        System.out.println("sum = " + sum);
        System.out.println("average = " + sum/numbersSize);

    }

    // Zadanie 7
    // Napisz metodę która wyświetli na ekranie prostokąt o podanych rozmiarach:
    // width i height (to są parametry metody).
    // Podpowiedź: zobacz metodę: pl.sda.loops.ForLoop.leftTriangle()
    public static void rectangle(int width, int heigh){
        for (int i = 0; i < heigh; i++) {
            for (int j = 0; j < width; j++) { //pętla w pętli
                System.out.print("*");
                }
            System.out.println("");
        }


    }

    // Zadanie 7
    // Utwórz program który będzie pobierał od użytkownika liczby typu float
    // aż do momentu osiągnięcia limitu podanego jako parametr metody.
    // Na koniec wypisz ile było tych liczb, jaka była ich suma (z częścią ułamkową) i
    // jaka jest ich średnia arytmetyczna.
    // limit - ilośc pobranych liczb
    public  static void sumNumbersFromUser1(int numberOfNumbers){
        System.out.println(" Podaj "+numberOfNumbers+" liczb rzeczywistych odzielając część ułamkową PRZECINKIEM -,-");
        Scanner scanner = new Scanner(System.in);
        float sum = 0;
        for(int i = 1; i <= numberOfNumbers; i++){
            System.out.println(" Podaj liczbę "+i+" z "+numberOfNumbers);
            sum += scanner.nextFloat();
        }
        System.out.println("liczb : "+numberOfNumbers);
        System.out.println("suma : "+sum);
        System.out.println("średnia arytmetyczna : " + sum / numberOfNumbers);
    }

    // Zadanie 8
    // Napisz metodę sprawdzającą, czy dany łańcuch znaków jest palindromem.
    public static boolean palindrome(String text){
        // aby metoda sprawdzała wyrażenia trzeba usunąć spacje
        StringBuilder sTemp = new StringBuilder();
        for(int i = 0; i <text.length(); i++){
            if(text.charAt(i) != ' ')
                sTemp.append(text.charAt(i));
        }
        //System.out.println(sTemp);
        for(int i = 0; i < sTemp.length() / 2; i++){
            if(sTemp.charAt(i) != sTemp.charAt(sTemp.length()-1-i))
                return false;

        }
        return true;
    }
}
