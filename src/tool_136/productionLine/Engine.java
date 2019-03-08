package tool_136.productionLine;

public class Engine {
    private EngineType engineType;
    private Properties[] properties;

//    public Engine(EngineType engineType, int capacity, double power, double torque) {
    public Engine(EngineType engineType, Properties[] properties) {
        this.engineType = engineType;
        this.properties = properties;
    }


//    @Override
//    public String toString() {
//        return " * Engine : " + " engineType = " + engineType +
//                ", capacity[cmm^3] = " + capacity +
//                ", power[KM] = " + power +
//                ", torque[Nm] = " + torque;
//    }
    @Override
    public String toString() {
        StringBuilder s1 = new StringBuilder();
        s1.append(" * Engine : " + " engineType = " + engineType);
        for (int i = 0; i < this.properties.length ; i++) {
            s1.append(properties[i].toString());
        }
        return s1.toString();
//        return " * Engine : " + " engineType = " + engineType +
//                // tu wypisć właściwości z tablicy properties (name - value - unitw
//                ", power[KM] = " + power +
//                ", torque[Nm] = " + torque;
    }
}
