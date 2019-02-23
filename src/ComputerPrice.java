/**
 * W osobnej klasie ComputerPrice, w metodzie main() napisz program obliczający cenę komputera
 * na podstawie jego części. Program ma wypisać na konsolę osobno cenę samego komputera:
 * płyta główna, procesor, pamięć RAM, dysk twardy i osobno cenę komputera i monitora.
 * W cenie należy uwzględnić podatek VAT = 23%.
 */
public class ComputerPrice {
    public static void main(String[] args) {
        // ceny netto
        double plyta_glowna = 500;
        double procesor = 1200;
        double pamiec = 600;
        double dysk = 300;
        double komputer = plyta_glowna+procesor+pamiec+dysk;
        double monitor = 700;
        System.out.println("urzadzenie - cena netto - cena brutto");
        System.out.println("Płyta główna - " + plyta_glowna + " - " + plyta_glowna * 1.23);
        System.out.println("Procesor - " + procesor + " - " + procesor * 1.23);
        System.out.println("Pamieć RAM - " + pamiec + " - " + pamiec * 1.23);
        System.out.println("Dysk - " + dysk + " - " + dysk * 1.23);
        System.out.println("Monitor - " + monitor + " - " + monitor * 1.23);
        System.out.println("komputer - " + komputer + " - " + komputer * 1.23);

    }
}
