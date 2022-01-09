/*
 * Problem1.java
 */
package problem1_to_10;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * @author Ameziel
 */
public class Problem1 {

    public static final int LIMIT = 1000;

    public static void main(String[] args) {
        int solution = 0;
        for(int i = 0; i < LIMIT; i++) {
            if (i% 3 == 0 || i % 5 == 0) {
                solution += i;
            }
        }
        System.out.println(solution);
    }
}
