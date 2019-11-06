package pl.sages.craft.cleancode.designpatterns.singleton;

/**
 * @author krogulecp
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance(){
        System.out.println("Inicjalizacja...");
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
