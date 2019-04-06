// Ten komentarz jest dodany w GitHub
package FamilyTest;

public class FamilyTreeTest {
    public static void main(String[] args) {
        FamilyTree kowalskiFamily  = new FamilyTree("Kowalscy",
                new Person("Jan", "Kowalski", 40),
                new Person("Ewa", "Kowalska", 38),
                new Person("Janusz", "Kowalski", 15));
        FamilyTree nowakFamily = new FamilyTree("Nowak",
                new Person("Krzysztof", "Nowak", 52),
                new Person("Urszula", "Nowak", 43),
                new Person("Sebastian", "Nowak", 17));

        System.out.println(kowalskiFamily);
        System.out.println("Suma wieku rodziny : " + kowalskiFamily.getFamilyAge());
        System.out.println("Średnia wieku rodziny : " + kowalskiFamily.getFamilyAgeAvg());
        System.out.println("Czy małrzeństwo : "+ kowalskiFamily.getMarriage());
        nowakFamily.setMarriage("2019-09-23");
        System.out.println(nowakFamily);
        System.out.println("Suma wieku rodziny : " + nowakFamily.getFamilyAge());
        System.out.println("Średnia wieku rodziny : " + nowakFamily.getFamilyAgeAvg());
        System.out.println("Czy małrzeństwo : " + nowakFamily.getMarriage());

    }
}
