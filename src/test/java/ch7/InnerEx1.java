package ch7;

public class InnerEx1 {
    class InstanceInner {
        int iv = 100;
//        static int cv = 100;
        final static int CONST = 10;;
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 200;
    }

    void myMeyhod() {
        class LocalInner {
            int iv = 300;
//            static int cv = 300;
            final static int CONST = 300;
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
        InnerEx1 i = new InnerEx1();
//        i.myMeyhod();
    }
}
