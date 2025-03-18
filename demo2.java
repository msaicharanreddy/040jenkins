import java.util.Scanner;

public class arithmeticoperations {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Performing arithmetic operations
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = 0;
        
        if (num2 != 0) {
            division = num1 / num2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }

        // Displaying the results
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        if (num2 != 0) {
            System.out.println("Division: " + division);
        }

        // Closing the scanner
        scanner.close();
    }
}

