package Chapter1.ch13;

public class BitTest {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        System.out.println(num1 | num2);
        System.out.println(num1 & num2);
        System.out.println(num1 ^ num2);
        System.out.println(~num1);

        System.out.println(num1 << 2);
        System.out.println("바뀌기 전 : " + num1);
        System.out.println(num1 <<= 2);
        System.out.println("바뀐 후 : " + num1);
    }
}
