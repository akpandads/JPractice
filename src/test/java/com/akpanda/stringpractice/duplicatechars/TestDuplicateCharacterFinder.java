package com.akpanda.stringpractice.duplicatechars;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TestDuplicateCharacterFinder {

    DuplicateCharacterFinder duplicateCharacterFinder = null;
    @Before
    public void setup(){
        duplicateCharacterFinder = new DuplicateCharacterFinder();
    }

    @Test
    public void testFilterDuplicates(){
        System.out.println("Non Stream way");
        LocalDateTime startTime = LocalDateTime.now();
        System.out.println(duplicateCharacterFinder.filterDuplicates("there"));
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Execution Time :"+ ChronoUnit.NANOS.between(startTime, endTime)+" ns");
    }
    @Test
    public void testFilterDuplicatesUsingStream(){
        System.out.println("Stream way");
        LocalDateTime startTime = LocalDateTime.now();
        System.out.println(duplicateCharacterFinder.filterDuplicatesUsingStream("there"));
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Execution Time :"+ ChronoUnit.NANOS.between(startTime, endTime)+" ns");
    }
}
