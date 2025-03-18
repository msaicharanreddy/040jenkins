public class arithmeticoperations {
    public static void main(String[] args) {
        // Hardcoded numbers for operations
        double num1 = 10;
        double num2 = 5;

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
    }
}

