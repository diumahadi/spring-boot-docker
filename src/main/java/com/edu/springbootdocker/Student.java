package com.edu.springbootdocker;

public class Student {

    private String studentId;
    private String dropOutProbability;

    public Student() {
    }

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getDropOutProbability() {
        return dropOutProbability;
    }

    public void setDropOutProbability(String dropOutProbability) {
        this.dropOutProbability = dropOutProbability;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", dropOutProbability='" + dropOutProbability + '\'' +
                '}';
    }
}
