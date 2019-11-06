package pl.sages.craft.cleancode.designpatterns.immutable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author krogulecp
 */
final class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final List<String> childrenNames;

    public Person(String firstName, String lastName, int age, List<String> childrenNames) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.childrenNames = new ArrayList<>(childrenNames);
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

    public List<String> getChildrenNames() {
        return new ArrayList<>(childrenNames);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", childrenNames=" + childrenNames +
                '}';
    }
}


