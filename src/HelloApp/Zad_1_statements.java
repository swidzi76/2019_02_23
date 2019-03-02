package HelloApp;

import java.util.Scanner;

public class Zad_1_statements {
    public static void main(String[] args) {
        /*int liczba = 6789;
        if(liczba < 0)
            System.out.println("liczba mniejsza od zera");
        if((liczba>=1)&&(liczba<=10))
            System.out.println("liczba z przedziału 1 - 10");
        if((liczba>=11)&&(liczba<=100))
            System.out.println("liczba z przedziału 11 - 100");
        if((liczba>=101)&&(liczba<=1000))
            System.out.println("liczba z przedziału 101 - 1000");
        if((liczba>=1001)&&(liczba<=10000))
            System.out.println("liczba z przedziału 1001 - 10000");
        if(liczba > 10000)
            System.out.println("liczba większa od 10000");*/

        //Zadanie 2
        /*Napisz program, który wypisze na ekran konsoli,
        słowo oznaczające ocenę dla podanej cyfry.
        Np. dla 1 - "niedostateczny", 2 - "mierny" itp.
        Obsłuż przypadek gdy cyfra jest poza skalą ocen.
         */

        /*int ocena = 3;
        String wynik = "";
        switch (ocena){
            case 1 : wynik = "niedostateczny"; break;
            case 2 : wynik = "dopuszczający"; break;
            case 3 : wynik = "dostateczny"; break;
            case 4 : wynik = "dobry"; break;
            case 5 : wynik = "bardzo dobry"; break;
            case 6 : wynik = "celujący"; break;
            default : wynik = "ocena poza skalą";
        }
        System.out.println(ocena + " to ocena : " + wynik);*/

        //Zadanie 3
        /*Napisz program, który wypisze na ekran konsoli,
        cyfrę arabską dla podanej liczby rzymskiej (od 1 do 9).
        Czyli np. dla 'I' wypisze 1, dla 'V' 5 itp.
        Obsłuż przypadek gdy podana liczba rzymska jest nieprawidłowa.
         */

        /*String l_rz = "V";
        rzymskieNaArabskie(l_rz);
        rzymskieNaArabskie("IV");
        rzymskieNaArabskie("H");
        rzymskieNaArabskie("IX");*/

        // Zadanie 4
        /*Napisz program, który wypisze na ekran konsoli czy podany kod Unicode jest liczbą (0-9),
        małą literą (a-z) czy też dużą literą (A-Z).
        Kody każdej z grup znaków następują po sobie więc wystarczy znaleźć
        kod np. dla litery 'a' i 'z' i sprawdzić czy podany kod zawiera się w tym przedziale.
         */
        /*char kod = '7';
        jakiZnak(kod);
        jakiZnak('c');
        jakiZnak('G');
        jakiZnak('9');
        jakiZnak('0');*/

        // Zadanie 5
        /*Napisz program, który dla podanej liczby wypisze na ekran konsoli dzień tygodnia
        (dla 1 - "poniedziałek", 2 - "wtorek" itp).
        Dodatkowo wyświetl ile dni zostało do weekendu,
        dla poniedziałku - 5 dni, wtorku - 4 itp.
         */
        /*nrDniaNaNazwe(3);
        nrDniaNaNazwe(7);
        nrDniaNaNazwe(1);
        nrDniaNaNazwe(8);*/

        System.out.println("Podaj dzień tygodnia");
        Scanner scanner = new Scanner(System.in);

        int numer = scanner.nextInt();
        nrDniaNaNazwe(numer);
    } // main
    public static void nrDniaNaNazwe(int nr){
        String dzien = "";
        int idw = -1; // ile dni do wekkendu
        switch (nr){
            case 1 : dzien = "poniedziałek";idw = 5; break;
            case 2 : dzien = "wtorek";idw = 4; break;
            case 3 : dzien = "środa";idw = 3; break;
            case 4 : dzien = "czwartek";idw = 2; break;
            case 5 : dzien = "piątek";idw = 1; break;
            case 6 : dzien = "sobota";idw = 0; break;
            case 7 : dzien = "niedziela";idw = 0; break;

            default: dzien = "blędny dzień tygodnia ( od 1 do 7) !!!";

        }
        System.out.println("Dzień o numerze "+ nr+" to "+ dzien);
        if(idw >=0)
            System.out.println("Do wekkendu pozostało "+idw+" dni");
    }
    public static void jakiZnak(char c){
        if(c>='0' && c <= '9')
            System.out.println("kod :"+ c + " jest liczbą");
        if(c >= 'a' && c <= 'z')
            System.out.println("kod :"+ c + " jest małą literą");
        if(c >= 'A' && c <= 'Z')
            System.out.println("kod :"+ c + " jest dużą literą");

    }
    public static void rzymskieNaArabskie(String l_rz){
        int l_a;
        switch (l_rz){
            case "I" : l_a = 1; break;
            case "II" : l_a = 2; break;
            case "III" : l_a = 3; break;
            case "IV" : l_a = 4; break;
            case "V" : l_a = 5; break;
            case "VI" : l_a = 6; break;
            case "VII" : l_a = 7; break;
            case "VIII" : l_a = 8; break;
            case "IX" : l_a = 9; break;
            default : l_a = -1;
        }
        if(l_a > 0)
            System.out.println("liczba rzymska " + l_rz + " to liczba arabska : " + l_a);
        else
            System.out.println("liczba rzymska " + l_rz + " jest nieprawidłowa");

    }
}
