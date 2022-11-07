package Chapter6.ch15;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        int i;
        try (FileReader fis = new FileReader("src/main/java/Chapter6/ch15/reader.txt")) {

            while ((i = fis.read()) != -1) {
                System.out.print((char)i);
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
