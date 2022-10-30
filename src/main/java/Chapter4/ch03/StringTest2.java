package Chapter4.ch03;

public class StringTest2 {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");
        System.out.println("java의 해쉬코드 값 : " + System.identityHashCode(java));

        java = java.concat(android);

        System.out.println(java);
        System.out.println("concat 이후 java의 해쉬코드 값 : " + System.identityHashCode(java));
    }
}
