package tool_136;

public class Saw extends Tool{
    private double length;

    public Saw(String model, double prize, double length) {
        super(model, prize);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public String toString() {
        return "Saw : " + this.getModel()+ ", length : " + this.getLength() + ", prize : " + this.getPrize();
    }

}
