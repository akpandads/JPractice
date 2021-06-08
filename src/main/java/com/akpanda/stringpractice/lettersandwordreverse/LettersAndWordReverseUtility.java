package com.akpanda.stringpractice.lettersandwordreverse;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LettersAndWordReverseUtility {
    public String reverseWord(String input){
        char[] reversedArray = new char[input.length()];
        int j=0;
        for(int i= input.length()-1; i>=0; i--){
            reversedArray[j++]= input.charAt(i);
        }
        return new String(reversedArray);
    }

    public String reverseSentenceAlongWithWords(String input){
        String[] inputWords = input.split(" ");
        String [] reversedStringArray = new String[inputWords.length];
        int j = inputWords.length-1;
        for ( int i =0; i <inputWords.length;i++){
            reversedStringArray[j--] = this.reverseWord(inputWords[i]);
        }
        return String.join(" ",reversedStringArray);
    }

    public String reverseSentenceAlongWithWordsUsingStream(String input){
        return Stream.of(input).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
    }
}
