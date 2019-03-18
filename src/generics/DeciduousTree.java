package generics;

import static generics.TypeTree.DECIDUOUS_TREE;

// drzewa liściaste
public class DeciduousTree extends Tree {

    public DeciduousTree(int age, String name) {
        super(age, name);
    }

    @Override
    public String type() {
        return DECIDUOUS_TREE.getName();
    }

//    @Override
//    public String toString() {
//        return this.toString() + this.type();
//    }
}
