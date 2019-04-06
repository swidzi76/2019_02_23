package tool_136.productionLine;

public enum EngineType {
    DIESEL,
    PETROL,
    ELECTRIC,
    HYBRID;

    public int howMuch(){
        int count = 0;
        for (EngineType et : EngineType.values()) {
            count++;
        }
        return count;
    }
}
