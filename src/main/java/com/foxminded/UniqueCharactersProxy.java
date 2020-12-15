package com.foxminded;

import java.util.HashMap;

public class UniqueCharactersProxy implements UniqueCharactersInString {
    private UniqueCharactersInString implementation;
    private HashMap<String,String> cacheOfStrings = new HashMap<>();
    public UniqueCharactersProxy(UniqueCharactersInString implementation) {
        this.implementation = implementation;
    }
    @Override
    public String makeOnlyUniqueCharsTable (String phrase){
        if (phrase == null) {
            return "this operation is not allowed for null string";
        }
        if (cacheOfStrings.containsKey(phrase))
            return cacheOfStrings.get(phrase);
            cacheOfStrings.put(phrase, implementation.makeOnlyUniqueCharsTable(phrase));
            return cacheOfStrings.get(phrase);
    }
}
