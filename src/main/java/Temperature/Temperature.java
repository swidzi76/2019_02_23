package Temperature;

import FahrenheitConverter.FahrenheitConverter;


public class Temperature {
    private double temperature;
    private String date;
    private String hour;

    public Temperature(double temperature, String date, String hour) {
        this.temperature = temperature;
        this.date = date;
        this.hour = hour;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getDate() {
        return date;
    }

    public String getHour() {
        return hour;
    }
    public String show(){
        return ""+ date+ " " + hour + "  temp :"+ temperature+(char)176 + "C";
    }
    public String showInFarenheit(){
        FahrenheitConverter tempF = new FahrenheitConverter();
        return ""+ date+ " " + hour + "  temp :"+ tempF.convertCelsiusToFarenheit(temperature)+" F";
    }
}
