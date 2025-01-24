import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number; ");
        double num2 = scanner.nextDouble();


        System.out.print("Addition: " + (num1 + num2));
        System.out.print("Subtraction: " + (num1 - num2));
        System.out.print("Division: " + (num1 / num2));
        System.out.print("Multiplication: " + (num1 * num2));

        scanner.close();
    }
}