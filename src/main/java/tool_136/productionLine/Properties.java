package tool_136.productionLine;

public class Properties {
    private String name;
    private double value;
    private String unit;

    public Properties( String name, double value, String unit) {
        this.name = name;
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }
    public String getName() {
        return name;
    }
    public String getUnit(){
        return unit;
    }
    @Override
    public String toString() {
        return " " + name + " = " + value + " [" + unit + "]";
    }
}
