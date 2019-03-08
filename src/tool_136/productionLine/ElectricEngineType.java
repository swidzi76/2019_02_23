package tool_136.productionLine;

public enum ElectricEngineType {
    E_50(100, "KW", 200, "kWh"),
    E_80( 150, "KW", 300, "kWh"),
    E_120( 180, "KW", 500, "kWh");
    private double power; // moc
    private String powerUnit;
    private int accuCapacity;   // pojemność baterii
    private String capacityUnit;

    ElectricEngineType(double power, String powerUnit, int accuCapacity, String capacityUnit) {
        this.power = power;
        this.powerUnit = powerUnit;
        this.accuCapacity = accuCapacity;
        this.capacityUnit = capacityUnit;
    }
    public Properties[] getProperities(){
        return new Properties[]{new Properties("Power", this.power, this.powerUnit ),
                new Properties("Accumulator capacity", this.accuCapacity, this.capacityUnit)};
    }

    public int howMuch() {
        int count = 0;
        for (ElectricEngineType et : ElectricEngineType.values()) {
            count++;
        }
        return count;
    }
    public double getPower() {
        return power;
    }

    public String getPowerUnit() {
        return powerUnit;
    }


}
