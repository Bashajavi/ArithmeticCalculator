import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for first number
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            // Prompt user for second number
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Prompt user for an operator
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result;

            // Perform the arithmetic operation based on the operator
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    // Handle division by zero
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator. Please enter one of +, -, *, /.");
            }

            // Display the result
            System.out.println("The result is: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid numbers and operator.");
        }

        scanner.close();
    }
}
