package com.akpanda.stringpractice.lettersandwordreverse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TestLettersAndWordReverseUtility {
    private LettersAndWordReverseUtility lettersAndWordReverseUtility = null;

    @Before
    public void setUp(){
        lettersAndWordReverseUtility = new LettersAndWordReverseUtility();
    }

    @Test
    public void testReverseWords(){
        LocalDateTime startTime = LocalDateTime.now();
        Assert.assertEquals("regular", lettersAndWordReverseUtility.reverseWord("raluger"));
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("testReverseWords Execution Time :"+ ChronoUnit.NANOS.between(startTime, endTime)+" ns");

    }

    @Test
    public void testReverseSentenceAlongWithWords(){
        LocalDateTime startTime = LocalDateTime.now();
        Assert.assertEquals("i am here", lettersAndWordReverseUtility.reverseSentenceAlongWithWords("ereh ma i"));
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("testReverseSentenceAlongWithWords Execution Time :"+ ChronoUnit.NANOS.between(startTime, endTime)+" ns");

    }
}
