package com.mycompany.systemcalculator;
import javax.swing.JOptionPane;
public class SystemCalculator {

    public static void main(String[] args) {
        String menu = "1.Convert Decimal to Binary,Hexadecimal, or octal\n" +
                "2.Perform sum,subtraction,multiplication, or division on two decimal\n" +
                "3.Exit";
        
        int choice = 0;
        while(true){
            String input = JOptionPane.showInputDialog(null, menu, "Choices", JOptionPane.QUESTION_MESSAGE);
            
            if (input == null){
                JOptionPane.showMessageDialog(null,"Invalid input");
                break;
            }
            if (input.matches("\\d+")){
                choice = Integer.parseInt(input);
            }else {
                JOptionPane.showMessageDialog(null,"Invalid input");
                continue;
            }
            switch(choice){
                case 1:
                    String decimalInput = JOptionPane.showInputDialog(null, "Enter decimal number:");
                    if (decimalInput != null && decimalInput.matches("\\d+")){
                    Calculator calculator = new Calculator(Integer.parseInt(decimalInput));
                    JOptionPane.showMessageDialog(null, "Binary: " + calculator.toBinary() + 
                            "\nHexadecimal: " + calculator.toHexadecimal() + 
                            "\nOctal: " + calculator.toOctal());
                }
                case 2:
                    String firstDecimalInput = JOptionPane.showInputDialog(null, "Enter the first decimal number:");
                    String secondDecimalInput = JOptionPane.showInputDialog(null, "Enter the second decimal number:");

                    if (firstDecimalInput != null && secondDecimalInput != null && 
                        Validator.isPostive(firstDecimalInput) && Validator.isPostive(secondDecimalInput)) {

                        Calculator calc1 = new Calculator(Integer.parseInt(firstDecimalInput));
                        Calculator calc2 = new Calculator(Integer.parseInt(secondDecimalInput));

                        String operation = JOptionPane.showInputDialog(null, "Choose operation: \n1.SUM \n2.DIFFERENCE \n3.PRODUCT \n4.QUOTIENT");
                        int opChoice = Integer.parseInt(operation);

                        switch (opChoice) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Sum: " + calc1.calculateSum(calc2.getDecimal()));
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Difference: " + calc1.calculateDifference(calc2.getDecimal()));
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Product: " + calc1.calculateProduct(calc2.getDecimal()));
                                break;
                            case 4:
                                try {
                                    JOptionPane.showMessageDialog(null, "Quotient: " + calc1.calculateQuotient(calc2.getDecimal()));
                                } catch (ArithmeticException e) {
                                    JOptionPane.showMessageDialog(null, e.getMessage());
                                }
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Invalid operation choice.");
                                break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter positive integers.");
                    }
                    break;
                    
                case 3:
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
