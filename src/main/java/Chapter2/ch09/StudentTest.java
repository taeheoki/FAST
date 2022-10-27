package Chapter2.ch09;

public class StudentTest {
    public static void main(String[] args) {
        Student studentKim = new Student(100, "Kim");
        studentKim.setKoreaSubject("국어", 100);
        studentKim.setMathSubject("수학", 99);

        Student studentPark = new Student(200, "Park");
        studentPark.setKoreaSubject("국어", 50);
        studentPark.setMathSubject("수학", 65);

        studentKim.showScore();
        studentPark.showScore();
    }
}

