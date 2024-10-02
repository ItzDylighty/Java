package com.mycompany.numbersystemconverter;

import javax.swing.JOptionPane;
public class NumberSystemConverter {

    public static void main(String[] args) {
        String menu = "1. Convert Decimal to Binary, Hexadecimal, Octal\n" +
                      "2. Convert Binary to Decimal\n" +
                      "3. Convert Hexadecimal to Decimal\n" +
                      "4. Convert Octal to Decimal\n" +
                      "5. Exit";
        int choice = 0;

        while (true) {
            String input = JOptionPane.showInputDialog(null, menu, "Enter Choice:", JOptionPane.INFORMATION_MESSAGE);

            if (input == null) {
                JOptionPane.showMessageDialog(null, "No input provided. Exiting.");
                break;
            }

            if (input.matches("\\d+")) {
                choice = Integer.parseInt(input);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid number.");
                continue; 
            }

            switch (choice) {
                case 1:
                    String decimalInput = JOptionPane.showInputDialog("Enter a decimal number:");
                    if (decimalInput != null && decimalInput.matches("\\d+")) {
                        int decimal = Integer.parseInt(decimalInput);
                        Converter decimalConversion = new Converter(decimal);
                        JOptionPane.showMessageDialog(null, "Binary: " + decimalConversion.toBinary() +
                            "\nHexadecimal: " + decimalConversion.toHexadecimal() +
                            "\nOctal: " + decimalConversion.toOctal());
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid decimal input!");
                    }
                    break;

                case 2:
                    String binaryInput = JOptionPane.showInputDialog("Enter a binary number:");
                    if (binaryInput != null && Validation.validBinary(binaryInput)) {
                        Converter binaryConversion = new Converter(binaryInput, 2);
                        JOptionPane.showMessageDialog(null, "Decimal: " + binaryConversion.getDecimal());
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid binary input!");
                    }
                    break;

                case 3:
                    String hexInput = JOptionPane.showInputDialog("Enter a hexadecimal number:");
                    if (hexInput != null && Validation.validHexadecimal(hexInput)) {
                        Converter hexConversion = new Converter(hexInput, 16);
                        JOptionPane.showMessageDialog(null, "Decimal: " + hexConversion.getDecimal());
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid hexadecimal input!");
                    }
                    break;

                case 4:
                    String octalInput = JOptionPane.showInputDialog("Enter an octal number:");
                    if (octalInput != null && Validation.validOctal(octalInput)) {
                        Converter octalConversion = new Converter(octalInput, 8);
                        JOptionPane.showMessageDialog(null, "Decimal: " + octalConversion.getDecimal());
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid octal input!");
                    }
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Program Terminated...");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice! Please select a valid option.");
                    break;
            }
        }
    }
}
