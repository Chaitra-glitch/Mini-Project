import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Subtract the numbers
        double difference = num1 - num2;

        // Display the result
        System.out.println("The difference between " + num1 + " and " + num2 + " is: " + difference);
        
        // Close 
