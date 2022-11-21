package Chapter2.ch15;

public class Texi {
    private String texiName;
    private int money;

    public String getTexiName() {
        return texiName;
    }

    public void setTexiName(String texiName) {
        texiName = texiName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void take(int money) {
        money += 10000;
    }

    public Texi(String texiName) {
        this.texiName = texiName;
    }

    public void texiInfo() {
        System.out.println(texiName + "택시 수입은 " + money + "원 입니다.");
    }
}
