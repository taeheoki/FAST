package Chapter6.ch09;

public class AutoCloseableObject implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("closing....");
    }
}
