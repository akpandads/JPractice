package com.akpanda.stringpractice.fistnonrepeatedchar;

import com.akpanda.stringpractice.duplicatechars.DuplicateCharacterFinder;
import com.akpanda.stringpractice.firstnonrepeatedchar.FirstNonRepeatedCharachterFinder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TestFirstNonRepeatedCharachterFinder {

    FirstNonRepeatedCharachterFinder firstNonRepeatedCharachterFinder = null;
    @Before
    public void setup(){
        firstNonRepeatedCharachterFinder = new FirstNonRepeatedCharachterFinder();
    }

    @Test
    public void getFirstNonRepeatedChar(){
        LocalDateTime startTime = LocalDateTime.now();
        char result = firstNonRepeatedCharachterFinder.getFirstNonRepeatedChar("regular");
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("getFirstNonRepeatedChar Execution Time :"+ ChronoUnit.NANOS.between(startTime, endTime)+" ns");
        System.out.println(result);

        Assert.assertEquals('e',result);
        result = firstNonRepeatedCharachterFinder.getFirstNonRepeatedChar("cherry");
        Assert.assertEquals('c',result);
        System.out.println(result);
    }

    @Test
    public void getFirstNonRepeatedCharAlternate(){
        LocalDateTime startTime = LocalDateTime.now();
        char result = firstNonRepeatedCharachterFinder.getFirstNonRepeatedChar("regular");
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("getFirstNonRepeatedChar Execution Time :"+ ChronoUnit.NANOS.between(startTime, endTime)+" ns");
        System.out.println(result);

        Assert.assertEquals('e',result);
        result = firstNonRepeatedCharachterFinder.getFirstNonRepeatedChar("cherry");
        Assert.assertEquals('c',result);
        System.out.println(result);
    }
}
