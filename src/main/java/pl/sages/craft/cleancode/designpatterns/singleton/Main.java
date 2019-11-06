package pl.sages.craft.cleancode.designpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        LazySingleton ls1 = LazySingleton.getInstance();

        System.out.println(ls1);

        LazySingleton ls2 = LazySingleton.getInstance();
        System.out.println(ls2);

    }
}
