package com.mycompany.shopping;

public class Product {
    int productID;
    String productName;
    int price;
    
    
    public Product(int productID, String productName, int price){
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }
    public void addToCart(){
        System.out.println("Added To Cart: " + this.productName);
    }
    public void viewProductDetails(){
        System.out.println("Product Details:");
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName); 
        System.out.println("Product Price: " + price);
        
    }
    public void calculateDiscount(int discountPrice ){
        double totalDiscount = price * (discountPrice / 100.0);
        double discountedPrice = price - totalDiscount;
        System.out.println("Discount: " + totalDiscount);
        System.out.println("Total Price: " + discountedPrice);
    }
}
