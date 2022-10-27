package Chapter2.ch03;

public class FunctionTest {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        int total = addNum(n1, n2);
        System.out.println(total);

        sayHello("안녕하세요");
        int num = calcSum();
        System.out.println(num);
    }
    private static int addNum(int n1, int n2) {
        return n1 + n2;
    }

    public static void sayHello(String greeting) {
        System.out.println(greeting);
    }

    public static int calcSum() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
