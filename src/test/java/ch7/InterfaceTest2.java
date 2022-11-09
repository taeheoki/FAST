package ch7;

class C {
    public void methodA(I i) {
        i.method();
    }
}

interface I {
    void method();
}

class D implements I {
    public void method() {
        System.out.println("methodD()");
    }
}

class E implements I {
    public void method() {
        System.out.println("methodE()");
    }
}

public class InterfaceTest2 {
    public static void main(String[] args) {
        C c = new C();
        c.methodA(new D());
        c.methodA(new E());
    }
}
