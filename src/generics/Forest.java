package generics;
// ZADANIE 7
// * Utwórz klasę Forest która będzie zawierała zbiór różnego rodzajów drzew (liściastych i iglastych
// - dodaj odpowiednie klasy).
// Dodaj metody, które zwrócą wszystkie drzewa,
// tylko liściaste albo tylko iglaste. Dodaj metodę, która zwróci drzewa starsze niż podany parametr.

import java.util.ArrayList;
import java.util.List;

import static generics.TypeTree.CONIFEROUS_TREE;
import static generics.TypeTree.DECIDUOUS_TREE;

public class Forest {
    private List<Tree> trees = new ArrayList<>();

    public Forest(List<Tree> trees) {
        this.trees = trees;
    }

    public Forest() {
    }

    public void add(Tree tree){
        trees.add(tree);
    }
    public List<Tree> getTrees(){
        return trees;
    }

    public List<Tree> getDeciduousTrees(){
        List<Tree> resultTrees = new ArrayList<>();
        for (Tree tree : trees) {
            if(tree.type() == DECIDUOUS_TREE.getName()){
                resultTrees.add(tree);
            }
        }
        return resultTrees;
    }

    public List<Tree> getConiferousTrees(){
        List<Tree> resultTrees = new ArrayList<>();
        for (Tree tree : trees) {
            if(tree.type() == CONIFEROUS_TREE.getName()){
                resultTrees.add(tree);
            }
        }
        return resultTrees;
    }

    public List<Tree> getOlderThan(int age){
        List<Tree> resultTrees = new ArrayList<>();
        for (Tree tree : trees) {
            if(tree.getAge() > age){
                resultTrees.add(tree);
            }
        }
        return resultTrees;
    }

}
