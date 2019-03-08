package tool_136.productionLine;

public enum BodyType {
    SEDAN,
    HATCHBACK,
    LIFTBACK,
    COUPE,
    CABRIOLET,
    ROADSTER,
    COMBO,
    MINIVAN,
    PICK_UP;

    public int howMuch() {
        int count = 0;
        for (BodyType bt : BodyType.values()) {
            count++;
        }
        return count;
    }
}
