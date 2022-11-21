package Chapter2.ch19;

public class Car {
    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    public Car() {
        serialNum++;
        carNum = serialNum;
    }

    private int carNum;
    private static int serialNum = 10000;

}
