package com.mycompany.bank;

import java.util.Scanner;
public class Bank {

    public static void main(String[] args) {
        Scanner acc = new Scanner(System.in);
        
        System.out.print("Enter Account Number: ");
        int accountNumber = acc.nextInt();
        acc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = acc.nextLine();
        System.out.print("Enter Intial Balance: ");
        double balance = acc.nextDouble();
        
        Account account = new Account(accountNumber, accountHolderName, balance );
        
        System.out.print("Enter Deposit Balance: ");
        double depositAmount = acc.nextDouble();
        account.deposit(depositAmount);
        
        System.out.print("Enter Withdrawn Balance: ");
        double withdrawnAmount = acc.nextDouble();
        account.withdraw(withdrawnAmount);
        
        System.out.printf("Current Total Balance: %.2f%n" , account.getbalance());
        
    }
}
