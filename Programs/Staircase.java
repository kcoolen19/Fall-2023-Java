import java.util.Scanner;
public class Staircase {

    public static void main(String[] args) { // Main method
        Scanner Console = new Scanner(System.in);
        System.out.print("Enter the height of the staircase: ");
        // Prompt the user to enter the height for the staircase
        int height = Console.nextInt(); 
        drawStairCase(height);
    }

    // General Method to draw the staircase
    public static void drawStairCase(int height) { 
        // For loop to print the number of lines/height of the staircase
        for (int line = 1; line <= height; line++) { 
            // For loop to print the hash marks
            for (int hash = 1; hash <= (2 * line - 2); hash++) { 
                // Printing the hash marks
                System.out.print("#"); 
            }
            /* Printing the underscores after the hash marks
            Moving to a new line after printing the hash marks and underscores
             */
            System.out.println("__");
        }
    }
}
