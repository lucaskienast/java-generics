package exercises.oracle.ex9;

public class Singleton<T> {

    /*

    No. You cannot create a static field of the type parameter T

    private static Singleton<T> instance;

    private Singleton() {
    }

    public static Singleton<T> getInstance() {
        if (instance == null)
            instance = new Singleton<T>();
        return instance;
    }

    public static void main(String[] args) {
        Singleton<String> singleton = Singleton.getInstance();
    }

     */

}
