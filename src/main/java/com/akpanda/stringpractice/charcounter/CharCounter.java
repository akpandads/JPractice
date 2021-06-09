package com.akpanda.stringpractice.charcounter;

public class CharCounter {

    public long countCharOccurence(String inputText,Character searchChar){
        int counter=0;
        for(int i =0;i<inputText.length();i++){
            if(inputText.charAt(i)==searchChar){
                counter++;
            }
        }
        return counter;
    }

    public long countCharOccurenceStream(String inputText,Character searchChar){
        return inputText.chars().mapToObj(c-> (char) c).filter(c-> c==searchChar).count();
    }

}
