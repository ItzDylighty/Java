package com.mycompany.numbersystemconverter;

public class Validation {
    public static boolean validBinary(String input){
        return input.matches("[01]+");
    }
    public static boolean validHexadecimal(String input){
        return input.matches("[0-9a-zA-f]+");
    }
    public static boolean validOctal(String input){
        return input.matches("[0-7]+");
    }
}
