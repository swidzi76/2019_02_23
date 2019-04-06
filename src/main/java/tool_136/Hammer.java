package tool_136;

public class Hammer extends Tool{
    private double mass;

    public Hammer(String model, double prize, double mass) {
        super(model, prize);
        this.mass = mass;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Hammer : " + this.getModel()+ ", mass : " + this.getMass() + ", prize : " + this.getPrize();
    }
}
