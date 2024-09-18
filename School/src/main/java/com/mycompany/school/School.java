package com.mycompany.school;

import java.util.Scanner;
public class School {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter Student ID: ");
        int studentID = scn.nextInt();
        scn.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scn.nextLine();
        System.out.print("Enter Student Grade: ");
        int grade = scn.nextInt();
        scn.nextLine();
        
        
        Student student = new Student(studentID, name, grade);
        
        student.enrollStudent();
        student.viewGrades();

        System.out.print("Enter Update ID: ");
        String upName = scn.nextLine();
        System.out.print("Enter Update name: ");
        String upName = scn.nextLine();
        System.out.print("Enter Update Grades: ");
        int upGrade = scn.nextInt();
        student.updateInformation(upID, upName, upGrade);
        
    }
}
