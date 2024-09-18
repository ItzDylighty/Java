
package com.mycompany.hospital;
public class Patient {
    private int patientID;
    private String patientName;
    int age;
    boolean admit;
    
    public Patient(int patientID, String patientName, int age){
        this.patientID = patientID;
        this.patientName = patientName;
        this.age = age;
        this.admit = false;
    }
    public void admitPatient(){
        admit = true;
    }
    public void dischargePatient(){
        admit = false;
    }
    
    public String getPatientDetails(){
        return "Patient Details: \nPatient ID: " + patientID + "\nPatient Name: " + patientName 
                + "\nAge: " + age;
    }
}
