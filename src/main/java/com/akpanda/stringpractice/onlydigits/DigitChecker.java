package com.akpanda.stringpractice.onlydigits;

import java.util.Optional;

public class DigitChecker {

    public boolean containsOnlyDigit(String input){
        boolean result=true;
        for(int i =0;i<input.length();i++){
            if(!Character.isDigit(input.charAt(i))){
                result = false;
                break;
            }
        }
        return result;
    }
    public boolean containsOnlyDigitStream(String input){
        boolean result = true;
        Optional<Character> firstCharacter = input.chars().mapToObj(c->(char) c).filter(c-> !Character.isDigit(c)).findFirst();
        if(firstCharacter.isPresent())
            result = false;
        return result;
    }
}
