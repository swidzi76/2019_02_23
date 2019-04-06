package HelloApp;

public class HelloWorldApp {
    public static void main(String[] args) {
        Car opel = new Car("Opel", "blue", new Entertaiment(true, 30 ));
        System.out.println("My car is:" + opel);
    }
}
