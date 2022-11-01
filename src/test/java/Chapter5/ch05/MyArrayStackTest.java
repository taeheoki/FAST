package Chapter5.ch05;

public class MyArrayStackTest {
    public static void main(String[] args) {
        MyArrayStack myArrayStack = new MyArrayStack();
        myArrayStack.push(10);
        myArrayStack.push(20);
        myArrayStack.push(30);
        myArrayStack.push(40);

        myArrayStack.printAll();

        System.out.println(myArrayStack.pop());
        System.out.println(myArrayStack.peek());
        System.out.println(myArrayStack.pop());
        System.out.println(myArrayStack.peek());
    }
}
