package generics;

public enum TypeTree {
    DECIDUOUS_TREE("liściaste"), // liściaste
    CONIFEROUS_TREE("iglaste");    //iglaste

    private String name;

    TypeTree(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
