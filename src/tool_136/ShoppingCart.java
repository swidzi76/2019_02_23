package tool_136;

public class ShoppingCart {
    private Tool[] tools;
    private final int MAX_NUMBERS_OF_TOOLS = 10;
    private int index = 0;

    public ShoppingCart() {
        tools = new Tool[MAX_NUMBERS_OF_TOOLS];
    }
    public void addTool(Tool... tool){
        for (int i = 0; i < tool.length; i++) {
            if(index < MAX_NUMBERS_OF_TOOLS){
                tools[index++] = tool[i];

            }else{
                return;
            }
        }
//        tools[index++] = tool;

    }
    public int getNumberOfToolsInCart(){
        return index;
    }
    public double getPriceOfCart(){
        double price = 0;
        for (int i = 0; i < index; i++) {
            price += tools[i].getPrize();
        }
        return price;
    }
    public void showShoppingCart(){
        for (int i = 0; i < index; i++) {
            System.out.println(tools[i].toString());
        }
    }
}
