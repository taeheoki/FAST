package Chapter3.ch15.BookShelf;

public interface Queue {
    void enQueue(String title);
    String deQueue();

    int getSize();
}
