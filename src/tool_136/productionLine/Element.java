package tool_136.productionLine;

public class Element {
    AdditionalEquipmentType equipment;
    Element next;

    public Element(AdditionalEquipmentType equipment, Element next) {
        this.equipment = equipment;
        this.next = next;
    }
    public Element getNext(){
        return next;
    }
    public AdditionalEquipmentType getEquipment(){
        return equipment;
    }
}
