package Chapter6.ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamtest1 {
    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("src/main/java/Chapter6/ch14/input.txt");
            System.out.println((char)fis.read());
            System.out.println((char)fis.read());
            System.out.println((char)fis.read());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                System.out.println(e2);
            }
        }
        System.out.println("end");
    }
}
