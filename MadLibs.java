import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for different words
        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();

        // Construct the story
        String story = "Once upon a time, there was a " + adjective + " " + noun + " that loved to " + verb + ".";

        // Display the story
        System.out.println(story);

        scanner.close();
    }
}