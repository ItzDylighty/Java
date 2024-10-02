package com.mycompany.numbersystemconverter;

public class Converter {
    private int decimal;

    public Converter(int decimal) {
        this.decimal = decimal;
    }

    public Converter(String input, int base) {
        this.decimal = Integer.parseInt(input, base);
    }

    public int getDecimal() {
        return decimal;
    }

    public String toBinary() {
        return Integer.toBinaryString(decimal);
    }

    public String toHexadecimal() {
        return Integer.toHexString(decimal).toUpperCase();
    }

    public String toOctal() {
        return Integer.toOctalString(decimal);
    }
}

    

