package FamilyTest;

public class FamilyTree {
    private String familyName;

    private String fatherName;
    private String fatherSurname;
    private int     fatherAge;

    private String motherName;
    private String motherSurname;
    private int     motherrAge;

    private String childName;
    private String childSurname;
    private int    childAge;

    public FamilyTree(String familyName, String fatherName, String fatherSurname, int fatherAge,
                      String motherName, String motherSurname, int motherrAge,
                      String childName, String childSurname, int childAge) {
        this.familyName = familyName;
        this.fatherName = fatherName;
        this.fatherSurname = fatherSurname;
        this.fatherAge = fatherAge;
        this.motherName = motherName;
        this.motherSurname = motherSurname;
        this.motherrAge = motherrAge;
        this.childName = childName;
        this.childSurname = childSurname;
        this.childAge = childAge;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherSurname() {
        return fatherSurname;
    }

    public void setFatherSurname(String fatherSurname) {
        this.fatherSurname = fatherSurname;
    }

    public int getFatherAge() {
        return fatherAge;
    }

    public void setFatherAge(int fatherAge) {
        this.fatherAge = fatherAge;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMotherSurname() {
        return motherSurname;
    }

    public void setMotherSurname(String motherSurname) {
        this.motherSurname = motherSurname;
    }

    public int getMotherrAge() {
        return motherrAge;
    }

    public void setMotherrAge(int motherrAge) {
        this.motherrAge = motherrAge;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getChildSurname() {
        return childSurname;
    }

    public void setChildSurname(String childSurname) {
        this.childSurname = childSurname;
    }

    public int getChildAge() {
        return childAge;
    }

    public void setChildAge(int childAge) {
        this.childAge = childAge;
    }

    @Override
    public String toString() {
        return "FamilyTree{" +
                "familyName='" + familyName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", fatherSurname='" + fatherSurname + '\'' +
                ", fatherAge=" + fatherAge +
                ", motherName='" + motherName + '\'' +
                ", motherSurname='" + motherSurname + '\'' +
                ", motherrAge=" + motherrAge +
                ", childName='" + childName + '\'' +
                ", childSurname='" + childSurname + '\'' +
                ", childAge=" + childAge +
                '}';
    }

    public int getFamilyAge(){
        return this.childAge + this.fatherAge + this.motherrAge;
    }
    public double getFamilyAgeAvg(){
        return getFamilyAge() /3.0;
    }
}
