package Chapter6.ch18;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile("src/main/java/Chapter6/ch18/random.txt", "rw");

        rf.writeInt(100);
        System.out.println("pos : " + rf.getFilePointer()); // 4 바이트
        rf.writeDouble(3.14);
        System.out.println("pos : " + rf.getFilePointer()); // 8바이트
        rf.writeUTF("안녕하세요");
        System.out.println("pos : " + rf.getFilePointer()); // 한글은 3바이트, 마지막 개행 2바이트

        rf.seek(0);
        System.out.println("파일 포인터 위치:" + rf.getFilePointer());


        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();

        System.out.println(i);
        System.out.println(d);
        System.out.println(str);
    }
}
