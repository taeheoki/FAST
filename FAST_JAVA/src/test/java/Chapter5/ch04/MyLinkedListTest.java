package Chapter5.ch04;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addElement("A");
        myLinkedList.addElement("B");
        myLinkedList.addElement("C");
        myLinkedList.printAll();
        System.out.println(myLinkedList.getSize());
        myLinkedList.removeElement(3);
        myLinkedList.insertElement(3, "D");
        myLinkedList.printAll();
        myLinkedList.removeElement(0);
        myLinkedList.printAll();
        myLinkedList.removeElement(1);
        myLinkedList.printAll();

        myLinkedList.insertElement(0, "A-1");
        myLinkedList.printAll();
        System.out.println(myLinkedList.getSize());

        myLinkedList.removeElement(0);
        myLinkedList.printAll();
        System.out.println(myLinkedList.getSize());

        myLinkedList.removeAll();
        myLinkedList.printAll();
        myLinkedList.addElement("A");
        myLinkedList.printAll();
        System.out.println(myLinkedList.getElement(0));
        myLinkedList.removeElement(0);
        myLinkedList.printAll();
    }

}
