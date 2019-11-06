package pl.sages.craft.cleancode.designpatterns.immutable;

import java.util.List;

/**
 * @author krogulecp
 */
class Person {
    private String firstName;
    private String lastName;
    private int age;
    private List<String> childrenNames;

    public Person(String firstName, String lastName, int age, List<String> childrenNames) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.childrenNames = childrenNames;
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
        return childrenNames;
    }
}


