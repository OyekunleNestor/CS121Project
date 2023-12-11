package weekTwo;

import javax.swing.JOptionPane;


public class UserMath {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Enter the first number:");
        String input2 = JOptionPane.showInputDialog("Enter the second number:");
        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double squareRoot1 = Math.sqrt(num1);
        double squareRoot2 = Math.sqrt(num2);
        double power1 = Math.pow(num1, num2);
        double power2 = Math.pow(num2, num1);
        double log1 = Math.log(num1);
        double log2 = Math.log(num2);
        JOptionPane.showMessageDialog(null, "Addition: " + addition);
        JOptionPane.showMessageDialog(null, "Subtraction: " + subtraction);
        JOptionPane.showMessageDialog(null, "Multiplication: " + multiplication);
        JOptionPane.showMessageDialog(null, "Division: " + division);
        JOptionPane.showMessageDialog(null, "Square Root of Number 1: " + squareRoot1);
        JOptionPane.showMessageDialog(null, "Square Root of Number 2: " + squareRoot2);
        JOptionPane.showMessageDialog(null, "Number 1 raised to the power of Number 2: " + power1);
        JOptionPane.showMessageDialog(null, "Number 2 raised to the power of Number 1: " + power2);
        JOptionPane.showMessageDialog(null, "Natural logarithm of Number 1: " + log1);
        JOptionPane.showMessageDialog(null, "Natural logarithm of Number 2: " + log2);
    }
}
