package org.example.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static org.example.enums.Constants.FILE_PATH;

public class FileReader {

    public List<String> readFromFile(String filePath) {

        List<String> firstAndLastLetters = null;
        try {
            firstAndLastLetters = readFirstAndLast(filePath);

        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        }
        return firstAndLastLetters;
    }

public  String read() throws FileNotFoundException {
    File file = new File(FILE_PATH);
    Scanner scanner = new  Scanner(file);

    StringBuilder readFile = new StringBuilder();
    while (scanner.hasNext()) readFile.append(scanner.next());

    return readFile.toString();
}
    public List<String> readFirstAndLast(String filePath) throws FileNotFoundException {

        List<String> textList = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(filePath))) {

            while (scanner.hasNext()) {
            String text = scanner.next().trim();
                if (!text.isEmpty()) {
                    char firstLetter = text.charAt(0);
                    char lastLetter =' ';
                    if ( text.charAt(text.length() - 1) == ',' || text.charAt(text.length() - 1) == '.') lastLetter = text.charAt(text.length() - 2);
                    else lastLetter = text.charAt(text.length() - 1);

                    textList.add(String.valueOf(firstLetter) + lastLetter);
                }
            }
        }

        return  textList;
    }
}
