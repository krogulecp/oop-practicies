package pl.sages.craft.cleancode.designpatterns.singleton;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){
        System.out.println("Inicjalizacja...");
    }

    public static LazySingleton getInstance(){
        if (instance== null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
