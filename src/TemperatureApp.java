public class TemperatureApp {
    public static void main(String[] args) {
        Temperature temp = new Temperature(23.6,"2019-02-24", "16:00");
        System.out.println("data : "+ temp.getDate());
        System.out.println("godzina : "+ temp.getHour());
        System.out.println("temperatura : "+ temp.getTemperature());
        System.out.println("metoda show : "+ temp.show());
        System.out.println("metoda show w [F] : "+ temp.showInFarenheit());

    }
}
