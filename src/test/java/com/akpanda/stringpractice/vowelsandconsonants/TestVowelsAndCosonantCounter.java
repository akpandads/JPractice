package com.akpanda.stringpractice.vowelsandconsonants;

import com.akpanda.stringpractice.vowelsandconsonants.VowelsAndCosonantCounter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TestVowelsAndCosonantCounter {

    private VowelsAndCosonantCounter vowelsAndCosonantCounter = null;

    @Before
    public void setUp(){
        vowelsAndCosonantCounter = new VowelsAndCosonantCounter();
    }

    @Test
    public void testContainsOnlyDigit(){
        LocalDateTime startTime = LocalDateTime.now();
        System.out.println(vowelsAndCosonantCounter.countVowelsAndConsosnants("reglular"));
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("testContainsOnlyDigit Execution Time true:"+ ChronoUnit.NANOS.between(startTime, endTime)+" ns");

    }
    @Test
    public void testContainsOnlyDigitStreams(){
        LocalDateTime startTime = LocalDateTime.now();
        System.out.println(vowelsAndCosonantCounter.countVowelsAndConsosnantsStreams("reglular"));
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("testContainsOnlyDigitStreams Execution Time true:"+ ChronoUnit.NANOS.between(startTime, endTime)+" ns");

    }
}
