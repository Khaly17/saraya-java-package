package com.school.courses;

import com.school.grades.Grade;
import com.school.users.Teacher;

public class Course {

    private String classTime;
    private String nameCourses;
    private String startTime;
    private String endTime;
    private Teacher teacher;
    private Grade grade;

    public Course(String nameCourses, String classTime,  String startTime, String endTime) {
        this.nameCourses = nameCourses;
        this.classTime = classTime;
        this.startTime = startTime;
        this.endTime = endTime;
        // this.teacher = teacher;
        // this.grade = grade;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public String getNameCourses() {
        return nameCourses;
    }

    public void setNameCourses(String nameCourses) {
        this.nameCourses = nameCourses;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public void getInfo(){
        System.out.println("NameCourse : "+ getNameCourses()+
            "\nClass Time : "+getClassTime()+
            "\nStart Time : "+getStartTime()+
            "\nEnd Time : "+getEndTime()+
            "\nFirstName teacher : "+getTeacher().getFirstName()+
            "\nLastName teacher : "+getTeacher().getLastName()+
            "\nMatricule teacher : "+getTeacher().getMatricule()+
            "\nGrade : "+ getGrade().getNameGrade());
    }

    
}
