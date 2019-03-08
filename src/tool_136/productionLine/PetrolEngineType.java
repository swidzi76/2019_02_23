package tool_136.productionLine;

public enum PetrolEngineType {
    P_1200(100, "KM", 1200, "cm^3", 52.3, "Nm"),
    P_1600( 150, "KM", 1600, "cm^3", 83.7, "Nm"),
    P_1800( 180, "KM", 1800, "cm^3", 130.6, "Nm"),
    P_2500( 238, "KM", 2500, "cm^3", 180.6, "Nm"),
    P_3200( 300, "KM", 3200, "cm^3", 250.7, "Nm");
    private double power; // moc
    private String powerUnit;
    private int capacity;   // pojemność
    private String capacityUnit;
    private double torque;  // moment obrotowy
    private String torgueUnit;

    PetrolEngineType(double power, String powerUnit, int capacity, String capacityUnit, double torque, String torgueUnit) {
        this.power = power;
        this.powerUnit = powerUnit;
        this.capacity = capacity;
        this.capacityUnit = capacityUnit;
        this.torque = torque;
        this.torgueUnit = torgueUnit;
    }
    public Properties[] getProperities(){
        return new Properties[]{new Properties("Power", this.power, this.powerUnit ),
                new Properties("Capacty", this.capacity, this.capacityUnit),
                new Properties("Torque", this.torque, this.torgueUnit)};
    }

    public int howMuch() {
        int count = 0;
        for (PetrolEngineType pt : PetrolEngineType.values()) {
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
