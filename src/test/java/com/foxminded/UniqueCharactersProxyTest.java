package com.foxminded;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueCharactersProxyTest {
    private UniqueCharactersInString implementation = new UniqueCharacters();
    private UniqueCharactersProxy proxy = new UniqueCharactersProxy(implementation);
    @Test
    void makeTableFromOneSymbol() {
        String expected = "\"h\" - 1\n";
        proxy.makeOnlyUniqueCharsTable("h");
        assertEquals(expected,proxy.makeOnlyUniqueCharsTable("h"));
    }
    @Test
    void makeTableFromSeveralWords() {
        String expected = "\"h\" - 1\n"
                         +"\"e\" - 1\n"
                         +"\"l\" - 3\n"
                         +"\"o\" - 2\n"
                         +"\" \" - 1\n"
                         +"\"w\" - 1\n"
                         +"\"r\" - 1\n"
                         +"\"d\" - 1\n"
                         +"\"!\" - 1\n";
        String test = proxy.makeOnlyUniqueCharsTable("hello world!");
        assertEquals(expected,test);
        boolean b = test == proxy.makeOnlyUniqueCharsTable("hello world!");
        assertEquals(true,b);
    }

    @Test
    void ifStringEmpty(){
        String expected = "";
        assertEquals(expected,proxy.makeOnlyUniqueCharsTable(""));
    }
    @Test
    void ifStringNull(){
        String expected = "this operation is not allowed for null string";
        assertEquals(expected,proxy.makeOnlyUniqueCharsTable(null));
    }
}