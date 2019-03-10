package tool_136.productionLine;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ProductionLine {
    private final int MAX_NUMBER_OF_CARS = 20;
    private Car[] cars = new Car[MAX_NUMBER_OF_CARS];
    private int index = 0;

    public ProductionLine() {

    }
    public void addNewCar(Car car){
        cars[index++] = car;
    }
    public void addUserNewCar(){
        //tworzymy nowy Car
        // zaczynamy od wyboru silnika
        Scanner scan = new Scanner(System.in);
        Car carU = new Car();
        EngineType tempEt= EngineType.DIESEL;
        System.out.println(" Wybierz typ silnika 1 - "+ tempEt.howMuch());
        carU.showAvailableEngineType();
        int userEngineNr = scan.nextInt();
        EngineType userEngineType = carU.getAvailableEngineType(userEngineNr);
        System.out.println("wybrany to :"+ userEngineType);
        switch (userEngineType){
            case DIESEL:{
                // wybieramy z silników DIESLA
//                DieselEngineType tempDet = DieselEngineType.D_1600;
//                System.out.println(" wybierz jeden z możliwych do wyboru silników DIESLA 1 - "+ tempDet.howMuch());
                System.out.println(" wybierz jeden z możliwych do wyboru silników DIESLA 1 - "
                        + DieselEngineType.D_1600.howMuch());
                carU.showAvailableDieselEngineType();
                int userDieselCapacityNr = scan.nextInt();
                DieselEngineType userDieselEngineType = carU.getAvailableDieselEngineType(userDieselCapacityNr);
                System.out.println("wybrany to :"+ userDieselEngineType);
                // zapisanie wybranego silnika w carU
                carU.setEngine(new Engine(userEngineType, userDieselEngineType.getProperities()));
                break;
            }
            case PETROL:{
                // wybierany z silników benzynowych

                System.out.println(" wybierz jeden z możliwych do wyboru silników BENZYNOWYCH 1 - "
                        + PetrolEngineType.P_1600.howMuch());
                carU.showAvailablePetrolEngineType();
                int userPetrolEngineNr = scan.nextInt();
                PetrolEngineType userPetrolEngineType = carU.getAvailablePetrolEngineType(userPetrolEngineNr);
                System.out.println("wybrany to :"+ userPetrolEngineType);
                // zapisanie wybranego silnika w carU
                carU.setEngine(new Engine(userEngineType, userPetrolEngineType.getProperities()));
                break;
            }
            case ELECTRIC:{
                // wybierany z silników elektrycznych

                System.out.println(" wybierz jeden z możliwych do wyboru silników ELEKTRYCZNYCH 1 - "
                        + ElectricEngineType.E_50.howMuch());
                carU.showAvailableElectricEngineType();
                int userElectricEngineNr = scan.nextInt();
                ElectricEngineType userElectricEngineType = carU.getAvailableElectricEngineType(userElectricEngineNr);
                System.out.println("wybrany to :"+ userElectricEngineType);
                // zapisanie wybranego silnika w carU
                carU.setEngine(new Engine(userEngineType, userElectricEngineType.getProperities()));
                break;

            }
            case HYBRID:{
                // wybieramy z silników hybrydowych
                System.out.println(" wybierz jeden z możliwych do wyboru silników HYBRYDOWYCH 1 - "
                        + HybridEngineType.H_1.howMuch());
                carU.showAvailableHybridEngineType();
                int userHybridEngineNr = scan.nextInt();
                HybridEngineType userHybridEngineType = carU.getAvailableHybridEngineType(userHybridEngineNr);
                System.out.println("wybrany to :"+ userHybridEngineType);
                // zapisanie wybranego silnika w carU
                carU.setEngine(new Engine(userEngineType, userHybridEngineType.getProperities()));
                break;
            }

        }
        // wybór karoserii
        System.out.println(" wybierz jedeno z możliwych nadwozi 1 - "
                + BodyType.COMBO.howMuch());
        carU.showAvailableBodyType();
        int userBodyNr = scan.nextInt();
        BodyType userBodyType = carU.getAvailableBodyType(userBodyNr);
        System.out.println("wybrany to :"+ userBodyType);
        // zapisanie wybranej karoserii w carU
        carU.setBodyType(userBodyType);

        // wybór koloru
        System.out.println(" wybierz jeden z możliwych kolorów 1 - "
                + ColorType.BLACK.howMuch());
        carU.showAvailableColorType();
        int userColorNr = scan.nextInt();
        ColorType userColorType = carU.getAvailableColorType(userColorNr);
        System.out.println("wybrany to :"+ userColorType);
        // zapisanie wybranej karoserii w carU
        carU.setColorType(userColorType);        // wybór koloru

        // metalik ??
        System.out.println(" kolor metalik 1 - TAK, 2 - NIE");
        int userMetalicNr = scan.nextInt();
        switch (userMetalicNr){
            case 1 : {
                carU.setMetalic(true);
                break;
            }
            case 2 : {
                carU.setMetalic(false);
            }
        }
        // wybór wyposarzenia dodatkowego
        System.out.println(" wybierz wyposarzenie dodatkowe - wybierz kilka(1 - "+
                        AdditionalEquipmentType.GPS.howMuch()+")");
        System.out.println(" LICZBY OBOK SIEBIE ROZDZIELONE PRZECINKAMI");
        carU.showAvailableAdditionalEquipment();

        String userEquipment = scan.nextLine();
        userEquipment = scan.nextLine();


        System.out.println(" wybrany string");
        System.out.println(userEquipment);
        String tempS;
        int beginIndex = 0;
        int nrOfEquipment = 0;
        Stack stack = new Stack();
        while(userEquipment.indexOf(",", beginIndex) >= 0){
            tempS = userEquipment.substring(beginIndex,userEquipment.indexOf(",", beginIndex));
            nrOfEquipment = Integer.parseInt(tempS);

            AdditionalEquipmentType userEq = carU.getAvailableAdditionalEquipmentType(nrOfEquipment);
            stack.push(userEq);
            beginIndex = userEquipment.indexOf(",", beginIndex)+1;
        }
        tempS = userEquipment.substring(beginIndex, userEquipment.length());
//        System.out.println(" ostatni - str : " + tempS);
        nrOfEquipment = Integer.parseInt(tempS);
        AdditionalEquipmentType userEq = carU.getAvailableAdditionalEquipmentType(nrOfEquipment);
        stack.push(userEq);
        AdditionalEquipmentType[] uEq = new AdditionalEquipmentType[stack.numberOfElements()];
        for (int i = 0; i <uEq.length ; i++) {
            uEq[uEq.length-i-1] = stack.getHead().getEquipment();
            stack.pop();
        }
        carU.setAdditionalEquipmentType(uEq);
        cars[index++] = carU;

    }//userAddNewCar
    public void addRandomNewCars(int number){
        for (int i = 0; i < number; i++) {
            addRandomNewCar();
        }
    }
    public void addRandomNewCar(){
        //tworzymy nowy Car
        // zaczynamy od wyboru silnika
        Car carU = new Car();
        Random random = new Random();
        EngineType tempEt= EngineType.DIESEL;

        EngineType userEngineType = carU.getAvailableEngineType(
                random.nextInt(tempEt.howMuch())+1);
        switch (userEngineType){
            case DIESEL:{
                DieselEngineType userDieselEngineType = carU.getAvailableDieselEngineType(
                        random.nextInt( DieselEngineType.D_1600.howMuch()) + 1);
                carU.setEngine(new Engine(userEngineType, userDieselEngineType.getProperities()));
                break;
            }
            case PETROL:{
                PetrolEngineType userPetrolEngineType = carU.getAvailablePetrolEngineType(
                        random.nextInt( PetrolEngineType.P_1800.howMuch()) + 1);
                carU.setEngine(new Engine(userEngineType, userPetrolEngineType.getProperities()));
                break;
            }
            case ELECTRIC:{
                ElectricEngineType userElectricEngineType = carU.getAvailableElectricEngineType(
                        random.nextInt( ElectricEngineType.E_50.howMuch()) + 1);
                carU.setEngine(new Engine(userEngineType, userElectricEngineType.getProperities()));
                break;
            }
            case HYBRID:{
                HybridEngineType userHybridEngineType = carU.getAvailableHybridEngineType(
                        random.nextInt( HybridEngineType.H_1.howMuch()) + 1);
                carU.setEngine(new Engine(userEngineType, userHybridEngineType.getProperities()));
                break;
            }

        }
        // wybór karoserii
        BodyType userBodyType = carU.getAvailableBodyType(
                random.nextInt(BodyType.COMBO.howMuch()) + 1);
        carU.setBodyType(userBodyType);

        // wybór koloru
        ColorType userColorType = carU.getAvailableColorType(
                random.nextInt(ColorType.BLACK.howMuch()) + 1);
        carU.setColorType(userColorType);        // wybór koloru

        // metalik ??
        switch (random.nextInt(2)){
            case 0 : {
                carU.setMetalic(true);
                break;
            }
            case 1 : {
                carU.setMetalic(false);
            }
        }
        // wybór wyposarzenia dodatkowego
        // wersja bez powtórzeń
        int numberOfEq = random.nextInt(AdditionalEquipmentType.GPS.howMuch()) + 1; // tyle do wylosowania
        AdditionalEquipmentType[] uEq = new AdditionalEquipmentType[numberOfEq];    // tu mają być wyniki

        List<AdditionalEquipmentType> list = new LinkedList<>();
        for (int i = 0; i < AdditionalEquipmentType.GPS.howMuch(); i++) {
            list.add(carU.getAvailableAdditionalEquipmentType(i+1));
        }
        // losujemy elementy Listy list
        for (int i = 0; i < numberOfEq; i++) {
            int eqNr = random.nextInt(list.size());
            uEq[i] = list.get(eqNr);
            list.remove(eqNr);
        }
//        for (int i = 0; i < numberOfEq; i++) {
//            int eqNr = random.nextInt(AdditionalEquipmentType.GPS.howMuch()) + 1;
//            // elementy wylosowane mogą się powtarzać
//            uEq[i] = carU.getAvailableAdditionalEquipmentType(eqNr);
//        }
        carU.setAdditionalEquipmentType(uEq);
        cars[index++] = carU;

    }//addRandomNewCar

    public int getNumberOfCars(){
        return index;
    }
    public void showProductionLine(){
        if(index == 0 ){
            System.out.println(" BRAK SAMOCHOCHODÓW NA LINII PRODUKCYJNEJ");
            return;
        }
        String s1 = "";
        if(index == 1) s1 = " SAMOCHÓD";
        if((index > 1) &&(index < 5)) s1 = " SAMOCHODY";
        if(index > 4) s1 = " SAMOCHODÓW";

        System.out.println(" *********************************************************************** ");
        System.out.println(" LINIA PRODUKCYJNA ZAWIERA : " + getNumberOfCars()+ s1);
        for (int i = 0; i < index; i++) {
            System.out.println(" samochód nr "+ (i+1));
            System.out.println(cars[i].toString());
            System.out.println(" ------------------------------------------------------------------------ ");
        }
        System.out.println(" *********************************************************************** ");
    }
}
