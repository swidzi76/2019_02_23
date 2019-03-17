package generics;
// ZADANIE 4
// Utwórz klasę, która pozwoli ustawić parę obiektów różnego typu.
// Sygnatura klasy powinna zawierać dwa generyki,
// a następnie konstruktor pozwalający zainicjalizować obiekt klasy z dwoma instancjami obiektów.

// ZADANIE 6
// Ogranicz możliwość podania dowolnego typu obiektów dla klasy z pkt. 4.
public class Pair<T1 extends String, T2 extends Integer> {
    private T1 field1;
    private T2 field2;

    public Pair(T1 field1, T2 field2) {
        this.field1 = field1;
        this.field2 = field2;
    }
}
