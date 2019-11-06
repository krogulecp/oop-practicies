package pl.sages.craft.cleancode.designpatterns.singleton;

public enum VerySafeSingleton {
    INSTANCE(10,"20");

    VerySafeSingleton(int age, String s) {
        this.age = age;
        this.s = s;
    }

    private final int age;
    private final String s;
}
