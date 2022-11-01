package Chapter5.ch03;

public class MyArrayTest {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.addElement(10);
        myArray.addElement(20);
        myArray.addElement(30);
        myArray.insertElement(3, 50);
        myArray.printAll();

        System.out.println("===============");
        myArray.removeElement(3);
        myArray.printAll();
        System.out.println("===============");

        myArray.addElement(70);
        myArray.printAll();
        System.out.println("===============");
        myArray.removeElement(1);
        myArray.printAll();

        System.out.println("===============");
        System.out.println(myArray.getElement(2));
        System.out.println("===============");
        myArray.removeAll();
        myArray.printAll();

    }
}
