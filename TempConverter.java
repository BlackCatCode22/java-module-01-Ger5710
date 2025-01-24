import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Temperature in Fahrenheit: ");
        double fahrenheit= scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("Temperature in Celsius; %.2f/n", celsius);

        scanner.close();
    }

}