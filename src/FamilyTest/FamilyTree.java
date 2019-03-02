package FamilyTest;

public class FamilyTree {
    private String familyName;

    private Person father;
    private Person mother;
    private  Person child;

    private Marriage marriage;

    public FamilyTree(String familyName, Person father, Person mother, Person child) {
        this.familyName = familyName;
        this.father = father;
        this.mother = mother;
        this.child = child;
        this.marriage = null;
    }

    public void setMarriage(String dateOfMarriage){
        this.marriage = new Marriage(this.father, this.mother, dateOfMarriage);
    }

    public String getMarriage(){
        if (marriage == null){
            return "NIE";
        }
        return "TAK - data małżeństwa : " + marriage.getDateOfMarriage();
    }
    public String getFamilyName() {
        return familyName;
    }

    public Person getFather() {
        return father;
    }

    public Person getMother() {
        return mother;
    }

    public Person getChild() {
        return child;
    }

    @Override
    public String toString() {
        return "Rodzina : " + familyName + '\n' +
                "  father = " + father + '\n'+
                "  mother = " + mother + '\n'+
                "  child = " + child;
    }

    public int getFamilyAge(){

        return this.father.getAge() + this.mother.getAge();
    }
    public double getFamilyAgeAvg(){

        return getFamilyAge() /3.0;
    }
}
