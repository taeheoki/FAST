package Chapter2.ch20;

public class ArrayTest2 {
    public static void main(String[] args) {
        double[] dArr = new double[5];

        dArr[0] = 1.1;
        dArr[1] = 2.2;
        dArr[2] = 3.3;

        double mtotal = 1;
        int i = 0;
        for (double num : dArr) {
            mtotal *= num;
            System.out.println("dArr[" + i++ + "] = " + num);
        }
        System.out.println("mtotal = " + mtotal);
    }
}
