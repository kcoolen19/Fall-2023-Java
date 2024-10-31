// Pseudocode for digitRange program
/* 
number is assigned an integer value
firstDigit = number % 10;
digit = firstDigit;
max = firstDigit;
min = firstDigit;
// range is calculated later
range = 0; 
// count is used to count the digits
count = 0; 
while (number != 0) {
if (digit >= max) {
max = digit;
} else if (min >= digit) {
min = digit;
}
number = number / 10;
digit = number % 10;
count++;
}
// Condition for single digit number
if (count == 1) { 
return 1;
} else {
range = max - min + 1;
}
return range;
*/

/** 
* Testing data for program
 */
public class DigitRange {
    public static void main(String[] args) {
        // Declaring and initializing the first number
        int number1 = -920384; 
        // Declaring and initializing the second number
        int number2 = 68437; 
        // Declaring and initializing the third number
        int number3 = 6; 
        // The first range is returned
        int range1 = digitRange(number1); 
        // The second range is returned
        int range2 = digitRange(number2); 
        // The third range is returned
        int range3 = digitRange(number3); 
        // Printing the first range and the range printed should be 10
        System.out.println("The range of " + number1 + " is " + range1); 
        // Printing the second range and the range printed should be 6
        System.out.println("The range of " + number2 + " is " + range2); 
        // Printing the third range and the range printed should be 1
        System.out.println("The range of " + number3 + " is " + range3); 
    }

    public static int digitRange(int number) {
        // Declaring and initializing the digit to be used afterwards
        int digit = 0; 
        // Declaring and initializing the maximum value to be used afterwards
        int max = 0; 
        // Declaring and initializing the minimum value to be used afterwards
        int min = 0; 
        // Declaring and initializing the range to be returned to the main method afterwards
        int range = 0; 
        // Evaluating the first digit from obtaining the remainder from dividing the number by 10.
        int firstDigit = number % 10; 
        // Using the first digit as reference for the variable digit in the for loop below
        digit = firstDigit; 
        // Using the first digit as reference for the minimum value in the for loop below
        min = firstDigit; 
        // Using the first digit as reference for the maximum value in the for loop below
        max = firstDigit; 
        // Variable used as a counter to count digits
        int countDigit = 0; 
        // While the value is non-zero
        while (number != 0) { 
            /* If the digit is greater or equal to the maximum value
            the digit becomes the maximum value
            */
            if (digit >= max) {
                max = digit;
            }
            /* If the digit is less or equal to the minimum value
            the digit becomes the minimum value
            */
            else if (min >= digit) {
                min = digit;
            }
            /* The number which is within the parameter is divided to obtain
            the number required to calculate the next digit
            */
            number /= 10;
            // The digit before the one used is obtained from the number calculated
            digit = number % 10; 
            // Used to count the number of digits
            countDigit++; 
        }
        // Condition for single digit number
        if (countDigit == 1) { 
            // The value 1 is returned
            return 1; 
        // Condition for numbers that are not single digit
        } else { 
            // The range is calculated by the following formula
            range = max - min + 1; 
        }
        // The range calculated is returned to the main method
        return range; 
    }
}
