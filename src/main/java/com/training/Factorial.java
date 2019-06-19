package com.training;

/**
 * {@link Factorial} has methods to calculate the factorial of an
 * integer and return the result in the form of a integer. The
 * {@link Factorial#factorialUsingRecursion(int)} calculates the
 * factorial using recursion, while
 * {@link Factorial#factorialUsingIteration(int)} does that iteratively.
 *
 * @author  Nachiket Doke
 * @since   1.0
 */

public class Factorial {
    /**
     * Returns the factorial of an integer as an integer, by
     * calculating the result recursively.
     *
     * @param n element whose factorial is to calculated
     * @return factorial value of specified element
     * @throws IllegalArgumentException if the specified element value
     * is negative or beyond the integer limits
     */
    public int factorialUsingRecursion(int n) {
        if (!isLegalArgument(n)) {
            throw new IllegalArgumentException();
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorialUsingRecursion(n - 1);
        }
    }

    /**
     * Returns the factorial of an integer as an integer, by
     * calculating the result iteratively.
     *
     * @param n element whose factorial is to calculated
     * @return factorial value of specified element
     * @throws IllegalArgumentException if the specified element value
     * is negative or beyond the integer limits
     */
    public int factorialUsingIteration(int n) {
        int result = 1;
        if (!isLegalArgument(n)) {
            throw new IllegalArgumentException();
        } else if (n == 0) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
        }
        return result;
    }

    private boolean isLegalArgument(int n) {
        return n >= 0 && n <= 12;
    }
}
