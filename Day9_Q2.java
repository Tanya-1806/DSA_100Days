// Q18 (Conditional Statements)
// Write a program that accepts a percentage (0-100) and assigns a grade based on the following criteria: 
// 90-100: Grade A 
// 80-89: Grade B 
// 70-79: Grade C 
// 60-69: Grade D 
// below 60: Grade F.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage (0-100):");
        double percentage = sc.nextDouble();

        if (percentage >= 90 && percentage <= 100) {
            System.out.println("Grade: A");
        } else if (percentage >= 80 && percentage < 90) {
            System.out.println("Grade: B");
        } else if (percentage >= 70 && percentage < 80) {
            System.out.println("Grade: C");
        } else if (percentage >= 60 && percentage < 70) {
            System.out.println("Grade: D");
        } else if (percentage < 60 && percentage >= 0) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid percentage. Please enter a value between 0 and 100.");
        }
    }
}
