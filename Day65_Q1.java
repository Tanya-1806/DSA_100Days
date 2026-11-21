// Q115 (Logic Enhancers)
// Write a program to take two strings s and t as inputs (assume all characters are lowercase). 
// The task is to determine if s and t are valid anagrams, meaning they contain the same characters 
// with the same frequencies. Print "Anagram" if they are, otherwise "Not Anagram".

import java.util.HashMap;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        if (s.length() != t.length()) {
            System.out.println("Not Anagram");
            return;
        }

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!charCountMap.containsKey(c)) {
                System.out.println("Not Anagram");
                return;
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
            if (charCountMap.get(c) == 0) {
                charCountMap.remove(c);
            }
        }

        System.out.println(charCountMap.isEmpty() ? "Anagram" : "Not Anagram");
    }
}