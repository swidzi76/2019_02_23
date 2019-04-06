package tool_136.productionLine;


public class ProductionLineApp {
    public static void main(String[] args) {
        ProductionLine productionLine = new ProductionLine();
        Car car1 = new Car(new Engine(EngineType.DIESEL,
                new Properties[]{new Properties("Capacity",1500, "cm^3"),
                                new Properties("Power", 100, "KM"),
                                new Properties("Torque", 50, "Nm")}),
                BodyType.COMBO, ColorType.BLACK, true,
                new AdditionalEquipmentType[]{AdditionalEquipmentType.ADDITIONAL_AIRBAGS,
                                            AdditionalEquipmentType.AIR_CONDITIONING,
                                            AdditionalEquipmentType.CENTRAL_LOCK,
                                            AdditionalEquipmentType.ELECTRICALLY_ADJUSTABLE_MIRRORS});
        productionLine.addNewCar(car1);
        System.out.println(" Linia produkcyjna po dodaniu samochodu przy pomocy met. addNewCar");
        productionLine.showProductionLine();
//        System.out.println(" dostępne typy nadwozia");
//        car1.showAvailableBodyType();
//        System.out.println( " dostępne typy silników");
//        car1.showAvailableEngineType();
//        System.out.println(" dostępne wyposażenie");
//        car1.showAvailableAdditionalEquipment();

//        productionLine.addUserNewCar();
//        productionLine.showProductionLine();
        productionLine.addRandomNewCar();
        System.out.println(" Linia produkcyjna po dodaniu samochodu przy pomocy met. addRandomNewCar");
        productionLine.showProductionLine();
        productionLine.addRandomNewCars(3);
        System.out.println(" Linia produkcyjna po dodaniu samochodu przy pomocy met. addRandomNewCars");
        productionLine.showProductionLine();
        // do zrobienia
        // user dodaje nowy car -> userAddNewCar w klasie Car (wybór nadwozia, silnika, wyposarzenia)
        // system sam geneeruje kilka (n) samochodów
    }
}
