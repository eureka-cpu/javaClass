/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Exercises;

public class TriangleTest {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]); // positive int only
        int b = Integer.parseInt(args[1]); // neg int not accounted for
        int c = Integer.parseInt(args[2]);

        if (a + b <= c || b + c <= a || c + a <= b) {
            System.out.println(false);
        }
        else System.out.println(true);
    } // test whether 3 numbers could be the lengths
}    // of the sides of some triangle
