// Q101 (Logic Enhancers)
// Write a Program to take a sorted array(say nums[]) and an integer (say target) as inputs. 
// The elements in the sorted array might be repeated. 
// You need to print the first and last occurrence of the target and print the index of first and last occurrence. 
// Print -1, -1 if the target is not present.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the sorted array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements of the sorted array:");          
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target integer: ");
        int target = sc.nextInt();
        int firstOccurrence = -1;
        int lastOccurrence = -1;
        for (int i = 0; i < size; i++) {
            if (nums[i] == target) {
                if (firstOccurrence == -1) {
                    firstOccurrence = i;
                }
                lastOccurrence = i;
            }
        }
        System.out.println("First occurrence index: " + firstOccurrence);
        System.out.println("Last occurrence index: " + lastOccurrence);
        sc.close();
    }
}