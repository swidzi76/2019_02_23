package generics;

import static generics.TypeTree.CONIFEROUS_TREE;

// drzewa iglaste
public class ConiferousTree extends Tree {
    public ConiferousTree(int age, String name) {
        super(age, name);
    }

    @Override
    public String type() {
        return CONIFEROUS_TREE.getName();
    }
}
