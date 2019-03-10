package abstra;

public class Recipe {
    private String name;
    private Food[] components;

    public Recipe(String name, Food... components) {
        this.name = name;
        this.components = components;
    }
    public Recipe(String name, int componentsNumber){
        this.name = name;
        this.components = new Food[componentsNumber];
    }
    public void addComponent(Food component){
        Food[] tempComp = new Food[components.length+1];
        for (int i = 0; i < components.length ; i++) {
            tempComp[i] = components[i];
        }
        tempComp[components.length] = component;
        components = tempComp;
    }
    public void show(){
        System.out.println(" PRZEPIS : "+ this.name);
        for (int i = 0; i < components.length; i++) {
            System.out.println(components[i].getName());
        }
    }
    public void describe(){
        System.out.println(" PRZEPIS + OPIS ");
        for (int i = 0; i < components.length; i++) {
            System.out.println(" Nazwa : "+ components[i].getName()+
                    " Smak : " + components[i].getTaste()+
                    " Opis : " + components[i].describe());
        }
    }
}
