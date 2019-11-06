package pl.sages.craft.cleancode.designpatterns.immutable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author krogulecp
 */
class Main {

    public static void main(String[] args) {

        List<String> childrenNames = new ArrayList<>();

        Person p = new Person("Jan", "Kowalski", 15, childrenNames);

        System.out.println(p);

        p.getFirstName().toLowerCase();

        System.out.println(p);

        p.getChildrenNames().add("Jesteś moim ojcem. Mam na imię Ada");

        System.out.println(p);

        childrenNames.add("Ada");

        System.out.println(p);




    }
}
