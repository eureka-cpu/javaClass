/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Exercises;

public class ApproxTheta {
    public static void main(String[] args) {
        int theta = Integer.parseInt(args[0]); // input an angle
        ///       for reference, theta represents an angle value
        System.out.println(Math.pow(
                Math.cos(theta), 2)
                                   + Math.pow(Math.sin(theta), 2)
        ); // output should be close to 1 but never exact due to
    } //      approx value
}
