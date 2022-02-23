package com.school.grades;

public class Grade {
    //nom, nomStudent
    private String nameGrade;
    private Integer numberOfStudents;

    public Grade(String nameGrade, Integer numberOfStudents) {
        this.nameGrade = nameGrade;
        this.numberOfStudents = numberOfStudents;
    }

    public String getNameGrade() {
        return nameGrade;
    }

    public void setNameGrade(String nameGrade) {
        this.nameGrade = nameGrade;
    }

    public Integer getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(Integer numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    
    
}
