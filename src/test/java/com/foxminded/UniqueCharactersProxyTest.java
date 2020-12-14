package com.foxminded;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueCharactersProxyTest {
    private UniqueCharactersProxy proxy = new UniqueCharactersProxy();
    @Test
    void makeTableFromOnesymbol() {
        String expected = "\"h\" - 1\n";
        proxy.makeOnlyUniqueCharsTable("h");
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
        proxy.makeOnlyUniqueCharsTable("hello world!");
    }

}