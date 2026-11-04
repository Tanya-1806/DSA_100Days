// Q97 (Strings)
// Print the initials of a name.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        String[] words = name.split("\\s+");
        StringBuilder initials = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                initials.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        System.out.println("The initials of the name are: " + initials.toString());
        sc.close();
    }
}   