package com.training;

import java.math.BigInteger;

/**
 * {@link Factorial} has methods to calculate the factorialUsingIteration of an
 * integer and return the result in the form of a {@link BigInteger}. The
 * {@link Factorial#factorialUsingRecursion(int)} calculates the
 * factorialUsingIteration using recursion, while
 * {@link Factorial#factorialUsingIteration(int)} does that iteratively. The
 * usage of {@link BigInteger#multiply(BigInteger)} facilitates the calculation
 * of very large factorial results.
 *
 * @author  Nachiket Doke
 * @see     BigInteger
 * @since   1.0
 */

public class Factorial {
    /**
     * Returns the factorial of an integer as a {@link BigInteger}, by
     * calculating the result recursively.
     *
     * @param n element whose factorial is to calculated
     * @return factorial value of specified element
     * @throws IllegalArgumentException if the specified element value is negative
     */
    public BigInteger factorialUsingRecursion(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n == 0) {
            return new BigInteger("1");
        } else {
            return new BigInteger(String.valueOf(n)).multiply(factorialUsingRecursion(n - 1));
        }
    }

    /**
     * Returns the factorial of an integer as a {@link BigInteger}, by
     * calculating the result iteratively.
     *
     * @param n element whose factorial is to calculated
     * @return factorial value of specified element
     * @throws IllegalArgumentException if the specified element value is negative
     */
    public BigInteger factorialUsingIteration(int n) {
        BigInteger result = new BigInteger("1");
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n == 0) {
            return new BigInteger("1");
        } else {
            for (int i = 1; i <= n; i++) {
                result = result.multiply(new BigInteger(String.valueOf(i)));
            }
        }
        return result;
    }
}
