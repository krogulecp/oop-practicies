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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getChildrenNames() {
        return childrenNames;
    }

    public void setChildrenNames(List<String> childrenNames) {
        this.childrenNames = childrenNames;
    }
}


