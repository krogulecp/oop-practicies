package pl.sages.craft.cleancode.designpatterns.singleton;

/**
 * @author krogulecp
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton getInstance(){
        System.out.println("Inicjalizacja...");
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class){
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
