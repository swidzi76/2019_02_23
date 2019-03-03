package enums;

public enum Operation {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private String znak;
    public String getZnak(){
        return znak;
    }

    Operation(String znak) {
        this.znak = znak;
    }
    public void calculate(double a, double b){
        switch (this){
            case PLUS:
                System.out.println("wynik dodawania = "+(a+b));
                break;
            case MINUS:
                System.out.println("wynik odelmowania = "+ (a-b));
                break;
            case MULTIPLY:
                System.out.println("wynik mnożenia = "+ (a*b));
                break;
            case DIVIDE:
                System.out.println("wynik dzielenia = "+ (a/b));
                break;
        }

    }
    public Operation getEnum(String operacja){
        for (Operation o : Operation.values()){
            if(o.getZnak() == operacja)
                return o;

        }
        return null;
    }
}
