
package com.mycompany.hospital;

import java.util.Scanner;
public class Hospital {

    public static void main(String[] args) {
        Scanner acc = new Scanner(System.in);
        
        System.out.print("Enter Patient ID: ");
        int patientID = acc.nextInt();
        acc.nextLine(); 
        
        System.out.print("Enter Patient Name: ");
        String patientName = acc.nextLine();
        
        System.out.print("Enter Patient Age: ");
        int age = acc.nextInt();
        acc.nextLine();
        Patient patient = new Patient(patientID, patientName, age);
        
        System.out.print("Enter Choice (admit or discharge): ");
        String choice = acc.nextLine().toLowerCase(); 
        
        switch(choice) {
            case "admit":
                patient.admitPatient();
                System.out.println("Patient Admitted.");
                break;
            case "discharge":
                patient.dischargePatient(); 
                System.out.println("Patient Discharged.");
                break;
            
            default:
                System.out.println("Invalid Input");
                break;
        }

        System.out.println(patient.getPatientDetails());
    }
}
