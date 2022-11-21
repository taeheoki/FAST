package Chapter7.mandatory.school;

import Chapter7.mandatory.utils.Define;

import java.util.ArrayList;

public class Subject {
    private String subjectName;
    private int subjectId;
    private int gradeType;

    // 수강 신청한 학생 리슽
    // register() 메서드를 호출하면 리스트에 추가 됨
    private ArrayList<Student> studentList = new ArrayList<>();

    public Subject(String subjectName, int subjectId) {
        this.subjectName = subjectName;
        this.subjectId = subjectId;
        this.gradeType = Define.AB_TYPE;    // 기본적으로 A, B 타입
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void register(Student student) { // 수강신청
        studentList.add(student);
    }
}
