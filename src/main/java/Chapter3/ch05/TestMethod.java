package Chapter3.ch05;

public class TestMethod {
    int num;

    public static void main(String[] args) {
        TestMethod a1 = new TestMethod();
        a1.aaa();

        TestMethod a2 = new TestMethod();
        a2.aaa();
    }

    private void aaa() {
        System.out.println("aaa() 호출");
    }
}
