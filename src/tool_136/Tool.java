package tool_136;

public class Tool {
    private String model;
    private double prize;

    public Tool(String model, double prize) {
        this.model = model;
        this.prize = prize;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Tool : " + this.getModel() + ", prize = " + this.getPrize();
    }
}
