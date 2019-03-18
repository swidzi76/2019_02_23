package generics;

public abstract class Tree {
    private int age;
    private String name;
    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public abstract String type(); // zwraca typ drzewa

    @Override
    public String toString() {
        return "Tree{" +
                "age=" + age +
                ", name='" + name + ", type='" + type() + "'" +'}';
    }
}
