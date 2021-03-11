import java.util.Scanner;
/**
 * Demonstrates the relationship between arrays and strings
 *
 * @author L Wilkes
 * @version 11/03/21
 */
public class LetterCount
{
    /**
     * Makes a array with a lot of letters
     */
    public static void main(String[] args) {
        final int NUMCHARS = 26;    // declare constants
        
        // Initialising scanner object
        Scanner input = new Scanner(System.in);
        
        // Declaring the arrays
        int[] upper = new int[NUMCHARS];
        int[] lower = new int[NUMCHARS];
        
        char current; // Current character being processed
        int other = 0; // Counter for non-alphabetics
        
        // Get input from user
        System.out.println("Enter a sentence: ");
        String line = input.nextLine();
        
        // Count the number of each letter occurance
        for (int ch = 0; ch < line.length(); ch++) {
            current = line.charAt(ch);
            if (current >= 'A' && current <= 'Z') {
                upper[current-'A']++;
            }
            else if (current >= 'a' && current <= 'z') {
                lower[current-'a']++;
            }
            else {
                other++;
            }
        }
        // Print the results
        System.out.println();
        
        for (int letter = 0; letter < NUMCHARS; letter++) {
            System.out.print((char)(letter+'A'));
            System.out.print(": " + upper[letter]);
            System.out.print("\t\t" + (char) (letter + 'a'));
            System.out.println(": " + lower[letter]);
        }
    
        System.out.println("\nNon-alphabetic characters: " + other);
    }
}