package com.mycompany.systemcalculator;

public class Calculator {
    private int value;
    
    public Calculator(int value){
        this.value = value;
    }
    
    public Calculator(String input, int base){
        this.value = Integer.parseInt(input, base);
    }
    
    public int getDecimal(){
        return value;
    }
    
    public String toBinary(){
        return Integer.toBinaryString(value);
    }
    
    public String toHexadecimal(){
        return Integer.toHexString(value).toUpperCase();
    }
    
    public String toOctal(){
        return Integer.toOctalString(value);
    }
    
    public int calculateSum(int otherValue) {
        return this.value + otherValue;
    }

    public int calculateDifference(int otherValue) {
        return this.value - otherValue;
    }

    public int calculateProduct(int otherValue) {
        return this.value * otherValue;
    }

    public double calculateQuotient(int otherValue) {
        return (double) this.value / otherValue;
    }

}
