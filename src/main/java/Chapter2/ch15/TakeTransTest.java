package Chapter2.ch15;

public class TakeTransTest {
    public static void main(String[] args) {
        User user = new User("Edward", 20000);
        Texi texi = new Texi("잘 간다 운수");

        user.takeTaxi(texi);
        user.userInfo();
        texi.texiInfo();
    }
}
