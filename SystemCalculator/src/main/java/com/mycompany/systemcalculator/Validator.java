package com.mycompany.systemcalculator;
public class Validator {
    public static boolean isvalidBinary(String input){
        return input.matches("[01]+");
    }
    public static boolean isvalidHexadecimal(String input){
        return input.matches("[0-9a-zA-f]+");
    }
    public static boolean isvalidOctal(String input){
        return input.matches("[0-7]+");
    }
    
     public static boolean isPostive(String input){
        return input.matches("^[1-9][0-9]*$");
    }
}
