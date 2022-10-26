package Chapter1.ch09;

public class LocalVariableType {
    public static void main(String[] args) {
        var i = 10;         // int
        var j = 10.0;       // double
        var str = "hello";  // string

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "test";
//        str = 3;          // 다른 타입을 대입할 수 없다.
    }
}
