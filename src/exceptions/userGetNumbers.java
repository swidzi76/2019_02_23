package exceptions;

// ZADANIE 4
// Napisz program, który przyjmie od użytkownika ciąg liczb oddzielonych spacją.
// Następnie obliczy sumę podanych liczb i wyświetli ją na ekranie.
// Dodaj obsługę wyjątków w taki sposób, by na ekranie zawsze pojawiła się odpowiedź -
// samodzielnie znajdź możliwe do wystąpienia wyjątki.

// ZADANIE 5
// * Utwórz własny wyjątek, który będzie rzucany przez metodę do sumowania liczb z poprzedniego punktu,
// w momencie gdy suma będzie mniejsza od zera.

// ZADANIE 6
// * Napisz obsługę własnego wyjątku.
// -----> MyNewException
import java.util.Scanner;

public class userGetNumbers {
    public static void main(String[] args) {
        String string = "";
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Q - exit");
            System.out.print(">>>");
            string = scanner.nextLine();

            if("q".equalsIgnoreCase(string))
                break;
            try {
                sum = getUserSumNumbers(string);
//                String[] arrayStr = string.split(" ");
//                for (String str : arrayStr) {
//                    sum += Integer.parseInt(str);
//                }
//                if(sum < 0){
//                    throw new MyNewException("Suma mniejsza od zera");
//                }
            }catch (MyNewException mne){
                System.out.println(" wyjątek : "+ mne +
                        " \n message from throw MyNewException " + mne.getMessage()+
                        " \n wartość sumy podczas wystąpienie wyjatku : "+mne.getSum());
                sum = mne.getSum();
            }catch (Exception e){
                System.out.println(" wyjątek : "+e);
            }
            System.out.println("suma = "+sum);

        }
    }
    public static int getUserSumNumbers(String string) throws MyNewException{
        int sum = 0;
        String[] arrayStr = string.split(" ");
        for (String str : arrayStr) {
            sum += Integer.parseInt(str);
        }
        if(sum < 0){
            throw new MyNewException("Suma mniejsza od zera", sum);
        }
        return sum;
    }

}
