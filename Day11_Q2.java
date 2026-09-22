// Q22 (Conditional Statements)
// Write a program to find profit or loss percentage given cost price and selling price.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price:");
        double costPrice = sc.nextDouble();
        System.out.println("Enter selling price:");
        double sellingPrice = sc.nextDouble();

        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            double profitPercentage = (profit / costPrice) * 100;
            System.out.println("Profit: " + profit);
            System.out.println("Profit Percentage: " + profitPercentage + "%");
        } else if (costPrice > sellingPrice) {
            double loss = costPrice - sellingPrice;
            double lossPercentage = (loss / costPrice) * 100;
            System.out.println("Loss: " + loss);
            System.out.println("Loss Percentage: " + lossPercentage + "%");
        } else {
            System.out.println("No profit, no loss.");
        }
    }
}