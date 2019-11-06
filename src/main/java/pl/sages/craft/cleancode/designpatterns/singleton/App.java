package pl.sages.craft.cleancode.designpatterns.singleton;

public class App {
    public static void main(String[] args) {
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();

        System.out.println(lazySingleton1);
        System.out.println(lazySingleton2);
        System.out.println(lazySingleton1==lazySingleton2);
        System.out.println(lazySingleton1.equals(lazySingleton2));
    }
}
