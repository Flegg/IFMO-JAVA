package com.ifmo.collections.wap;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class Words {

    private static List<String> readFile() throws IOException {
        File file = new File("./src/com/ifmo/collections/wap/resources/wp.txt");
        return Files.readAllLines(file.toPath());
    }

    private static List<String> readWords() throws IOException {

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
        return words;
    }

    static List<Map.Entry<String, Integer>> uniqueWords(int minWordLength) throws IOException {
        Map<String, Integer> uniqueWords = new HashMap<>();
        List<String> words = readWords();

        for (String word : words) {
            if (word.length() >= minWordLength) {
                Integer currentQty = uniqueWords.get(word);
                if (currentQty == null) {
                    currentQty = 0;
                }
                uniqueWords.put(word, ++currentQty);
            }
        }
        return sort(uniqueWords);
    }

    static <T1, T2 extends Comparable>List<Map.Entry<T1, T2>> sort(Map<T1, T2> map){
        List<Map.Entry<T1, T2>> list = new ArrayList<>();
        list.addAll(map.entrySet());
//        list.sort((Comparator<? super Map.Entry<String, Integer>>) map.entrySet());
        Comparator<Map.Entry<T1, T2>> comparator = new Comparator<Map.Entry<T1, T2>>() {
            @Override
            public int compare(Map.Entry<T1, T2> o1, Map.Entry<T1, T2> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        };
        list.sort(comparator);
        Collections.reverse(list);
        return list;
    }

    static <T1, T2> void topWords(List<Map.Entry<T1, T2>> list, int quantity) {
        System.out.println("Top " + quantity + " words:");
        int i = 0;
        for (Map.Entry<T1, T2> map : list) {
            System.out.println(map);
            i++;
            if (i == quantity) {
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        topWords(uniqueWords(4), 10);
    }

}
