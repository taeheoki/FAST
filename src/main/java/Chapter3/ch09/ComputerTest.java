package Chapter3.ch09;

public class ComputerTest {
    public static void main(String[] args) {
        Computher computher = new Desktop();
        computher.display();
        computher.typing();
        computher.turnOn();
        computher.turnOff();

        MyNoteBook myNoteBook = new MyNoteBook();
        myNoteBook.display();
        myNoteBook.typing();
        myNoteBook.turnOn();
        myNoteBook.turnOff();
    }
}
