package com.training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {
    private Factorial factorial = new Factorial();

    @Test
    public void legalCases() {
        Assert.assertEquals(factorial.factorialUsingRecursion(0), 1);
        Assert.assertEquals(factorial.factorialUsingIteration(0), 1);

        Assert.assertEquals(factorial.factorialUsingRecursion(1), 1);
        Assert.assertEquals(factorial.factorialUsingIteration(1), 1);

        Assert.assertEquals(factorial.factorialUsingRecursion(3), 6);
        Assert.assertEquals(factorial.factorialUsingIteration(3), 6);

        Assert.assertEquals(factorial.factorialUsingRecursion(12), 479001600);
        Assert.assertEquals(factorial.factorialUsingRecursion(12), 479001600);
    }

    @Test (expectedExceptions = IllegalArgumentException.class)
    public void illegalCase1() {
        factorial.factorialUsingRecursion(-6);
    }

    @Test (expectedExceptions = IllegalArgumentException.class)
    public void illegalCase2() {
        factorial.factorialUsingIteration(-6);
    }

    @Test (expectedExceptions = IllegalArgumentException.class)
    public void illegalCase3() {
        factorial.factorialUsingRecursion(13);
    }

    @Test (expectedExceptions = IllegalArgumentException.class)
    public void illegalCase4() {
        factorial.factorialUsingIteration(13);
    }
}
