package ComputerPrice;

/**
 * W osobnej klasie ComputerPrice.ComputerPrice, w metodzie main() napisz program obliczający cenę komputera
 * na podstawie jego części. Program ma wypisać na konsolę osobno cenę samego komputera:
 * płyta główna, procesor, pamięć RAM, dysk twardy i osobno cenę komputera i monitora.
 * W cenie należy uwzględnić podatek VAT = 23%.
 */

//public class ComputerPrice.ComputerPrice {
//
//    public static void main(String[] args) {
//        // ceny netto
//        double plyta_glowna = 500;
//        double procesor = 1200;
//        double pamiec = 600;
//        double dysk = 300;
//        double komputer = plyta_glowna+procesor+pamiec+dysk;
//        double monitor = 700;
//
//        System.out.println("urzadzenie - cena netto - cena brutto");
//        System.out.println("Płyta główna - " + plyta_glowna + " - " + plyta_glowna * 1.23);
//        System.out.println("Procesor - " + procesor + " - " + procesor * 1.23);
//        System.out.println("Pamieć RAM - " + pamiec + " - " + pamiec * 1.23);
//        System.out.println("Dysk - " + dysk + " - " + dysk * 1.23);
//        System.out.println("Monitor - " + monitor + " - " + monitor * 1.23);
//        System.out.println("komputer - " + komputer + " - " + komputer * 1.23);
//
//    }
//}
// ---------------------------------------------------------------------------------------------
// zmiana na metody - 24.02.2019
public class ComputerPrice {
    private double vat = 23; // podatek vat w %
    // ceny netto
    private double plyta_glowna = 500;
    private double procesor = 1200;
    private double pamiec = 600;
    private double dysk = 300;
    private double monitor = 700;

    @Override
    public String toString() {
        return "ComputerPrice.ComputerPrice{" +
                "vat=" + vat +
                ", plyta_glowna=" + plyta_glowna +
                ", procesor=" + procesor +
                ", pamiec=" + pamiec +
                ", dysk=" + dysk +
                ", monitor=" + monitor +
                '}';
    }

    public void getComputer_price(){
//        System.out.println("urzadzenie - cena netto - cena brutto");
//        System.out.println("Płyta główna - " + plyta_glowna + " - " + plyta_glowna * 1.23);
//        System.out.println("Procesor - " + procesor + " - " + procesor * 1.23);
//        System.out.println("Pamieć RAM - " + pamiec + " - " + pamiec * 1.23);
//        System.out.println("Dysk - " + dysk + " - " + dysk * 1.23);
//        System.out.println("Monitor - " + monitor + " - " + monitor * 1.23);
        System.out.println("Cena brutta komputera = " + (plyta_glowna+procesor+pamiec+dysk)*(1+ vat/100));
    }
    public void getMonitorPrice(){
        System.out.println("Cena brutto monitora = " + monitor * (1+vat/100));
    }

    public void getComputerAndMonitorPrice(){
        this.getComputer_price();
        this.getMonitorPrice();
    }
}
//    W klasie ComputerPrice.ComputerPrice wydziel metody getComputerPrice(),
//    getMonitorPrice() i getComputerAndMonitorPrice(),
//    ostatnia z metod ma korzystać z dwóch pierwszych. Zmienną VAT ustaw jako pole klasy ComputerPrice.ComputerPrice.

