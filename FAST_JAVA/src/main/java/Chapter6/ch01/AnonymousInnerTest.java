package Chapter6.ch01;

class Outer2 {
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {

        int num = 10;

        return new Runnable() {

            int localNum = 1000;

            @Override
            public void run() {
//                i = 50;   // 가져다 쓸때는 오류가 나지 않지만 값을 바꾸려고 보면 오류가 난다.
//                num = 20; // 변수들이 final로 처리가 되어 있다. 그렇기에 값을 변경하려고 하면 오류가 발생한다.
                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);

                System.out.println("outNum = " + outNum + " (외부 클래스 인스턴스 변수)");
                System.out.println("Outer.sNum = " + Outer.sNum + " (외부 클래스 정적 변수)");
            }
        };
    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable class");
        }
    };
}

public class AnonymousInnerTest {
    public static void main(String[] args) {
        Outer2 out = new Outer2();
        Runnable runner = out.getRunnable(100);
        runner.run();

        System.out.println();

        out.runnable.run();
    }
}
