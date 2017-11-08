package com.ifmo.collections.wap;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Words {

    private static List<String> readFile() throws IOException {
        File file = new File("./src/com/ifmo/collections/wap/resources/wp.txt");
        return Files.readAllLines(file.toPath());
    }

    private static void readWords() throws IOException {

        List<String> lines = readFile();
        List<String> words = new ArrayList<>();

        for (String line : lines) {
            String[] wordSplit = line.toLowerCase()
                    .replaceAll("\\p{Punct}", " ")
                    .trim()
                    .split("\\s");

            for (String s : wordSplit) {
                if (s.length() > 0)
                    words.add(s.trim());
            }
        }

//        for (String word : words) {
//            System.out.println(word);
//        }
    }

//    public static List<Map.Entry<String, Integer>> uniqueWords() throws IOException {
//        Map<String, Integer> uniqueWords = new HashMap<>();
//        List<String> lines = readFile();
//    }

//    public static void main(String[] args) throws IOException {
//        readWords();
//    }

}
