package tool_136.productionLine;

public class Car {
    private Engine engine;
    private BodyType bodyType;
    private ColorType color;
    private boolean metalic;
    private AdditionalEquipmentType[] additionalEquipmentType;

    public Car(Engine engine, BodyType bodyType, ColorType color, Boolean metalic,  AdditionalEquipmentType[] additionalEquipmentType) {
        this.engine = engine;
        this.bodyType = bodyType;
        this.color  = color;
        this.metalic = metalic;
        this.additionalEquipmentType = additionalEquipmentType;
    }
    public Car(){

    }

    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public BodyType getBodyType() {
        return bodyType;
    }
    public void setBodyType(BodyType bodyType){
        this.bodyType = bodyType;
    }
    public void setColorType(ColorType color){
        this.color = color;
    }
    public void setMetalic(boolean metalic){
        this.metalic = metalic;
    }

    public AdditionalEquipmentType[] getAdditionalEquipmentType() {
        return additionalEquipmentType;
    }
    public void setAdditionalEquipmentType(AdditionalEquipmentType[] additionalEquipmentType){
        this.additionalEquipmentType = additionalEquipmentType;
    }

    public void showAvailableAdditionalEquipmentType(){
        int i = 1;
        for (AdditionalEquipmentType at: AdditionalEquipmentType.values()) {
            System.out.println(" " + i++ + " : " + at);
        }
    }
    public AdditionalEquipmentType getAvailableAdditionalEquipmentType(int equipment){
        int i = 1;
        for (AdditionalEquipmentType at : AdditionalEquipmentType.values()) {
            if (equipment == i++)
                return at;
        }
        return null;
    }
    public void showAvailableBodyType(){
        int i = 1;
        for (BodyType bt: BodyType.values()) {
            System.out.println(" " + i++ + " : " + bt);
        }
    }
    public BodyType getAvailableBodyType(int bodyType){
        int i = 1;
        for (BodyType bt : BodyType.values()) {
            if (bodyType == i++)
                return bt;
        }
        return null;
    }


    public void showAvailableColorType(){
        int i = 1;
        for (ColorType ct: ColorType.values()) {
            System.out.println(" " + i++ + " : " + ct);
        }
    }
    public ColorType getAvailableColorType(int color){
        int i = 1;
        for (ColorType ct : ColorType.values()) {
            if (color == i++)
                return ct;
        }
        return null;
    }

    public void showAvailableEngineType(){
        int i = 1;
        for (EngineType et : EngineType.values()) {
            System.out.println(" "+ i++ +" : "+et);
        }
    }
    public EngineType getAvailableEngineType(int engineType){
        int i = 1;
        for (EngineType et : EngineType.values()) {
            if (engineType == i++)
                return et;
        }
        return null;
    }
    public void showAvailableDieselEngineType() {
        int i = 1;
        for (DieselEngineType dct : DieselEngineType.values()) {
            System.out.println(" " + i++ + " : " + dct + " power : "+ dct.getPower()+dct.getPowerUnit());
        }
    }
    public DieselEngineType getAvailableDieselEngineType(int dieselEngineType) {
        int i = 1;
        for (DieselEngineType det : DieselEngineType.values()) {
            if (dieselEngineType == i++)
                return det;
        }
        return null;
    }
    public void showAvailablePetrolEngineType() {
        int i = 1;
        for (PetrolEngineType pet : PetrolEngineType.values()) {
            System.out.println(" " + i++ + " : " + pet + " power : "+ pet.getPower()+pet.getPowerUnit());
        }
    }
    public PetrolEngineType getAvailablePetrolEngineType(int petrolEngineType) {
        int i = 1;
        for (PetrolEngineType pet : PetrolEngineType.values()) {
            if (petrolEngineType == i++)
                return pet;
        }
        return null;
    }
    public void showAvailableElectricEngineType() {
        int i = 1;
        for (ElectricEngineType eet : ElectricEngineType.values()) {
            System.out.println(" " + i++ + " : " + eet + " power : "+ eet.getPower()+eet.getPowerUnit());
        }
    }
    public ElectricEngineType getAvailableElectricEngineType(int electricEngineType) {
        int i = 1;
        for (ElectricEngineType eet : ElectricEngineType.values()) {
            if (electricEngineType == i++)
                return eet;
        }
        return null;
    }

    public void showAvailableHybridEngineType() {
        int i = 1;
        for (HybridEngineType het : HybridEngineType.values()) {
            System.out.println(" " + i++ + " : " + het + " power : "+ het.getPower()+het.getPowerUnit() +
                    " power elect.engine : "+het.getPowerElectric()+het.getPowerElectricUnit());
        }
    }
    public HybridEngineType getAvailableHybridEngineType(int hybridEngineType) {
        int i = 1;
        for (HybridEngineType het : HybridEngineType.values()) {
            if (hybridEngineType == i++)
                return het;
        }
        return null;
    }



    public void showAvailableAdditionalEquipment(){
        int i = 1;
        for (AdditionalEquipmentType ae : AdditionalEquipmentType.values()) {
            System.out.println(" " + i++ + " : " + ae);
        };
    }

    @Override
    public String toString() {
        StringBuilder s1 = new StringBuilder() ;
        s1.append(engine +
                "\n * bodyType = " + bodyType +
                "\n * color = "+ this.color +
                "\n * meatlic = "+ this.metalic +
                "\n * additionalEquipmentType("+additionalEquipmentType.length+") = ");

        for (AdditionalEquipmentType ae : additionalEquipmentType) {
            s1.append(""+ae+", ");
        }
        return s1.toString();
    }
    // user dodaje nowy car -> userAddNewCar w klasie Car (wybór nadwozia, silnika, wyposarzenia)
}
