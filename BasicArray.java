
/**
 * Demonstrated basic array declaration and use
 *
 * @author L Wilkes
 * @version 22/03/2021
 */
public class BasicArray
{
    /**
     * Creates an array, fills it with various int values,
     * modifies one value, then prints them out
     */
    public static void main(String[] args) {
        // declaring constants
        final int LIMIT = 15, MULTIPLE = 10;
        
        // declaring the array
        int[] list = new int[LIMIT];
        
        // initialise the array values
        for (int index = 0; index < LIMIT; index++) {
            list[index] = index * MULTIPLE;
        }
        
        list[5] = 999; // change one array value
        
        // print the array values out
        for (int value : list) {
            System.out.print(value + "    ");
        }
    }
}
