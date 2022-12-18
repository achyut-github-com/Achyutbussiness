import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a valid number: ");
        // nextInt() reads the next integer from the keyboard
        int number = reader.nextInt();
        // println() prints the following line to the output screen Updated upstream
        System.out.println("You entered: " + number);
        // This is a comment line for demonstrating git stash
        System.out.println("You have enteredthe number: " + number); Stashed changes
    }
}
