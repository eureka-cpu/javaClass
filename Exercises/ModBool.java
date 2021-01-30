/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Exercises;

public class ModBool {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]); // pos int only
        int b = Integer.parseInt(args[1]); // neg int not accounted for

        if ((a % b) == 0 || (b % a) == 0) {
            System.out.println(true);
        }
        else System.out.println(false);
    } // if either divides evenly into the other print true
} //     otherwise, false
