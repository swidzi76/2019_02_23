package enums;

public enum Currency {
    POLSKI_ZLOTY("PLN", 1),
    DOLAR("USD", 0.23),
    EURO("EUR", 0.5),
    JEN("JEN", 0.67),
    FUNT_BRYTYJSKI("POUND", 0.53);

    private String symbol;
    private double kurs;

    Currency(String symbol, double kurs) {
        this.symbol = symbol;
        this.kurs = kurs;
    }

    public String getSymbol() {
        return symbol;
    }
    public double getKurs() {
        return kurs;
    }
    public void changePln(double pln){
        System.out.println(""+pln+ " PLN to "+ pln * this.getKurs()+ " "+ this.getSymbol());
    }
}
