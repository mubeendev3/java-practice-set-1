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

        System.out.println(num1 + " += " + num2 + " = " + (num1 += num2));
        System.out.println(num1 + " -= " + num2 + " = " + (num1 -= num2));
        System.out.println(num1 + " *= " + num2 + " = " + (num1 *= num2));
        System.out.println(num1 + " /= " + num2 + " = " + (num1 /= num2));
        System.out.println(num1 + " %= " + num2 + " = " + (num1 %= num2));
    }

    public void questionNo8() {
        System.out.print("Enter the value for num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the value for num2: ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " < " + num2 + " = " + (num1 < num2));
        System.out.println(num1 + " > " + num2 + " = " + (num1 > num2));
        System.out.println(num1 + " <= " + num2 + " = " + (num1 <= num2));
        System.out.println(num1 + " >= " + num2 + " = " + (num1 >= num2));
        System.out.println(num1 + " == " + num2 + " = " + (num1 == num2));
        System.out.println(num1 + " != " + num2 + " = " + (num1 != num2));
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

    public void questionNo11() {
        System.out.print("Enter your obtained score: ");
        int score = sc.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Grade A");
        } else if (score >= 80 && score < 90) {
            System.out.println("Grade B");
        } else if (score >= 70 && score < 80) {
            System.out.println("Grade C");
        } else if (score >= 60 && score < 70) {
            System.out.println("Grade D");
        } else if (score < 60) {
            System.out.println("Grade F");
        } else {
            System.out.println("Please enter the correct score betwenn 1 - 100");
        }
    }

    public void questionNo12() {
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

    public void questionNo13() {
        System.out.print("Enter the value for num1: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the value for num2: ");
        double num2 = sc.nextDouble();
        System.out.print("Type a for addition: \nType s for subtraction: \nType m for multiplication: \nType d for division: \nType mo for modulous: ");
        String userChoice = sc.next();

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double modulos = num1 % num2;

        switch (userChoice) {
            case "a":
                System.out.println("Addition: " + addition);
                break;
            case "s":
                System.out.println("Subtraction: " + subtraction);
                break;
            case "m":
                System.out.println("Multiplication: " + multiplication);
                break;
            case "d":
                System.out.println("Division: " + division);
                break;
            case "mo":
                System.out.println("Modulous: " + modulos);
                break;
            default:
                System.out.println("Invalid Input! " + userChoice + " is not a valid option");
                break;
        }
    }

    public void questionNo14() {
        System.out.print("Enter the number between (1-7): ");
        int userInput = sc.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Input! " + userInput + " is not within the range");
                break;
        }
    }

    public void questionNo15() {
        System.out.print("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greater");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is greater");
        } else {
            System.out.println(num3 + " is greater");
        }
    }

    public void questionNo16() {
        System.out.print("Enter any positive number to find factorial: ");
        int number = sc.nextInt();

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + number + " = " + factorial);
    }

    public void questionNo17() {
        System.out.print("Enter number to generate table: ");
        int number = sc.nextInt();
        int i = 1;

        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + number * i);
            i++;
        }
    }

    public void questionNo18() {
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;

        do {
            sum += number % 10;
            number /= 10;
        } while (number > 0);

        System.out.println("Sum of the digits: " + sum);

    }
    
    public void questionNo19() {
        System.out.print("Enter any number: ");
        int num = sc.nextInt(); 
        int firstTerm = 0, secondTerm = 1;

        System.out.print("First " + num + " terms: ");

        for (int i = 1; i <= num; i++) {
            System.out.print(firstTerm + " ");
            
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
    
    public void questionNo20() {
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    } 
}
