package com.school.grades;

public class Grade {
    //nom, nomStudent
    private String nameGrade;
    private int numberStudent;

    public Grade(String nameGrade, int numberStudent) {
        this.nameGrade = nameGrade;
        this.numberStudent = numberStudent;
    }

    public String getNameGrade() {
        return nameGrade;
    }

    public void setNameGrade(String nameGrade) {
        this.nameGrade = nameGrade;
    }

    public int getNumberStudent() {
        return numberStudent;
    }

    public void setNumberStudent(int numberStudent) {
        this.numberStudent = numberStudent;
    }

    
    
}
