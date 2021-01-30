/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Exercises;

import java.util.Random;

public class IntToBool {
    public static void main(String[] args) {
        // create random object
        Random ran = new Random();

        // generating integer
        int a = ran.nextInt();
        int b = ran.nextInt();
        System.out.println((!(a < b) && !(a > b)) == (a == b));
        System.out.println(a);
        System.out.println(b);
    } // Simplify first half of expression: if correct will print true
} // Added random numbers to verify expression
