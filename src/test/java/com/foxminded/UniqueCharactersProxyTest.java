package com.foxminded;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueCharactersProxyTest {
    private UniqueCharactersInString implementation = new UniqueCharacters();
    private UniqueCharactersProxy proxy = new UniqueCharactersProxy(implementation);

    @Test
    void cachingTest(){
        String cacheStr = proxy.makeOnlyUniqueCharsTable("hello world!");
        assertEquals(true,cacheStr == proxy.makeOnlyUniqueCharsTable("hello world!"));
    }

    @Test
    void ifStringNull(){
        String expected = "this operation is not allowed for null string";
        assertEquals(expected,proxy.makeOnlyUniqueCharsTable(null));
    }
}