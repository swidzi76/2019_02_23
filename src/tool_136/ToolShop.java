package tool_136;

public class ToolShop {
    public static void main(String[] args) {
        Hammer ham1 = new Hammer("A40", 4.67, 0.5);
        Saw saw1 = new Saw("S340", 6.80, 340);
        Tool tool1 = new Tool("Tool 120", 5.90);
        System.out.println(ham1.toString());
        System.out.println(saw1.toString());
        System.out.println(tool1.toString());

        System.out.println();
        System.out.println(" ZADANIE 4");
        ShoppingCart sc = new ShoppingCart();
        sc.addTool(ham1, saw1, tool1);
        sc.addTool(saw1, ham1, tool1);
        sc.addTool(new Hammer("abc", 3.56, 1),
                    new Saw("cba", 2.90, 350),
                    new Saw("cba2", 6.23, 700),
                    new Hammer(" Młotek 10", 6.90, 6),
                    new Saw("Piła 11", 5.55, 600));
        System.out.println(" liczba narzędzi w koszyku : " + sc.getNumberOfToolsInCart());
        sc.showShoppingCart();
        System.out.println();
        System.out.println(" Cena całkowita - Total price : " + Math.round(sc.getPriceOfCart()*100)/100.0);

    }
}