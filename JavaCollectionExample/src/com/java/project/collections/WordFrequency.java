package com.java.project.collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //String paragraph = scanner.nextLine();
        String paragraph="This is a Paragraph, with more words";
        System.out.println(paragraph);
        // Call the word frequency counting function
        Map<String, Integer> wordFrequency = countWordFrequency(paragraph);
        // Display the result
        System.out.println("Word frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        //scanner.close();
    }

    /**
     * Method to count the frequency of each word in a string
     * 
     * @param text Input paragraph
     * @return Map containing word frequencies
     */
    public static Map<String, Integer> countWordFrequency(String text) {
        // Create a map to store word frequencies
        Map<String, Integer> wordMap = new HashMap<>();

        if (text == null || text.isEmpty()) {
            return wordMap; // Return empty map for null or empty input
        }

        // Convert text to lowercase and split by whitespace
        String[] words = text.toLowerCase().trim().split("\\s+");

        // Count each word's frequency
        for (String word : words) {
            // Remove punctuation from the word
            word = word.replaceAll("[^a-zA-Z]", "");
            if (!word.isEmpty()) {
                wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            }
        }

        return wordMap;
    }
}
