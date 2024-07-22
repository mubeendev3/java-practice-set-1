package mubeendevelopment;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class AssignmentNo1 {
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
    
    public  void questionNo3() {
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
        Scanner sc = new Scanner(System.in);
        byte newByteValue = sc.nextByte();
        initialValue = newByteValue;
        System.out.println("The Updated Value for byte is: " + initialValue);
    }
}
