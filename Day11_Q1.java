// Q21 (Conditional Statements)
// Write a program to display the month name and number of days using switch-case for a given month number.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month number (1-12) to get the corresponding month name and number of days:");
        int monthNumber = sc.nextInt();

        switch (monthNumber) {
            case 1:
                System.out.println("Month: January, Days: 31");
                break;
            case 2:
                System.out.println("Month: February, Days: 28/29");
                break;
            case 3:
                System.out.println("Month: March, Days: 31");
                break;
            case 4:
                System.out.println("Month: April, Days: 30");
                break;
            case 5:
                System.out.println("Month: May, Days: 31");
                break;
            case 6:
                System.out.println("Month: June, Days: 30");
                break;
            case 7:
                System.out.println("Month: July, Days: 31");
                break;
            case 8:
                System.out.println("Month: August, Days: 31");
                break;
            case 9:
                System.out.println("Month: September, Days: 30");
                break;
            case 10:
                System.out.println("Month: October, Days: 31");
                break;
            case 11:
                System.out.println("Month: November, Days: 30");
                break;
            case 12:
                System.out.println("Month: December, Days: 31");
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 12.");
        }
    }
}
