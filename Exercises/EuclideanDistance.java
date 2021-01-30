/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Exercises;

public class EuclideanDistance {
    public static void main(String[] args) {
        double x = Float.parseFloat(args[0]);
        double y = Float.parseFloat(args[1]);
        double distance = Math.sqrt(
                Math.pow((x - 0), 2)
                        + Math.pow((y - 0), 2)
        );
        System.out.println(distance);
    } // Euclidean distance from point (x, y)
}    // to the origin (0, 0)
