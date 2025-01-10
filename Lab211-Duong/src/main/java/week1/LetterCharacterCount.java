/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author ADMIN
 */
public class LetterCharacterCount {
private String content;
    public LetterCharacterCount(String content) {
        this.content = content;
    }
    public Map<String, Integer> countWords() {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = content.split("\\s+");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }

    public Map<Character, Integer> countCharacters() {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : content.toCharArray()) {
            if (c != ' ') { 
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }
        return charCount;
    }
}
