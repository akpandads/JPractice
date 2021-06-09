package com.akpanda.stringpractice.onlydigits;

import com.akpanda.stringpractice.onlydigits.DigitChecker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TestOnlyDigits {
    private DigitChecker digitChecker = null;

    @Before
    public void setUp(){
        digitChecker = new DigitChecker();
    }

    @Test
    public void testContainsOnlyDigit(){
        LocalDateTime startTime = LocalDateTime.now();
        Assert.assertEquals(true, digitChecker.containsOnlyDigit("123456"));
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("testReverseWords Execution Time true:"+ ChronoUnit.NANOS.between(startTime, endTime)+" ns");

        startTime = LocalDateTime.now();
        Assert.assertEquals(false, digitChecker.containsOnlyDigit("123L56"));
        endTime = LocalDateTime.now();
        System.out.println("testReverseWords Execution Time false:"+ ChronoUnit.NANOS.between(startTime, endTime)+" ns");

    }
    @Test
    public void testContainsOnlyDigitStreams(){
        LocalDateTime startTime = LocalDateTime.now();
        Assert.assertEquals(true, digitChecker.containsOnlyDigitStream("123456"));
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("testContainsOnlyDigitStreams Execution Time true:"+ ChronoUnit.NANOS.between(startTime, endTime)+" ns");

        startTime = LocalDateTime.now();
        Assert.assertEquals(false, digitChecker.containsOnlyDigitStream("123L56"));
        endTime = LocalDateTime.now();
        System.out.println("testContainsOnlyDigitStreams Execution Time false:"+ ChronoUnit.NANOS.between(startTime, endTime)+" ns");

    }


}
