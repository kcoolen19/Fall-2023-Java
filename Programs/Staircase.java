import java.util.Scanner;
public class Staircase {

    public static final String HEIGHT_PROMPT = "Enter the height of the staircase: ";
    public static final String HASH_SYMBOL = "#";
    public static final String UNDERSCORE_SYMBOL = "__";
    public static final int FORMAT_COEFFICIENT = 2;

    public static void main(String[] args) { // Main method
        Scanner console = new Scanner(System.in);
        System.out.print(HEIGHT_PROMPT);
        // Prompt the user to enter the height for the staircase
        int height = console.nextInt(); 
        drawStairCase(height);
    }

    // General Method to draw the staircase
    public static void drawStairCase(int height) { 
        // For loop to print the number of lines/height of the staircase
        for (int line = 1; line <= height; line++) { 
            // For loop to print the hash marks
            for (int hash = 1; hash <= (FORMAT_COEFFICIENT * line - FORMAT_COEFFICIENT); hash++) { 
                // Printing the hash marks
                System.out.print(HASH_SYMBOL); 
            }
            /* Printing the underscores after the hash marks
            Moving to a new line after printing the hash marks and underscores
             */
            System.out.println(UNDERSCORE_SYMBOL);
        }
    }
}
