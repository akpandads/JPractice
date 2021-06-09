package com.akpanda.stringpractice.charcounter;

import com.akpanda.stringpractice.charcounter.CharCounter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TestCharCounter {
    private CharCounter charCounter = null;

    @Before
    public void setUp(){
        charCounter = new CharCounter();
    }

    @Test
    public void testContainsOnlyDigit(){
        LocalDateTime startTime = LocalDateTime.now();
        Assert.assertEquals(1, charCounter.countCharOccurence("abc123",'a'));
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("testContainsOnlyDigit Execution Time true:"+ ChronoUnit.NANOS.between(startTime, endTime)+" ns");

        startTime = LocalDateTime.now();
        Assert.assertEquals(2, charCounter.countCharOccurence("123L561",'1'));
        endTime = LocalDateTime.now();
        System.out.println("testContainsOnlyDigit Execution Time false:"+ ChronoUnit.NANOS.between(startTime, endTime)+" ns");

    }
    @Test
    public void testContainsOnlyDigitStreams(){
        LocalDateTime startTime = LocalDateTime.now();
        Assert.assertEquals(1, charCounter.countCharOccurence("abc123",'a'));
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("testContainsOnlyDigitStreams Execution Time:"+ ChronoUnit.NANOS.between(startTime, endTime)+" ns");

        startTime = LocalDateTime.now();
        Assert.assertEquals(2, charCounter.countCharOccurence("123L561",'1'));
        endTime = LocalDateTime.now();
        System.out.println("testContainsOnlyDigitStreams Execution Time:"+ ChronoUnit.NANOS.between(startTime, endTime)+" ns");

    }
}
