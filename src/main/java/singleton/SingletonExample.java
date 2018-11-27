package singleton;

public class SingletonExample {
    private static SingletonExample INSTANCE;

    private SingletonExample() {
    }

    public synchronized static SingletonExample getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonExample();
        }
        return INSTANCE;
    }
}
