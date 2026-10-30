// Q88 (Strings)
// Replace spaces with hyphens in a string. 

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        // Replace spaces with hyphens
        String modifiedString = inputString.replace(' ', '-');

        System.out.println("Modified String: " + modifiedString);

        sc.close();
    }
}
