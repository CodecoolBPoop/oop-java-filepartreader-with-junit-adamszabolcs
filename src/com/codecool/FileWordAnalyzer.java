package com.codecool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileWordAnalyzer {

    public FilePartReader filePartReader;

    public FileWordAnalyzer(FilePartReader filePartReader) {

    }

    public ArrayList wordsByABC() {
        String lines = filePartReader.readLines();
        ArrayList<String> words = new ArrayList<>(Arrays.asList(lines.split(" ")));
        Collections.sort(words);
        return words;
    }

    public ArrayList wordsContainingSubString(String subString) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(filePartReader.readLines().split(" ")));
        ArrayList<String> contains = new ArrayList<>();
        for (String word : words) {
            if (word.contains(subString)) {
                contains.add(word);
            }
        }
        return contains;
    }

    public ArrayList wordsArePalindrome() {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(filePartReader.readLines().split(" ")));
        ArrayList<String> palindrome = new ArrayList<>();
        for (String word : words) {
            if (word.equals(new StringBuilder(word).reverse().toString())) {
                palindrome.add(word);
            }
        }
        return palindrome;
    }

}
