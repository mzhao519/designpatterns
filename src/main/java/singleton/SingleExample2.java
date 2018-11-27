package singleton;

public class SingleExample2 {
    private static SingleExample2 ourInstance = new SingleExample2();

    public static SingleExample2 getInstance() {
        return ourInstance;
    }

    private SingleExample2() {
    }
}
