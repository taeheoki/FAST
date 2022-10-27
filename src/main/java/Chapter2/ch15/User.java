package Chapter2.ch15;

public class User {
    private String name;
    private int money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeTaxi(Texi texi) {
        texi.take(10000);
        money -= 10000;
    }

    public void userInfo() {
        System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
    }
}
