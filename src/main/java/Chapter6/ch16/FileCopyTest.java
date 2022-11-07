package Chapter6.ch16;

import java.io.*;

public class FileCopyTest {
    public static void main(String[] args) {
        long millisecond = 0;

        try (FileInputStream fis = new FileInputStream("src/main/java/Chapter6/ch16/a.zip");
            FileOutputStream fos = new FileOutputStream("src/main/java/Chapter6/ch16/copy.zip")) {

            millisecond = System.currentTimeMillis();

            int i;
            while ((i = fis.read()) != -1) {
                fos.write(i);
            }
            millisecond = System.currentTimeMillis() - millisecond;


        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(millisecond + " 소요되었습니다.");

        System.out.println("====================================");

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/main/java/Chapter6/ch16/a.zip"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/main/java/Chapter6/ch16/copy.zip"))) {

            millisecond = System.currentTimeMillis();

            int i;
            while ((i = bis.read()) != -1) {
                bos.write(i);
            }
            millisecond = System.currentTimeMillis() - millisecond;


        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(millisecond + " 소요되었습니다.");
    }
}
