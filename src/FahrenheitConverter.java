public class FahrenheitConverter {
    public static void main(String[] args) {
        double temp_f = 212;
        // c = (f-32)/1.8;
        double temp_c = (temp_f - 32) / 1.8;
        System.out.println(temp_f + " K to "+ temp_c + (char)176 + "C");
    }
}
