package com.foxminded;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueCharactersTest {
    private UniqueCharactersInString implementation = new UniqueCharacters();

    @Test
    void  makeTableFromSeveralWords() {
        String expected = "\"h\" - 1\n"
                +"\"e\" - 1\n"
                +"\"l\" - 3\n"
                +"\"o\" - 2\n"
                +"\" \" - 1\n"
                +"\"w\" - 1\n"
                +"\"r\" - 1\n"
                +"\"d\" - 1\n"
                +"\"!\" - 1\n";
        assertEquals(expected,implementation.makeOnlyUniqueCharsTable("hello world!"));
    }

    @Test
    void makeTableFromOneSymbol() {
        String expected = "\"h\" - 1\n";
        assertEquals(expected,implementation.makeOnlyUniqueCharsTable("h"));
    }

    @Test
    void ifStringEmpty(){
        String expected = "";
        assertEquals(expected,implementation.makeOnlyUniqueCharsTable(""));
    }

}