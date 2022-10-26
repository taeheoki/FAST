package Chapter1.ch06;

public class App {
    public static void main(String[] args) {
//        int num = 12345678900; // 오류
//        long lnum = 12345678900; //오류
        long lnumber = 12345678900L; // ok

//        System.out.println(num);
//        System.out.println(lnum);
        System.out.println(lnumber);

        System.out.println("================================");

        byte bNum = 127;
        System.out.println("bNum = " + bNum);
    }
}
