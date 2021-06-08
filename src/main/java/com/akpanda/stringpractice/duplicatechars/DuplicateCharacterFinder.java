package com.akpanda.stringpractice.duplicatechars;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacterFinder {

    //generic method of counting charachters
    public Map<Integer, Integer> countCharOccurrence(String input){
        Map<Integer,Integer> charMap = new HashMap<>();
        input.chars().forEach(c-> {
            if(charMap.get(c)!=null)
                charMap.put(c,charMap.get(c)+1);
            charMap.putIfAbsent(c,1);
        });
        return charMap;
    }

    // not so efficent method of counting charachters
    public Map<Character,Integer> filterDuplicates(String input){
        Map<Integer,Integer> charMap = this.countCharOccurrence(input);
        Map<Integer,Integer> filteredMap = charMap.entrySet().stream().filter(
                entry -> entry.getValue()>1)
                .collect(Collectors.toMap(entry -> entry.getKey(),entry-> entry.getValue()));
        Map<Character,Integer> filteredCharMaps = filteredMap.entrySet().stream()
                .collect(Collectors.toMap(entry -> Character.valueOf((char) entry.getKey().intValue()), entry -> entry.getValue()));
        return filteredCharMaps;
    }

    public Map<Character,Long> filterDuplicatesUsingStream(String input){
        Map<Character,Long> charCounterMap = input.chars()
                .mapToObj(x-> (char) x)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));
        Map<Character, Long> filteredDuplicates = charCounterMap.entrySet().stream()
                .filter(entry -> entry.getValue()>1)
                .collect(Collectors.toMap(entry->entry.getKey(),entry-> entry.getValue()));
        return filteredDuplicates;
    }
}
