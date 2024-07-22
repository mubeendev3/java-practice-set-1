package mubeendevelopment;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class AssignmentNo1 {
    Scanner sc = new Scanner(System.in);
    public void questionNo1() {
        String userInput = JOptionPane.showInputDialog("Enter your temprature in Fahrenheit");
        int tempratureInFahrenheit = Integer.parseInt(userInput);
        double fahToCel = (tempratureInFahrenheit - 32) * 5 / 9;
        JOptionPane.showMessageDialog(null, String.format("Your temprature in celcius is: " + fahToCel));
    }
    
    public void questionNo2() {
        String length = JOptionPane.showInputDialog("Enter the Length for a Rectangle");
        String width = JOptionPane.showInputDialog("Enter the Width for a Rectangle");       
        double areaOfRectangle = (Double.parseDouble(width) * Double.parseDouble(length));
        double perimeterOfRectangle = (Double.parseDouble(width) + Double.parseDouble(length)) * 2;
        JOptionPane.showMessageDialog(null, String.format("Area: " + areaOfRectangle + " Perimeter: " + perimeterOfRectangle));
        
    }
    
    public void questionNo3() {
        String userInput = JOptionPane.showInputDialog("Enter your value in double");
        double valueInDouble = Double.parseDouble(userInput);
        
        int valueInInt = (int) valueInDouble;
        float valueInFloat = Float.parseFloat(userInput);
        
        JOptionPane.showMessageDialog(null, String.format("Value In Int: " + valueInInt + "\nValue In Float: " + valueInFloat));
    }
    
    public void questionNo4() {
     String userInput = JOptionPane.showInputDialog("Enter any single character i.e: 'c'");
     char charInString = userInput.charAt(0);
     int asciiValue = (int) charInString;
     JOptionPane.showMessageDialog(null, String.format("The Ascii Value For " + charInString + " Is: " + asciiValue));
    }
    
    public void questionNo5() {
        byte initialValue = 126;
        System.out.print("The initial value for byte is 127\nIf you change the value higher than 127 you will get an error\nEnter the new higher value for byte: ");        
        byte newByteValue = sc.nextByte();
        initialValue = newByteValue;
        System.out.println("The Updated Value for byte is: " + initialValue);
    }
     
    public void questionNo6() {
         System.out.print("Enter the value for num1: ");
         double num1 = sc.nextDouble();
         System.out.print("Enter the value for num2: ");
         double num2 = sc.nextDouble();
         
         double addition = num1 + num2;
         double subtraction = num1 - num2;
         double multiplication = num1 * num2;
         double division = num1 / num2;
         double modulos = num1 % num2;
         
         System.out.println("Addition: " + addition);
         System.out.println("Subtraction: " + subtraction);
         System.out.println("Multiplication: " + multiplication);
         System.out.println("Division: " + division);
         System.out.println("Modulous: " + modulos);
     }
    
    public void questionNo7() {
        System.out.print("Enter the value for num1: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the value for num2: ");
        double num2 = sc.nextDouble();
        
        System.out.println(num1 + " += " + num2 + " = " + (num1+=num2));
        System.out.println(num1 + " -= " + num2 + " = " + (num1-=num2));
        System.out.println(num1 + " *= " + num2 + " = " + (num1*=num2));
        System.out.println(num1 + " /= " + num2 + " = " + (num1/=num2));
        System.out.println(num1 + " %= " + num2 + " = " + (num1%=num2));
    }
    
    public void questionNo8() {
        System.out.print("Enter the value for num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the value for num2: ");
        int num2 = sc.nextInt();
        
        System.out.println(num1 + " < " + num2 + " = " + (num1<num2));
        System.out.println(num1 + " > " + num2 + " = " + (num1>num2));
        System.out.println(num1 + " <= " + num2 + " = " + (num1<=num2));
        System.out.println(num1 + " >= " + num2 + " = " + (num1>=num2));
        System.out.println(num1 + " == " + num2 + " = " + (num1==num2));
        System.out.println(num1 + " != " + num2 + " = " + (num1!=num2));
    }
    
    public void questionNo9() {
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check if leap year and even number using logical operators
        boolean isLeapYear = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
        boolean isEven = year % 2 == 0;

        if (isLeapYear && isEven) {
            System.out.println(year + " is a leap year and an even number.");
        } else if (isLeapYear) {
            System.out.println(year + " is a leap year, but not an even number.");
        } else if (isEven) {
            System.out.println(year + " is an even number, but not a leap year.");
        } else {
            System.out.println(year + " is neither a leap year nor an even number.");
        }
    }
    
    public void questionNo10() {
        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();

        
        int bitwiseAnd = num1 & num2;
        int bitwiseOr = num1 | num2;
        int bitwiseXor = num1 ^ num2;
        int bitwiseNot1 = ~num1;
        

        
        System.out.println("Bitwise AND: " + num1 + " & " + num2 + " = " + bitwiseAnd);
        System.out.println("Bitwise OR: " + num1 + " | " + num2 + " = " + bitwiseOr);
        System.out.println("Bitwise XOR: " + num1 + " ^ " + num2 + " = " + bitwiseXor);
        System.out.println("Bitwise NOT of " + num1 + ": ~" + num1 + " = " + bitwiseNot1);
        
    }
    
     
}
