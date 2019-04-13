package pro1.set;

import java.util.Objects;

public class Citizen implements Comparable<Citizen>{
    private final String name;
    private final String surname;
    private final String pesel;

    public Citizen(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public String toString() {
        return String.format("%s %s (pesel:%s)",name, surname,  pesel);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Citizen citizen = (Citizen) o;
        return Objects.equals(pesel, citizen.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesel);
    }

    public int compareTo(Citizen c){
        if(c == null){return -1;}

        if(this.surname.equals(c.surname)){
            return name.compareTo(c.name);
        }else{
            return surname.compareTo(c.surname);
        }
    }
}