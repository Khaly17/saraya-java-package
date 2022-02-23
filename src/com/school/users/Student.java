package com.school.users;

import com.school.grades.Grade;

public class Student {
    
    private String firstName;
    private String lastName;
    private Grade grade;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
    
    public void getInfo() {
        System.out.println("FirstName : "+ getFirstName()+
            "\nLastName : "+getLastName()+
            "\nGrade : "+ getGrade().getNameGrade());
    }
}
