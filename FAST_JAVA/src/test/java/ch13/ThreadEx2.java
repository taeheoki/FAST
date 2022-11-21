package ch13;

class ThreadEx2_1 extends Thread{
    @Override
    public void run() {
        throwException();
    }

    public void throwException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ThreadEx2 {
    public static void main(String[] args) {
        ThreadEx2_1 t1 = new ThreadEx2_1();
        t1.start();
        System.out.println(Thread.currentThread() + "는 이상없이 잘 돌아간다.");
    }
}
