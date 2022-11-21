package Chapter2.ch24;

import java.util.ArrayList;

public class Student {
    private int studentId;
    private String name;
    private ArrayList<Subject> subjectList;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;

        subjectList = new ArrayList<>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject(name, score);
        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;
        for (int i = 0; i < subjectList.size(); i++) {
            System.out.println("학생 " + name + "의 " + subjectList.get(i).getName() + " 과목 성적은 " + subjectList.get(i).getScore() + "입니다.");
            total += subjectList.get(i).getScore();
        }
        System.out.println("학생 " + name + "의 총점은 "+ total + " 입니다.");
    }
}
