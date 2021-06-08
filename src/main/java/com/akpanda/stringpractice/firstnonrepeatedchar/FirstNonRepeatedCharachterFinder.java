package com.akpanda.stringpractice.firstnonrepeatedchar;

import com.akpanda.stringpractice.duplicatechars.DuplicateCharacterFinder;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FirstNonRepeatedCharachterFinder {

    public Map<Integer, Integer> countCharOccurrence(String input){
        Map<Integer,Integer> charMap = new LinkedHashMap<>();
        input.chars().forEach(c-> {
            if(charMap.get(c)!=null)
                charMap.put(c,charMap.get(c)+1);
            charMap.putIfAbsent(c,1);
        });
        return charMap;
    }

    public char getFirstNonRepeatedChar(String input){
        char charResult = 0;
        Map<Integer,Integer> charCounter = new LinkedHashMap<>();
        charCounter = this.countCharOccurrence(input);
        Optional<Map.Entry<Integer, Integer>> result= charCounter.entrySet().stream().filter(entry ->entry.getValue()==1).findFirst();
        if(result.isPresent()){
            charResult =  (char) result.get().getKey().intValue();
        }
        return charResult;
    }

    public char getFirstNonRepeatedCharAlternate(String input){
        int [] positionArray = new int[256];
        char result =0;
        for(int i=0;i<positionArray.length;i++){
            positionArray[i]=0;
        }
        for(int i =0;i<input.length();i++){
            int intValue = input.charAt(i);
            positionArray[intValue]+=1;
        }
        for(int i =0;i<input.length();i++){
            int intValue = input.charAt(i);
            if(positionArray[intValue]==1){
                result = (char) intValue;
            }
        }
        return result;
    }
}
