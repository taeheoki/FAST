package Chapter1.ch20;

public class NestedLoopTest {
    public static void main(String[] args) {
        int dan = 2;

        for (; dan <= 9; dan++) {
            for (int count = 1; count <= 9; count++) {
                System.out.println(dan + " X " + count + " = " + dan * count);
            }
            System.out.println();
        }

        dan = 2;
        while (dan < 10) {
            int count = 1;
            while (count < 10) {
                System.out.println(dan + " X " + count + " = " + dan * count);
                count++;
            }
            System.out.println();
            dan++;
        }
    }
}
