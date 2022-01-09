/*
 * Problem3.java
 */
package problem1_to_10;

import java.math.BigInteger;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 * @author Ameziel
 */
public class Problem3 {

    public static void main(String[] args) {
        long number = 600_851_475_143L;
        long primeDivisor = number / 2;
        System.out.println(primeDivisor);
        while() {

        }

    }

    public static long primeDivisor(long arg_number) {
        while() {

        }
    }

    public static boolean isPrime(int arg_number) {
        int end = ((int)(arg_number));
        if (arg_number == 0
                || arg_number == 1) {
            return false;
        }
        if (arg_number % 2 == 0) {
            return false;
        }
        for(int i = 3; i < end; i = i + 2) {
            if (arg_number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
