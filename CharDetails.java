import java.util.Scanner;

public class CharDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character; ");
        char character = scanner.next().charAt(0);

        System.out.print("Unicode value: " +(int) character);
        if (Character.isLetter(character)) {
            System.out.println("It is a letter.");
        } else if (Character.isDigit(character)) {
            System.out.println("It is a digit.");
        } else {
            System.out.println("It is neither a letter nor a digit.");
        }

        scanner.close();
    }
}