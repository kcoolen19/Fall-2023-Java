import java.util.Scanner;

public class Calendar {
    public static final String HEADER_BORDER = "+------+------+------+------+------+------+------+";
    public static final String MONTH_HEADER = "  Sun    Mon    Tue    Wed    Thu    Fri    Sat";
    public static final String BORDER = "|";
    public static final String FORMAT_BORDER = "%5s |";
    public static final String DATE_PROMPT = "Enter the date of the first Sunday: ";
    public static final String NUMBER_OF_DAYS_PROMPT = "Enter the number of days in the month: ";
    public static final int NUMBER_OF_DAYS = 7;
    public static final int DEFAULT_DATE = 6;
    public static final int DEFAULT_NUMBER_OF_DAYS = 31;
    public static void main(String[] args) {
        // Calls the method with the first sunday being the 6th and the month having 31 days
        calendarBody(DEFAULT_DATE,DEFAULT_NUMBER_OF_DAYS);
        // Space between calendar printed and user prompt
        System.out.println();
        // Declare Scanner for input values
        Scanner prompt = new Scanner(System.in);
        System.out.print(DATE_PROMPT);
        // Prompts user to enter the date of the first sunday
        int sundayFirst = prompt.nextInt();
        System.out.print(NUMBER_OF_DAYS_PROMPT);
        // Prompts user to enter the number of days in the month
        int monthDays = prompt.nextInt();
        // Calls the method if the number of days is lesser than 31 
        if (monthDays > DEFAULT_NUMBER_OF_DAYS) {
            System.out.print(NUMBER_OF_DAYS_PROMPT);
            monthDays = prompt.nextInt();
        } 
        calendarBody(sundayFirst,monthDays);
    }

    public static void calendarBody(int firstSunday, int daysInMonth) {
        // Header for the days in the week
        System.out.println(MONTH_HEADER);
        // Separator
        System.out.println(HEADER_BORDER);
        // Initiating variable that will count the number of days
        int daysCounter = 0;
        // Starting border for calendar
        System.out.print(BORDER);
        // Calculate the number of leading spaces
        int leadingSpaces = (NUMBER_OF_DAYS - firstSunday) + 1;
        // While loop containing a for loop to print leading spaces when the date of the first Sunday is not the 1st
        while (leadingSpaces != 0 && firstSunday != 1)  {
            for (int i = (firstSunday-NUMBER_OF_DAYS);i < 1;i++) {
                // Formatting for printing leading spaces with border
                System.out.printf(FORMAT_BORDER, " ");
                // Increment the variable daysCounter when the number of days increases
                daysCounter++;
                // Decrement the leading spaces until it reaches zero
                leadingSpaces--;
            }
        }
        // For loop to print the dates
        for (int date = 1; date <= daysInMonth; date++) {
            // Formatting for printing the date
            System.out.printf(FORMAT_BORDER, date);
            // Increment the variable daysCounter when the number of days increases
            daysCounter++;
            // While loop to change line when each week is printed
            while (daysCounter % NUMBER_OF_DAYS == 0 && date < daysInMonth) {
                // Change line
                System.out.println();
                // Print border
                System.out.print(BORDER);
                break;
            }
        }
        // While loop to print remaining borders after printing all the dates
        while (daysCounter % NUMBER_OF_DAYS != 0) {
            // Formatting for remaining spaces
            System.out.printf(FORMAT_BORDER, " ");
            // Increment the variable daysCounter when the number of days increases
            daysCounter++;
        }
        // Change line
        System.out.println();
        // Final separator
        System.out.println(HEADER_BORDER);
    }
}
