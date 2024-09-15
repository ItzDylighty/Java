package com.mycompany.reservation;

public class Detail {
    private String name;
    private String email;
    private String address;
    private String contact;
    private int guests;
    private String room;
    private String payment;
    
    private final String Cash = "Cash";
    private final String Card = "Card";
    private final String Single = "Single";
    private final String Double = "Double";
    private final String Queen = "Queen";
    private final String King = "King";
 
    
    public Detail(String name, String email, String address,
                    String contact, int guests, String room, String payment){
        this.name = name;
        this.email = email;
        this.address = address;
        this.contact = contact;
        this.guests = guests;
        this.room = room;
        this.payment = payment;
    }
    
    public void displayInformation(){
        System.out.println("Confirm Reservation Details");
        System.out.println("Your Name: " + this.name);
        System.out.println("Your Email: " + this.email);
        System.out.println("Your Address: " + this.address);
        System.out.println("Your Contact number: " + this.contact);
        System.out.println("Your Guess number: " + this.guests);
        
    }
    
    public void displayRoomType(){
        if (room.equalsIgnoreCase(Single)){
            System.out.println("Single Room Type Confirm!");
        } else if (room.equalsIgnoreCase(Double)){
            System.out.println("Double Room Type Confirm!");
       
        } else if (room.equalsIgnoreCase(Queen)){
            System.out.println("Queen Room Type Confirm!");
       
        } else if (room.equalsIgnoreCase(King)){
            System.out.println("King Room Type Confirm!");
        }else{
            System.out.println("Invalid. Try Again!");
        }
    }
    public void displayPaymentMethod(){
        if (payment.equalsIgnoreCase(Cash)){
            System.out.println("Cash Payment Confirm!");
            
        
        } else if (payment.equalsIgnoreCase(Card)){
           System.out.println("Card Payment COnfirm!");
        
        }else{
            System.out.println("Invalid Payment. Try Again!");
        }
    }
}


