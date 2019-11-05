package pl.sages.craft.cleancode.designpatterns.singleton;

/**
 * @author krogulecp
 */
public class NotLazySingleton {

    private static NotLazySingleton instance = new NotLazySingleton();

    private NotLazySingleton(){
        System.out.println("Inicjalizacja...");
    }

    public static NotLazySingleton getInstance(){
        return instance;
    }
}
