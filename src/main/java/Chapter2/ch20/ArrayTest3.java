package Chapter2.ch20;

public class ArrayTest3 {
    public static void main(String[] args) {
        double[] dArr = new double[5];
        int count = 0;

        dArr[0] = 1.1; count++;
        dArr[1] = 2.2; count++;
        dArr[2] = 3.3; count++;

        double mtotal = 1;
        for (int i = 0; i < count; i++) {
            mtotal *= dArr[i];
            System.out.println("dArr[" + i + "] = " + dArr[i]);
        }
        System.out.println("mtotal = " + mtotal);
    }
}
