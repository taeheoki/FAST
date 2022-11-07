package Chapter6.ch09;

public class AutoCloseTest {
    public static void main(String[] args) {
        AutoCloseable obj = new AutoCloseableObject();

        try (obj) {
            throw new Exception();
        } catch(Exception e) {
            System.out.println("exception");
        }

        System.out.println("end");
    }
}
