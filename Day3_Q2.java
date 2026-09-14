// Q6 (User Inputs, Operations & Output)
// Write a program to swap two numbers using a third variable.

import java.util.*; 

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int n2 = sc.nextInt();

        // Swapping using a third variable
        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("After swapping:");
        System.out.println("1st number: " + n1);
        System.out.println("2nd number: " + n2);
    }
}