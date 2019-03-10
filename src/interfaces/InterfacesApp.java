package interfaces;

// ZADANIE 1
// Utwórz interfejs Animal oraz dodaj do niego sygnatury metod: getName() i speak().

// ZADANIE 2
// Utwórz kilka różnych implementacji interfejsu Animal po jednym dla: ptaków, ssaków, ryb, gadów, owadów.

// ZADANIE 3
// Utwórz kolejne interfejsy:
//        Flyable z sygnaturą metody fly()
//        Swimmable z sygnaturą metody swim()

// ZADANIE 4
// Dodaj do klas zwierząt implementacje odpowiednich interfejsów:
//        dla ryb i gadów Swimmable,
//        dla ptaków i owadów: Flyable

//  ZADANIE 5
// Utwórz nowy interfejs Being i dodaj do niego:
//          sygnaturę metody getAge()
//          pole MAX_AGE = 100
//          metodę domyślną: isAlive() - która zwróci true jeżeli wiek istoty jest mniejszy od MAX_AGE.

// ZADANIE 6
// Dodaj do interfejsu Animal dziedziczenie z interfejsu Being

// ZADANIE 7
// Nadpisz w jednej z klas zwierząt metodę isAlive()

// ZADANIE 8
// Stwórz obiekty dla każdego zwierzęcia i wyświetl informacje o nich (nazwę, wiek, mowę, czy żyją?)

// ZADANIE 9
// * Utwórz interfejs Plant, który będzie dziedziczył po Being i nadpisze metodę isAlive()
// tak żeby limit wieku był równy 1000 lat. Dodaj kilka klas implementujących interfejs Plant.

// ZADANIE 10
// * Utwórz klasę Swimmingpool w konstruktorze pobierz listę obiektów typu Swimmable i dodaj metodę,
// która sprawi że wszystkie zwierzęta będą pływać.
public class InterfacesApp {
    public static void main(String[] args) {
    Birds birds = new Birds();
    Reptiles reptiles = new Reptiles();
    Insects insects = new Insects();
    Fish fish = new Fish();
    Mammals mammals = new Mammals();
        System.out.println("birds");
        System.out.println("nazwa : "+birds.getname()+" wiek : "+birds.getAge()+" czy żyją :"+ birds.isAlive());
        System.out.println("reptiles");
        System.out.println("nazwa : "+reptiles.getname()+" wiek : "+reptiles.getAge()+" czy żyją :"+ reptiles.isAlive());
        System.out.println("insects");
        System.out.println("nazwa : "+insects.getname()+" wiek : "+insects.getAge()+" czy żyją :"+ insects.isAlive());
        System.out.println("fish");
        System.out.println("nazwa : "+fish.getname()+" wiek : "+fish.getAge()+" czy żyją :"+ fish.isAlive());
        System.out.println("mammals");
        System.out.println("nazwa : "+mammals.getname()+" wiek : "+mammals.getAge()+" czy żyją :"+ mammals.isAlive());



    }
}
