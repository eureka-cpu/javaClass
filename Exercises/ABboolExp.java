/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Exercises;

public class ABboolExp {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println(!(a && b) && (a || b)
                                   || ((a && b) || !(a || b)));
    }
} // "show the bool expression evaluates to 'true'"
