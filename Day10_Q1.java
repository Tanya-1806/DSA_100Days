// Q19 (Conditional Statements)
// Write a program to classify a triangle as Equilateral, Isosceles, or Scalene based on its side lengths.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lengths of the three sides of the triangle:");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Invalid side lengths. All sides must be positive.");
        } else if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is Equilateral.");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("The triangle is Isosceles.");
        } else {
            System.out.println("The triangle is Scalene.");
        }
    }
}