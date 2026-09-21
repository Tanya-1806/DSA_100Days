// Q20 (Conditional Statements)
// Write a program to display the day of the week based on a number (1–7) using switch-case.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (1-7) to get the corresponding day of the week:");
        int dayNumber = sc.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Day: Monday");
                break;
            case 2:
                System.out.println("Day: Tuesday");
                break;
            case 3:
                System.out.println("Day: Wednesday");
                break;
            case 4:
                System.out.println("Day: Thursday");
                break;
            case 5:
                System.out.println("Day: Friday");
                break;
            case 6:
                System.out.println("Day: Saturday");
                break;
            case 7:
                System.out.println("Day: Sunday");
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
    }
}