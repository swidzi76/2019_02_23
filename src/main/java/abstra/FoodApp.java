package abstra;
// ZADANIE 1
// Utwórz klasę abstrakcyjną o nazwie Food i dodaj do niej metodę abstrakcyjną getTaste(),
// która zwraca String z opisem smaku jedzenia
// Dodaj klasy: Chicken, Ham, Carrot, Salad rozszerzające klasę Food oraz
// zaimplementuj w każdej z nich wymaganą metodę.

// ZADANIE 2
// Utwórz dwie nowe klasy abstrakcyjne: Meat i Vegetable rozszerzające klasę Food.
// Zmień klasy bazowe dla klas: Chicken, Ham, Carrot, Salad
// tak by dziedziczyły po jednej z klas: Meat lub Vegetable

// ZADANIE 3
// Dodaj do klasy Food metodę abstrakcyjną getType(),
// która zwróci rodzaj jedzenia w postaci enuma (utwórz enum).
// W klasach Meat i Vegetable zaimplementuj nową metodę.

// ZADANIE 4
// W klasie Food dodaj pole name i zwykłą metodę (gettera) do pobierania nazwy.
// Stwórz konstruktor, który będzie ustawiał pole name.
// Stwórz odpowiednie konstruktory w klasach pochodnych.

// ZADANIE 5
// W klasie Food dodaj metodę describe(),
// która wypisze na ekran informacje o nazwie, typie i smaku jedzenia.
// Sprawdź swój kod, stwórz po jednym obiekcie z każdej klasy:
// Chicken, Ham, Carrot, Salad i wyświetl na ekran ich opis.

// ZADANIE 6
// * Stwórz klasę Recipe, która zawierać będzie nazwę i spis składników (obiektów klasy Food).
// Dodaj konstruktor który ustawi nazwę przepisu i wszystkie składniki(jako varargs)
// i drugi który ustawi nazwę przepisu i ilość składników (jako liczbę).
// Dodaj metodę do dodawania składników do listy.

// ZADANIE 7
//* W klasie Recipe stwórz metody do wyświetlania wszystkich składników (same nazwy)
// oraz metodę do wyświetlania opisu potrawy składającego się z opisu poszczególnych składników.

// ZADANIE 8
// * Dodaj własne klasy-składniki tak by stworzyć swój ulubiony przepis kulinarny :).
public class FoodApp {
    public static void main(String[] args) {
    Chicken chicken = new Chicken("Kurczak A");
    Ham ham = new Ham("Szynka B");
    Carrot carrot = new Carrot("Marchewka C");
    Salad salad = new Salad("Sałata D");

    System.out.println(chicken.describe());
    System.out.println(ham.describe());
    System.out.println(carrot.describe());
    System.out.println(salad.describe());
    Recipe recipe1 = new Recipe("Sałatka", new Chicken("Kurczak wędzony"),
                new Carrot("Marchewka konserwowa"),
                new Salad("Sałata"),
                new Ham("Szynka konserwowa"));
    recipe1.show();
    recipe1.describe();

    Recipe recipe2 = new Recipe(" Sałatla warzywna",
                new Carrot("Marchewka"),
                new Peas("Groszek konserwowy"),
                new Salmon("Łosoś"),
                new Patatoes("Ziemniaki gotowane"));
    recipe2.show();
    recipe2.describe();
    }


}
