package tool_136.productionLine;

public enum DieselEngineType {
    D_1600(100, "KM", 1600, "cm^3", 52.3, "Nm"),
    D_2000( 150, "KM", 2000, "cm^3", 83.7, "Nm"),
    D_2500( 180, "KM", 2500, "cm^3", 130.6, "Nm"),
    D_3200( 238, "KM", 3000, "cm^3", 180.6, "Nm");
    private double power; // moc
    private String powerUnit;
    private int capacity;   // pojemność
    private String capacityUnit;
    private double torque;  // moment obrotowy
    private String torgueUnit;

    DieselEngineType(double power, String powerUnit, int capacity, String capacityUnit, double torque, String torgueUnit) {
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
        for (DieselEngineType dt : DieselEngineType.values()) {
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

    public int getCapacity() {
        return capacity;
    }

    public String getCapacityUnit() {
        return capacityUnit;
    }

    public double getTorque() {
        return torque;
    }

    public String getTorgueUnit() {
        return torgueUnit;
    }
}
