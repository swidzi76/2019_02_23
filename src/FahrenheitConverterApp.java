public class FahrenheitConverterApp {
    public static void main(String[] args) {
        FahrenheitConverter temp = new FahrenheitConverter(212);
        System.out.println( temp.toString());
        System.out.println(temp.convertToCelsius());
        System.out.println(temp.convertToCelsius(500));
        System.out.println(temp.convertCelsiusToFarenheit(260));
    }
}
