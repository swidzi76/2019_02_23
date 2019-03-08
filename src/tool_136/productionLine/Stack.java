package tool_136.productionLine;

public class Stack {
    Element head;

    public Stack() {
        this.head = null;
    }

    public Element getHead(){
        return this.head;
    }
    public void push(AdditionalEquipmentType eq){
        Element tmp = new Element(eq, this.head);
        this.head = tmp;
    }
    public void pop(){
        if(head != null){
            this.head = this.head.getNext();
        }
    }
    public void show(){
        if(head != null){
            Element tmp = head;
            while(tmp != null){
                System.out.print(tmp.getEquipment()+ " ");
                tmp = tmp.getNext();
            }
            System.out.println();
        }else{
            System.out.println(" EMPTY STACK");
        }
    }
    public int numberOfElements(){
        if(head != null){
            Element tmp = this.head;
            int counter = 0;
            while(tmp != null){
                counter++;
                tmp = tmp.getNext();
            }
            return counter;
        }else
            return 0;
    }

}