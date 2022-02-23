package com.school.users;

public class Teacher {
    
    private String firstName;
    private String lastName;
    private String matricule;

    public Teacher(String firstName, String lastName, String matricule) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.matricule = matricule;
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

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void getInfo(){
        System.out.println("FirstName : "+ getFirstName()+
            "\nLastName : "+getLastName()+
            "\nMatricule : "+ getMatricule());
    }
    
}
