package Chapter1.ch08;

public class CharacterTest {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1);

        char ch2 = 66;
        System.out.println(ch2);
        System.out.println((char)ch2);

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char) ch3);

//        char ch4 = -66;   // 음수는 char형에 대입할 수 없다.
//        char ch = 123456; // 너무 큰 수 또한 대입할 수 없다.

        char han = '한';
        char ch = '\uD55C';

        System.out.println(han);
        System.out.println(ch);
    }
}
