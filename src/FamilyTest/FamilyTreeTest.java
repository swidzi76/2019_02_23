// Ten komentarz jest dodany w GitHub
package FamilyTest;

public class FamilyTreeTest {
    public static void main(String[] args) {
        FamilyTree kowalskiFamily = new FamilyTree("Kowalscy", "Jan", "Kowalski",40,
                "Ewa", "Kowalska", 38,
                "Janusz", "Kowalski", 15);
        FamilyTree nowakFamily = new FamilyTree("Nowak", "Krzysztof", "Nowak",52,
                "Urszula", "Nowak", 43,
                "Sebastian", "Nowak", 17);
        System.out.println(kowalskiFamily);
        System.out.println("Suma wieku rodziny : " + kowalskiFamily.getFamilyAge());
        System.out.println("Średnia wieku rodziny : " + kowalskiFamily.getFamilyAgeAvg());
        System.out.println(nowakFamily);
        System.out.println("Suma wieku rodziny : " + nowakFamily.getFamilyAge());
        System.out.println("Średnia wieku rodziny : " + nowakFamily.getFamilyAgeAvg());

    }
}
