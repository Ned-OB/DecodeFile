package org.example.read;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

import static org.example.enums.Constants.FILE_PATH;

public class SearchWord {
    static List<String> expectedWords = new ArrayList<>();
    public List<String> populateExpectedWords(){
        expectedWords.add( "No updates".toLowerCase());
        expectedWords.add( "The terrorists are close".toLowerCase());
        expectedWords.add( "The terrorist's base has been occupied".toLowerCase());
        expectedWords.add( "The conflict is over".toLowerCase());
        expectedWords.add( "nkjn kjkn knkn ijnij kjnj vv nmnmm hjbhbu ijni".toLowerCase());
        return expectedWords;
    }

    public boolean search1(List<String> words, String wordsToSearch){
        String expectedWord = wordsToSearch;
        int wordCount = 1;
//        System.out.println(expectedWord.length());

        for (int i = 0; i < words.size(); i++) {
            String wordToSearch = words.get(i);

           StringBuilder firstLetter = new StringBuilder();
           firstLetter.append(wordToSearch.charAt(0));

            StringBuilder secondLetter = new StringBuilder();
           secondLetter.append(wordToSearch.charAt(1));

           if (wordCount == expectedWord.length()){
//               System.out.println(wordCount);
               return true;
           }

           if (expectedWord.contains(firstLetter)){
               expectedWord = expectedWord.replaceFirst(String.valueOf(firstLetter.charAt(0)), ".");
               wordCount++;
           }
            if (expectedWord.contains(secondLetter)){
                expectedWord = expectedWord.replaceFirst(String.valueOf(secondLetter.charAt(0)), ".");
                wordCount++;
            }

        }
        return false;
    }

    public String search(List<String> firstAndLastLetters, String wordsToSearch){
        String expectedWord = wordsToSearch;;
        String[] stringArray = expectedWord.split(" ");
        List<Boolean> isPresent = new ArrayList<>();

        for (int i = 0; i < stringArray.length; i++) {
            isPresent.add(search1(firstAndLastLetters, stringArray[i] ));
        }
//        if ()
//        System.out.println(Arrays.toString(stringArray));
        System.out.println(isPresent);
        return "null";
    }
    public void confirmSearch(List<String> firstAndLastLetters, SearchWord searchWord) {
        List <String> expectedWords = searchWord.populateExpectedWords();

        if( firstAndLastLetters != null){
            for (int i = 0; i < expectedWords.size(); i++) {

                System.out.println( searchWord.search(firstAndLastLetters, expectedWords.get(i))+"\n");
            }
        }
    }
}
