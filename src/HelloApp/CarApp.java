package HelloApp;

public class CarApp {
    public static void main(String[] args) {
        Car c1 = new Car("Opel", "blue", new Entertaiment(false, 10));
        System.out.println(c1.toString());
        c1.turnOnRadio();
        System.out.println(c1.toString());
        c1.setVolume(50);
        System.out.println(c1.toString());
    }
}
