public class CaesarCipher {
    public static void main(String[] args) {
        Scanner170 console = new Scanner170(System.in);
        System.out.print("Your message?");
        // Prompting the user to enter the message
        String inputMessage = console.nextString(); 
        System.out.print("Encoding key?");
        // Prompting the user to enter the value by which the character will get shifted
        int shift = console.nextInt(); 
        /* Calling the method to shift the letters and form a new
        word with two parameters */
        String newMessage = caesarCipher(inputMessage, shift); 
        // Printing out the the new message
        System.out.print(newMessage); 
    }
    
    public static String caesarCipher(String inputMessage, int shift) {
        // Change the input message to a capitalized form
        String capitalizedMessage = inputMessage.toUpperCase(); 
        // Declaring and initializing the shifted message to be used later
        String shiftedMessage = "";
        // Mark A as the start of the alphabets
        char startAlphabet = 'A'; 
        // Mark Z as the end of the alphabets
        char endAlphabet = 'Z'; 
        // Array to store all the characters of the message
        char[] characters = new char[capitalizedMessage.length()]; 
        // For loop to make the characters get shifted
        for (int i = 0;i < capitalizedMessage.length();i++) {
            /* For loop to use the alphabets and match the
            characters in the message which are alphabets */
            for (char alphabets = startAlphabet;alphabets <= endAlphabet;alphabets++) { 
                // Condition to shift all alphabets in the message
                if (capitalizedMessage.charAt(i) >= startAlphabet && capitalizedMessage.charAt(i) <= endAlphabet) { 
                // Casting char to obtain the new character after shifting
                characters[i] = (char) (capitalizedMessage.charAt(i) + shift);
                    /* Condition for characters that are greater than the last alphabet
                    to start back at the first alphabet for shifting*/
                    if ((char) (capitalizedMessage.charAt(i) + shift) > endAlphabet) { 
                        /* The first condition is
                        for when the encryption key is positive */
                        // Casting char to obtain the right character that starts back from the first alphabet 
                        characters[i] = (char) (startAlphabet + (shift-1) - (endAlphabet - capitalizedMessage.charAt(i))); 
                    }
                    /* Condition for characters that gets lesser than
                        the first alphabet and gets shifted backwards as from the last alphabet */
                    else if ((char) (capitalizedMessage.charAt(i) + shift) < startAlphabet) { 
                        /* The second condition is
                         for when the encryption key is negative */
                        // Casting char to obtain the right character that gets shifted backwards as from the last alphabet //
                        characters[i] = (char) (endAlphabet + (shift+1) + (capitalizedMessage.charAt(i) - startAlphabet)); 
                        
                    }
                }
                else { 
                    // Characters that are not alphabets remain the same as they were
                    characters[i] = capitalizedMessage.charAt(i);
                }
            }
            /* The new message where the characters gets built
            with the shifted alphabets one by one */
            shiftedMessage = shiftedMessage + characters[i]; 
        }
        // The new message gets returned to the main method
        return shiftedMessage; 
    }
}
