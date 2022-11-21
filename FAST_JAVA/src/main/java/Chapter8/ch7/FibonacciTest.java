package Chapter8.ch7;

public class FibonacciTest {

    int[] value;
    int number;

    public FibonacciTest(int number) {
        this.number = number;
        value = new int[number];
    }

    public int fibonacciRecur(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacciRecur(n - 1) + fibonacciRecur(n - 2);
    }

    public int fibonacciIter(int n) {
        int ppre = 0;
        int pre = 1;
        int current = 0;

        if (n == 0)
            return ppre;
        else if (n == 1)
            return pre;
        else {
            for (int i = 2; i <= n; i++) {
                current = ppre + pre;
                ppre = pre;
                pre = current;
            }
            return current;
        }
    }

    public int fibonacciMem(int n) {
        value[0] = 0;
        value[1] = 1;

        if (n == 0)
            return value[0];
        else if (n == 1)
            return value[1];
        else {
            int i;
            for (i = 2; i <= n; i++) {
                value[i] = value[i - 1] + value[i - 2];
            }
            return value[i - 1];
        }
    }

    public static void main(String[] args) {
        FibonacciTest ft = new FibonacciTest(100);
        System.out.println("fibonacciRecur(6) : " + ft.fibonacciRecur(6));
        System.out.println("fibonacciIter(6) : " + ft.fibonacciIter(6));
        System.out.println("fibonacciMem(6) : " + ft.fibonacciMem(6));
    }
}
