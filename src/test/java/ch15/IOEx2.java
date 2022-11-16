package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx2 {
    public static void main(String[] args) {
        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] outSrc = null;
        byte[] temp = new byte[10];

        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;

        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();

        input.read(temp, 0, temp.length);
        output.write(temp, 5, 5);

        outSrc = output.toByteArray();  // ㅅㅡ틜므이 내용을 byte 배열로 반환한다.

        System.out.println("Input Source  : " + Arrays.toString(inSrc));
        System.out.println("temp          : " + Arrays.toString(temp));
        System.out.println("Output Source : " + Arrays.toString(outSrc));
    }
}
