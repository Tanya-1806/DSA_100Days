// Q9 (User Inputs, Operations & Output)
// Write a program to calculate simple and compound interest for given principal, rate, and time.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount");
        double principal = sc.nextDouble();
        System.out.println("Enter rate of interest (in %)");
        double rate = sc.nextDouble();
        System.out.println("Enter time (in years)");
        double time = sc.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Calculate compound interest
        double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal;

        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Compound Interest: " + compoundInterest);
    }
}
