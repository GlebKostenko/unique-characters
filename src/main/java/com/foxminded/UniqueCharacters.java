package com.foxminded;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.lang.String;
import java.util.TreeMap;

public class UniqueCharacters implements UniqueCharactersInString {

    @Override
    public String makeOnlyUniqueCharsTable(String phrase){
        StringBuilder result = new StringBuilder();
        Map<Character,Integer> amountOfUniqueChars = new LinkedHashMap<>();
        for(int i = 0;i < phrase.length();++i){
            int count = amountOfUniqueChars.containsKey(phrase.charAt(i)) ? amountOfUniqueChars.get(phrase.charAt(i)) : 0;
            amountOfUniqueChars.put(phrase.charAt(i), count + 1);
        }
        for(Entry entry: amountOfUniqueChars.entrySet()) {
            result.append(String.format("\"%c\" - %d\n",entry.getKey(),entry.getValue()));
        }
        return result.toString();
    }

}
