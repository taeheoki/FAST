package Chapter5.ch06;

public class MyListQueueTest {
    public static void main(String[] args) {
        MyLinkedQueue myLinkedQueue = new MyLinkedQueue();
        myLinkedQueue.enQueue("A");
        myLinkedQueue.enQueue("B");
        myLinkedQueue.enQueue("C");

        myLinkedQueue.printQueue();

        System.out.println(myLinkedQueue.deQueue());
        System.out.println(myLinkedQueue.deQueue());
    }
}
