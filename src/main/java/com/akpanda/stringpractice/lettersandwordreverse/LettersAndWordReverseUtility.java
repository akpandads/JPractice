package com.akpanda.stringpractice.lettersandwordreverse;

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
}
