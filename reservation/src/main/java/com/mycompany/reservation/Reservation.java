package com.mycompany.reservation;

import java.util.Scanner;
public class Reservation {

    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        
        System.out.println("Welcome to Hotel FTR. Reservation");
        
        
        System.out.print("Enter Name: ");
        String name = d.nextLine();
        System.out.print("Enter email: ");
        String email = d.nextLine();
        System.out.print("Enter Address: ");
        String address = d.nextLine();
        System.out.print("Enter Contact Number: ");
        String contact = d.next();
        d.nextLine();
        System.out.print("Enter How many guests: ");
        int guests = d.nextInt();
        d.nextLine();
        System.out.print("Enter Type of room (Single/Double/Queen/King): ");
        String room = d.nextLine();
        System.out.print("Enter Payment Method (Cash/Card): ");
        String payment = d.nextLine();
        
        Detail detail = new Detail(name, email, address, contact,guests,room,payment);
        detail.displayInformation();
        detail.displayRoomType();
        detail.displayPaymentMethod();
    }
}
