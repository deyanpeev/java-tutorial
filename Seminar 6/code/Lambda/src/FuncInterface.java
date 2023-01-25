@FunctionalInterface
public interface FuncInterface {
    //public abstract boolean canRun();
    void run();
    public static void runFast() {}
    public default void runAgain() {

    }
}
