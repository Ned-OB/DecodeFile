//package org.example.read;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//import static org.example.enums.Constants.FILE_PATH;
//
//public class Read {
//    static List<String> expectedWords = new ArrayList<>();
//
////    public static void main(String[] args) {
////        populateExpectedWords();
////        try {
////            String magazineText = read();
////            System.out.println(checkForMessages(magazineText));
////        } catch (FileNotFoundException e) {
////            System.out.println("An error occurred reading file: " + e.getMessage());
////        }
////    }
//
//    public static void populateExpectedWords() {
//        expectedWords.add("No updates");
//        expectedWords.add("The terrorists are close");
//        expectedWords.add("The terrorist's base has been occupied");
//        expectedWords.add("The conflict is over");
//        expectedWords.add("Life of the party");
//    }
//
//    public static String read() throws FileNotFoundException {
//        File file = new File(FILE_PATH);
//        Scanner scanner = new Scanner(file);
//
//        StringBuilder readFile = new StringBuilder();
//        while (scanner.hasNextLine()) readFile.append(scanner.nextLine());
//
//        return readFile.toString();
//    }
//
//    public static List<String> checkForMessages(String text) {
//        List<String> words = new ArrayList<>();
//        for (String message : expectedWords) {
//
//            Pattern firstLetterPattern = Pattern.compile("(?i)\\b" + message.charAt(0) + "\\w*");
//            Pattern lastLetterPattern = Pattern.compile("(?i)\\w*" + message.charAt(message.length() - 1) + "\\b");
//
//            System.out.println(matchesPattern(text, firstLetterPattern));
////            System.out.println(text);
//
//            if (matchesPattern(text, firstLetterPattern) || matchesPattern(text, lastLetterPattern)) {
//                words.add(message); // Message found
//            }
//        }
//        return words;
//    }
//
//    public static boolean matchesPattern(String text, Pattern pattern) {
//        Matcher matcher = pattern.matcher(text);
//        return matcher.find();
//    }
//}
