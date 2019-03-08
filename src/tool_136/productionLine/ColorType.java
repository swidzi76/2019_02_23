package tool_136.productionLine;

public enum ColorType {
    WHITE,
    BLACK,
    RED,
    BLUE,
    YELLOW,
    SILVER;

    public int howMuch(){
        int count = 0;
        for (ColorType ct : ColorType.values()) {
            count++;
        }
        return count;
    }

}
