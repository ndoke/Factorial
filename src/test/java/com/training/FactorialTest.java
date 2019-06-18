package com.training;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;

public class FactorialTest {
    Factorial factorial = new Factorial();

    @Test
    public void legalCases() {
        Assert.assertEquals(factorial.factorialUsingRecursion(0), new BigInteger("1"));
        Assert.assertEquals(factorial.factorialUsingIteration(0), new BigInteger("1"));

        Assert.assertEquals(factorial.factorialUsingRecursion(1), new BigInteger("1"));
        Assert.assertEquals(factorial.factorialUsingIteration(1), new BigInteger("1"));

        Assert.assertEquals(factorial.factorialUsingRecursion(3), new BigInteger("6"));
        Assert.assertEquals(factorial.factorialUsingIteration(3), new BigInteger("6"));

        Assert.assertEquals(factorial.factorialUsingRecursion(35),
                new BigInteger("10333147966386144929666651337523200000000"));
        Assert.assertEquals(factorial.factorialUsingIteration(35),
                new BigInteger("10333147966386144929666651337523200000000"));
    }

    @Test (expectedExceptions = IllegalArgumentException.class)
    public void illegalCases() {
        factorial.factorialUsingRecursion(-6);
        factorial.factorialUsingIteration(-6);
    }
}
