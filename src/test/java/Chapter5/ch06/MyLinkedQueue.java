package Chapter5.ch06;

import Chapter5.ch04.MyLinkedList;
import Chapter5.ch04.MyListNode;

interface Queue {
    public void enQueue(String data);
    public String deQueue();
    public void printQueue();
}

public class MyLinkedQueue extends MyLinkedList implements Queue {

    MyListNode front;
    MyListNode rear;

    public MyLinkedQueue() {
        this.front = null;
        this.rear = null;
    }

    @Override
    public void enQueue(String data) {
        MyListNode newNode;
        if (isEmpty()) {
            newNode = addElement(data);
            front = newNode;
            rear = newNode;
        }
        else {
            newNode = addElement(data);
            rear = newNode;
        }
        System.out.println(newNode.getData() + " added");
    }

    @Override
    public String deQueue() {
        if (isEmpty()) {
            return null;
        }

        String data = front.getData();
        front = front.next;

        if (front == null) {
            rear = null;
        }
        return data;
    }

    @Override
    public void printQueue() {
        printAll();
    }
}
