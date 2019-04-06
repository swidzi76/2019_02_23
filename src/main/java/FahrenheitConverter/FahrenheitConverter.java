package FahrenheitConverter;

//public class FahrenheitConverter.FahrenheitConverter {
//    public static void main(String[] args) {
//        double temp_f = 212;
//        // c = (f-32)/1.8;
//        double temp_c = (temp_f - 32) / 1.8;
//        System.out.println(temp_f + " K to "+ temp_c + (char)176 + "C");
//    }
//}
// ---------------------------------------------------------------------------
// zmiana 24-02-2019
public class FahrenheitConverter {
    private double temp_f = 212;
    // c = (f-32)/1.8;

    public FahrenheitConverter(){

    }
    public FahrenheitConverter(double temp_f) {
        this.temp_f = temp_f;
    }

    public double convertToCelsius(){
        return (temp_f - 32) / 1.8;

    }
    public double convertToCelsius(double temperatureInFahrenheit){
        return (temperatureInFahrenheit - 32) / 1.8;
    }
    public double convertCelsiusToFarenheit(double temperatureInCelsius){
        return (temperatureInCelsius *1.8)+32;
    }
    @Override
    public String toString() {
        return "" + temp_f + " K to "+ ((temp_f - 32) / 1.8) + (char)176 + "C";
    }

    //double temp_c = (temp_f - 32) / 1.8;
    //System.out.println(temp_f + " K to "+ temp_c + (char)176 + "C");
}
