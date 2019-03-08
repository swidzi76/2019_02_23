package tool_136.productionLine;

public enum HybridEngineType {
    H_1(150, "KM", 60, "kW"),
    H_2( 180, "KM", 90, "kW");
    private double power; // moc
    private String powerUnit;
    private double powerElectric;
    private String powerElectricUnit;

    HybridEngineType(double powerEngine, String powerEngineUnit,
                     double powerElektricEngine, String powerElectricEngineUnit) {
        this.power = powerEngine;
        this.powerUnit = powerEngineUnit;
        this.powerElectric = powerElektricEngine;
        this.powerElectricUnit = powerElectricEngineUnit;
    }
    public Properties[] getProperities(){
        return new Properties[]{new Properties("Engine power", this.power, this.powerUnit ),
                new Properties("Electric engine power", this.powerElectric, this.powerElectricUnit)};
    }

    public int howMuch() {
        int count = 0;
        for (HybridEngineType ht : HybridEngineType.values()) {
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

    public double getPowerElectric() {
        return powerElectric;
    }

    public String getPowerElectricUnit() {
        return powerElectricUnit;
    }
}
