// Q23 (Conditional Statements)
// Write a program to calculate library fine based on late days as follows: 
// First 5 days late: ₹2/day 
// Next 5 days late: ₹4/day 
// Next 20 days days late: ₹6/day 
// More than 30 days: Membership Cancelled.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days late: ");
        int daysLate = sc.nextInt();
        int fine = 0;

        if (daysLate <= 5) {
            fine = daysLate * 2;
        } else if (daysLate <= 10) {
            fine = (5 * 2) + ((daysLate - 5) * 4);
        } else if (daysLate <= 30) {
            fine = (5 * 2) + (5 * 4) + ((daysLate - 10) * 6);
        } else {
            System.out.println("Membership Cancelled.");
            sc.close();
            return;
        }

        System.out.println("The library fine is: ₹" + fine);
        sc.close();
    }
}