package com.foxminded;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner phrase = new Scanner(System.in);
        UniqueCharactersInString implementation = new UniqueCharacters();
        UniqueCharactersInString uniqChars = new UniqueCharactersProxy(implementation);
        while (phrase.hasNextLine()) {
            System.out.print(uniqChars.makeOnlyUniqueCharsTable(phrase.nextLine()));
        }
    }
}
