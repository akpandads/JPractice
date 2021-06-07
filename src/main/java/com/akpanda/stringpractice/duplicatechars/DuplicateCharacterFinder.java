package com.akpanda.stringpractice.duplicatechars;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacterFinder {

    public Map<Integer, Integer> countCharOccurrence(String input){
        Map<Integer,Integer> charMap = new HashMap<>();
        input.chars().forEach(c-> {
            if(charMap.get(c)!=null)
                charMap.put(c,charMap.get(c)+1);
            charMap.putIfAbsent(c,1);
        });
        return charMap;
    }

    public Map<String,Integer> filterDuplicates(String input){
        Map<Integer,Integer> charMap = this.countCharOccurrence(input);
        Map<Integer,Integer> filteredMap = charMap.entrySet().stream().filter(
                entry -> entry.getValue()>1)
                .collect(Collectors.toMap(entry -> entry.getKey(),entry-> entry.getValue()));
        Map<String,Integer> filteredCharMaps = filteredMap.entrySet().stream()
                .collect(Collectors.toMap(entry -> String.valueOf(entry.getKey()),entry -> entry.getValue()));
        return filteredCharMaps;
    }
}
