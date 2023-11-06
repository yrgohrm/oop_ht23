import java.util.*;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + birthYear;
    }

    @Override
    public int compareTo(Person o) {
        // Comparator<Person> comp = Comparator.comparing(Person::getLastName);
        // return comp.compare(this, o);
        return lastName.compareTo(o.lastName);
    }
}
