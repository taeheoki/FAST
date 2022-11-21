package Chapter2.ch12;

public class Student {
    String name;
    int age;
    String major;

    public Student() {
        this("이름 없음", -1, "국어");
    }

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }
}
