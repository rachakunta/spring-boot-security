package com.rana.spring.models;

public class Student extends Person {

    private String studentId;
    private String schoolName;
    private int grade;

    public Student(String lastName, String firstName, int age, Gender gender, String studentId, String schoolName, int grade) {
        super(lastName, firstName, age, gender);
        this.studentId = studentId;
        this.schoolName = schoolName;
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
