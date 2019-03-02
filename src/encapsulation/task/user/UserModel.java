package encapsulation.task.user;

public class UserModel {
    private String firstName;
    private String lastName;
    private int age = 55;

    public UserModel(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
