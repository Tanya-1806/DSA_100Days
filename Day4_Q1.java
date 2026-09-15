// Q7 (User Inputs, Operations & Output)
// Write a program to swap two numbers without using a third variable.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int n2 = sc.nextInt();

        System.out.println("Before swapping: n1 = " + n1 + ", n2 = " + n2);

        
        n1 = n1 + n2; 
        n2 = n1 - n2; 
        n1 = n1 - n2; 

        System.out.println("After swapping: n1 = " + n1 + ", n2 = " + n2);
    }
}