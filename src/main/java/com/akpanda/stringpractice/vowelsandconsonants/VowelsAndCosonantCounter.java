package com.akpanda.stringpractice.vowelsandconsonants;

import java.util.*;

public class VowelsAndCosonantCounter {
    private static final List<Character> vowels= List.of('a', 'e', 'i', 'o', 'u');

    public Map countVowelsAndConsosnants(String input){
        Map<String,Integer> counter = new HashMap<>();
        counter.put("Consonant",0);
        counter.put("Vowel",0);
        input=input.toLowerCase();
        for(int i =0;i<input.length();i++){
            if(Character.isAlphabetic(input.charAt(i))){
                if(vowels.contains(input.charAt(i)))
                    counter.put("Vowel", counter.get("Vowel")+1);
                else
                    counter.put("Consonant", counter.get("Consonant")+1);
            }
        }
        return counter;
    }

    public Map countVowelsAndConsosnantsStreams(String input){
        Map<String,Long> counter = new HashMap<>();
        input = input.toLowerCase();
        long vowelCount = input.chars().mapToObj(c-> (char) c).filter(c -> vowels.contains(c)).count();
        long consonantCount = input.chars().mapToObj(c-> (char) c).filter(c -> (!vowels.contains(c)) && Character.isAlphabetic(c)).count();
        counter.put("Vowel",vowelCount);
        counter.put("Consonant",consonantCount);
        return counter;
    }

}
