package com.school.courses;

import com.school.grades.Grade;
import com.school.users.Teacher;

public class Course {

 
    private String name;
    private Integer startingHour;
    private Integer endingHour;
    private Teacher teacher;
    private Grade grade;

    public Course(String name, Integer startingHour, Integer endingHour) {
        this.name = name;
        this.startingHour = startingHour;
        this.endingHour = endingHour;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStartingHour() {
        return startingHour;
    }

    public void setStartingHour(Integer startingHour) {
        this.startingHour = startingHour;
    }

    public Integer getEndingHour() {
        return endingHour;
    }

    public void setEndingHour(Integer endingHour) {
        this.endingHour = endingHour;
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
        System.out.println("NameCourse : "+ getName()+
            "\nStart Time : "+getStartingHour()+
            "\nEnd Time : "+getEndingHour()+
            "\nFirstName teacher : "+getTeacher().getFirstName()+
            "\nLastName teacher : "+getTeacher().getLastName()+
            "\nMatricule teacher : "+getTeacher().getMatricule()+
            "\nGrade : "+ getGrade().getNameGrade());
    }

    
}
