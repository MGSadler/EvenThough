/*Use a while loop to check the integers 1 through 20 and prints only those integers that are even.
 *Use division to determine an even integer (i.e., when divided by 2 the result yields no remainder).

 * All output should appear on a single line, but separate each even integer with a comma and a space. 
Be sure the integer 20 (which is the last expected number you'll output) omits the trailing comma and space.
 */
package eventhough;

public class EvenThough {

    public static void main(String[] args) {
        int n = 1;
        
        while (n <= 20){
            if (n%2 == 0){
                System.out.print(n);
                if (n != 20){
                    System.out.print(", ");
                }
            }
            n++;
        }
    }
}