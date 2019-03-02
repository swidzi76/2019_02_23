package strings;

public class StringApp {
    public static void main(String[] args) {
        String s1 = "To jest napis ABC";
        System.out.println(s1);
        System.out.println(" długośc : " + s1.length());
        System.out.println(" gdzie jest 'jest' : " + s1.indexOf("jest"));
        System.out.println(" substring od 8 do 12 : " + s1.substring(8,13));
        System.out.println(" metoda concat dodaje 'coś jeszcze' : "+ s1.concat(" i coś jeszcze"));
        System.out.println(" zamiana na duże litery :" + s1.toUpperCase());
        System.out.println(" zamiana na małe litery :" + s1.toLowerCase());

        System.out.println(turnText("ABCD"));
        System.out.println( " uzycie metody turnBackModifyText z par '  abG UiHn   ' = "+ turnBackModifyText("  abG UiHn   "));
        System.out.println( " metoda zadanie 5 'abc i ach' : " + zadanie5("abc", "ach"));
        System.out.println( " metoda zadanie 5 'abc i bch' : " + zadanie5("abc", "bch"));
        System.out.println( " metoda zadanie 6 'abcdefgh' i sasasfgh' : " + zadanie6("abcdefgh", "sasasfgh"));
        System.out.println( " metoda zadanie 6 'abcdefgH' i sasasfgh' : " + zadanie6("abcdefgH", "sasasfgh"));
        String sNot = " abc nie i nie i nie ";
        System.out.println( " metoda zadanie 8 - notTreeTimes dla tekstu "+sNot+ " : "
                + notTreeTimes(sNot));
        String sNot2 = " abc nie i n i nie ";
        System.out.println( " metoda zadanie 8 - notTreeTimes dla tekstu "+sNot2+ " : "
                + notTreeTimes(sNot2));
        String sNot3 = " abnieniedsdsnielllnie ";
        System.out.println( " metoda zadanie 8 - notTreeTimes dla tekstu "+sNot3+ " : "
                + notTreeTimes(sNot3));
    }

    public static String turnText(String text){
        return new StringBuilder().append("Simon says:").append(text).toString();
    }

    public  static String turnBackModifyText(String text){
        return text.trim().toLowerCase();
    }
    // Napisz metodę, która jako argumenty będzie przyjmować dwie zmienne typu String
    // i zwróci true jeżeli oba teksty zaczynają się od tego samego znaku.

    public static boolean zadanie5(String s1, String s2){
        return (s1.charAt(0) == s2.charAt(0));
    }
    // Napisz metodę, która jako argumenty będzie przyjmować dwie zmienne typu String
    // i zwróci true jeżeli 3 ostatnie znaki w obu tekstach są takie same.
    public static boolean zadanie6(String s1, String s2){
        //System.out.println(s1.substring(s1.length()-3, s1.length() ));
        return (s1.substring(s1.length()-3, s1.length())).equals(s2.substring(s2.length()-3, s2.length()));
    }
    public static boolean notTreeTimes(String s){
        //System.out.println("nie na miejscu : " + s.indexOf("nie"));
        if (s.indexOf("nie") >= 0){
            int p1 = s.indexOf("nie");
            //System.out.println(" p1 = "+ p1);
            if(s.indexOf("nie", p1+1) >= 0){
                int p2 = s.indexOf("nie", p1+1);
                //System.out.println(" p2 = "+ p2);
                if(s.indexOf("nie", p2+1) >= 0){
                    return true;
                }

            }
        }
        return false;
        //return (s.indexOf("nie") >= 0 );

    }
}
