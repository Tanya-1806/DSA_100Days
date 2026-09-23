// Q24 (Conditional Statements)
// Write a program to calculate electricity bill based on units consumed with these rates: 
// First 100 units at ₹5/unit 
// Next 100 units at ₹7/unit 
// Next 100 units at ₹10/unit 
// Above at ₹12/unit

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int unitsConsumed = sc.nextInt();
        int billAmount = 0;

        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        } else if (unitsConsumed <= 200) {
            billAmount = (100 * 5) + ((unitsConsumed - 100) * 7);
        } else if (unitsConsumed <= 300) {
            billAmount = (100 * 5) + (100 * 7) + ((unitsConsumed - 200) * 10);
        } else {
            billAmount = (100 * 5) + (100 * 7) + (100 * 10) + ((unitsConsumed - 300) * 12);
        }

        System.out.println("The electricity bill is: ₹" + billAmount);
        sc.close();
    }
}