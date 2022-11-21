package Chapter1.ch11;

public class OperatorTest {
    public static void main(String[] args) {
        int gameScore = 150;
        int lastScore = ++gameScore;
        System.out.println("lastScore = " + lastScore);
        System.out.println("gameScore = " + gameScore);

        gameScore = 150;
        lastScore = gameScore++;
        System.out.println("lastScore = " + lastScore);
        System.out.println("gameScore = " + gameScore);
    }
}
