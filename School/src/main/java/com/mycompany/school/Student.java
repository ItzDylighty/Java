
package com.mycompany.school;

public class Student {
    int studentID;
    String name;
    int grade;
    
    public Student(int studentID, String name, int grade){
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;
    }
    public void enrollStudent(){
        System.out.println("Enrollment System");
        System.out.println("StudentID: " + this.studentID);
        System.out.println("Name: " + this.name);
        System.out.println("Grade: " + this.grade);

    }
    public void viewGrades(){
        System.out.println("Current Grade");
        System.out.println("Grade: " + this.grade);
    }
    
    public void updateInformation(int upID, String upName, int upGrade){
       this.name = upID;
        this.name = upName;
       this.grade = upGrade;
       System.out.println("Updated Information.");
       
    }
}

