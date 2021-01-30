/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Exercises;

public class PhysicsProblem {
    public static void main(String[] args) {
        double g = Double.parseDouble(args[0]);
        double mass1 = Double.parseDouble(args[1]);
        double mass2 = Double.parseDouble(args[2]);
        double r = Double.parseDouble(args[3]);
        // Problem: double force = g * mass1 * mass2 / r * r;
        double force = (g * mass1 * mass2) / (r * r); // solution
        System.out.println(force);
    } // problem is order of ops, leading to
}    // unexpected results

