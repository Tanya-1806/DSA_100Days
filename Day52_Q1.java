// Q102 (Logic Enhancers)
// Write a Program to take a sorted array arr[] and an integer x as input, 
// find the index (0-based) of the smallest element in arr[] that is greater than or equal to x and print it.
// This element is called the ceil of x. If such an element does not exist, print -1. 
// Note: In case of multiple occurrences of ceil of x, return the index of the first occurrence.


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            
        System.out.print("Enter the size of the sorted array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }       
        System.out.print("Enter the integer x: ");
        int x = sc.nextInt();
        int ceilIndex = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] >= x) {
                ceilIndex = i;
                break;
            }
        }
        System.out.println("Index of the ceil of " + x + ": " + ceilIndex);
        sc.close();     
    }
}