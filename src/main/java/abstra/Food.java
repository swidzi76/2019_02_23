package abstra;

public abstract class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String describe(){
        return "Nazwa : " + getName()+", Typ : " + getType() + ", Smak : " + getTaste();
    };
    public abstract String getTaste();
    public abstract FoodType getType();
}
