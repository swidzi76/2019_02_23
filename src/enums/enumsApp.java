package enums;

public class enumsApp {
    public static void main(String[] args) {
        Operation o1 = Operation.PLUS;
        o1.calculate(23,5);
        Operation o2 = Operation.MINUS;
        o2.calculate(23,5);
        Operation o3 = Operation.MULTIPLY;
        o3.calculate(23,5);
        Operation o4 = Operation.DIVIDE;
        o4.calculate(23,5);

        Currency c1 = Currency.DOLAR;
        c1.changePln(150);

        System.out.println(" który enum ma znak'-' :" + o1.getEnum("-"));
        System.out.println(" który enum ma znak'+' :" + Operation.DIVIDE.getEnum("+"));
    }
}
