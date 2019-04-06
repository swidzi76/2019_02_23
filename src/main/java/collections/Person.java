package collections;
// Napisz klasę o nazwie Person, która będzie zawierać pola: firstName i lastName.
// Klasa powinna implementować interfejs Comparable.
// Następnie utwórz kolekcję i dodaj do niej kilka obiektów klasy Person.
// Kolekcja powinna sortować alfabetycznie wszystkie dodawane elementy.


public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return " " + firstName + " " + lastName;
    }

    public int compareTo(Person person) {
        return this.firstName.compareTo(person.firstName);
    }
}
