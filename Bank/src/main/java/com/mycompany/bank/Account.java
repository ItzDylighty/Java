
package com.mycompany.bank;

public class Account {
    private int accountNumber;
    private String accountHolderName;
    double balance;
    
        public Account(int accountNumber, String accountHolderName,
                        double balance){
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
    
        }
        public void deposit(double amount){
            if (this.balance >= amount){
                this.balance += amount;
                System.out.printf("Amount Deposit: %.2f%n" , amount);
            }     
        }
        
        public void withdraw(double amount){
            if (this.balance >= amount){
                this.balance -= amount;
                System.out.printf("Amount Withdrawn: %.2f%n" , amount);
            }
        }
        
        public double getbalance(){
            return balance;
        }
}
