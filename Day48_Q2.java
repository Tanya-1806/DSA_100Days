// Q96 (Strings)
// Reverse each word in a sentence without changing the word order.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedSentence.append(reversedWord.reverse().toString()).append(" ");
        }
        System.out.println("The sentence with each word reversed is: " + reversedSentence.toString().trim());
        sc.close();
    }
}   