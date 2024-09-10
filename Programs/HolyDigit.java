// pseudocode for program
/*
main method:
declare statement
number = 1000 // Number starts at 1000 since it is a 4-digit code
while (number <= 9999) {
call statement = address(number);
if (statement equals return statement) {
print "The right address is (number) Pennsylvania Avenue".
}
number++ // number increases by 1
}
address(number) method:
statement = ""; // Statement that will be used as return
address = number; // number which is a parameter is assigned to the variable "address"
digitOne = number % 10; //digitOne is the first digit
if (digitOne % 2 = 0) {
number /= 10;
}
digitTenth = number % 10; // digitTenth is the second digit
if (digitTenth != digitOne) { // If digitTenth is not equal to digitOne
number = 10;
}
digitHundredth = number % 10; // digitHundredth is the third digit
if (digitHundredth != digitTenth and != digitOne) {
number /= 10;
}
if (digitThousandth != digitHundredth and != digitTenth and != digitOne and digitThousandth == (2 * digitTenth)) {
sum = digitThousandth + digitHundredth + digitTenth + digitOne;
}
if (sum == 25) { // Condition for the sum of the 4 digits to be equal to 25
statement = "success";
}
return statement;
*/
public class HolyDigit {
    public static void main(String[] args) {
        // Declaring the response that will eventually print out the address
        String response; 
        // 1000 is the first number since it is the smallest 4-digit number
        int i = 1000; 
        // Condition for number to be less than and equal to 9999 which is the greatest 4-digit number
        while (i <= 9999) {
            // The return statement from the address method is in here
            response = address(i); 
            // If response is equal to the return statement which is a string
            if (response.equals("success")) { 
                // The message with the right address will be printed
                System.out.println("The right address is " + i + " Pennsylvania Avenue.");
            }
            // The number increases by 1
            i++;
            // End of loop when the address is decoded 
        } 
    }
    // Method to return a String when the right address is decoded
    public static String address(int address) { 
        // Declaring and initializing the process variable
        String process = ""; 
        // Declaring and initializing sum to 0
        int sum = 0; 
         // Using the parameter and assigning it to the variable "number" to find the digits
        int number = address;
        // digitOne is the first digit starting from the back
        int digitOne = number % 10;
        // Condition for if digitOne is an even number 
        if (digitOne % 2 == 0) { 
            // number is divided by 10
            number /= 10; 
        }
        // digitTenth is the second digit starting from the back
        int digitTenth = number % 10; 
        // Condition for both digitOne and digitTenth should not be the same
        if (digitTenth != digitOne) { 
            // number is divided by 10
            number /= 10; 
        }
        // digitHundredth is the third digit starting from the back
        int digitHundredth = number % 10;
        //Condition for both digitOne, digitTenth and digitHundredth should not be the same 
        if (digitHundredth != digitTenth && digitHundredth != digitOne) {
            // number is divided by 10
            number /= 10; 
        }
        // digitThousandth is the last digit starting from the back
        int digitThousandth = number % 10; 
        // Condition for both digitOne, digitTenth, digitHundredth and digitThousandth should not be the same
        if (digitThousandth != digitHundredth && digitThousandth != digitTenth && digitThousandth != digitOne && digitThousandth == (2 * digitTenth)) {
            // sum is calculating by adding all 4 digits
            sum = digitThousandth + digitHundredth + digitTenth + digitOne; 
        }
        // Condition for the sum of the 4 digits to be equal to 25
        if (sum == 25) { 
            // if true, the process is deemed successful
            process = "success"; 
        }
        // The successful process is returned
        return process; 
    }
