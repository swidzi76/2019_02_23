package FamilyTest;

public class Marriage {
    private Person husband;
    private Person whife;
    private String dateOfMarriage;

    public Marriage(Person husband, Person whife, String dateOfMarriage) {
        this.husband = husband;
        this.whife = whife;
        this.dateOfMarriage = dateOfMarriage;
    }
    public String getDateOfMarriage(){
        return this.dateOfMarriage;
    }
}
