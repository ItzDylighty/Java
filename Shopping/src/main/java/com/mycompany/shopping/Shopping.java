package com.mycompany.shopping;

import java.util.Scanner;
public class Shopping {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter Product ID: ");
        int productID = scn.nextInt();
        scn.nextLine();
        System.out.print("Enter Product Name: ");
        String productName = scn.nextLine();
        System.out.print("Enter Price: ");
        int price = scn.nextInt();
        scn.nextLine();
        
        
        Product product = new Product(productID, productName, price);
        
        product.addToCart();
        product.viewProductDetails();
        
        System.out.print("Enter Discount: ");
        int discount = scn.nextInt();
        
        product.calculateDiscount(discount);
       
    }
}
