package Day2;
// Q3 (User Inputs, Operations & Output)
// Write a program to calculate the area and perimeter of a rectangle given its length and breadth.

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        double length = sc.nextDouble();
        System.out.println("Enter breadth of rectangle");
        double breadth = sc.nextDouble();

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}