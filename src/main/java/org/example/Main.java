package org.example;


import org.example.read.FileReader;
import org.example.read.SearchWord;

import java.io.FileNotFoundException;
import java.util.List;

import static org.example.enums.Constants.FILE_PATH;

public class Main {


    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        SearchWord searchWord = new SearchWord();
        List<String> firstAndLastLetters = fileReader.readFromFile(FILE_PATH);

        searchWord.confirmSearch(firstAndLastLetters, searchWord);
    }






}
