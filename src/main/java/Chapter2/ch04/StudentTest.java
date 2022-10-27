package Chapter2.ch04;

public class StudentTest {
    public static void main(String[] args) {
        Student studentKim = new Student();

        studentKim.studentID = 201311664;
        studentKim.setStudentName("Kim");
        studentKim.address = "서울 서초구";

        studentKim.showStudentInfo();

        Student studentCho = new Student();

        studentCho.studentID = 54321;
        studentCho.setStudentName("Cho");
        studentCho.address = "서울 강남구";

        studentCho.showStudentInfo();
        System.out.println(studentKim); // Chpater2.ch04.Student@1324409e address 주소
        System.out.println(studentCho); // Chpater2.ch04.Student@2c6a3f77 address 주소
    }
}
