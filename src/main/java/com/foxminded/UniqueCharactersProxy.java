package com.foxminded;

import java.util.HashMap;

public class UniqueCharactersProxy implements UniqueCharactersInString {
    private UniqueCharactersInString uChars = new UniqueCharacters();
    private HashMap<String,String> cacheOfStrings = new HashMap<>();
    @Override
    public String makeOnlyUniqueCharsTable(String phrase){
        if(cacheOfStrings.containsKey(phrase)) return cacheOfStrings.get(phrase);
        cacheOfStrings.put(phrase,uChars.makeOnlyUniqueCharsTable(phrase));
        return cacheOfStrings.get(phrase);
    }
}
