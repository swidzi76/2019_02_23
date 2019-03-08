package tool_136.productionLine;

public enum AdditionalEquipmentType {
    ELEKTRIC_WINDOWS,
    ELECTRICALLY_ADJUSTABLE_MIRRORS,
    ADDITIONAL_AIRBAGS,
    CENTRAL_LOCK,
    PARKING_SENSOR,
    REVERSING_CAMERA,
    ESP,
    HEATED_SEATS,
    AIR_CONDITIONING,
    GPS,
    CRIUSE_CONTROL;

    public int howMuch() {
        int count = 0;
        for (AdditionalEquipmentType at : AdditionalEquipmentType.values()) {
            count++;
        }
        return count;
    }

}
