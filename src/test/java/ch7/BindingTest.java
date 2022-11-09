package ch7;

class Parent {
    int x = 100;

    public void method() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    int x = 200;
    int y = 400;

    public void method() {
        System.out.println("Child Method");
    }
}

public class BindingTest {
    public static void main(String[] args) {
        Parent p = new Child();
//        Child c = new Child();

        System.out.println("p.x = " + p.x);
        p.method();
//        System.out.println("c.x = " + c.x);
//        c.method();
    }
}
