package ch7;

class A1 {
    void methodA() {
        I1 i = InstanceManager.getInstance();
        i.methodB();
        I1.staticMethod();
        System.out.println(i.toString());
    }
}

interface I1 {
    public abstract void methodB();

    public static void staticMethod() {
        System.out.println("static method");
    }
}

class B1 implements I1 {

    @Override
    public void methodB() {
        System.out.println("methodB in B1 class");
    }

    @Override
    public String toString() {
        return "class B";
    }
}

class InstanceManager {
    public static I1 getInstance() {
        return new B1();
    }
}

public class InterfaceTest3 {
    public static void main(String[] args) {
        A1 a = new A1();
        a.methodA();
    }
}