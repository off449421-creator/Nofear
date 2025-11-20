import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take two numbers as input
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Display the entered numbers
        System.out.println("\n--- Displaying Entered Values ---");
        System.out.println("First Number: " + number1);
        System.out.println("Second Number: " + number2);

        // Close the scanner
        input.close();
    }
}

