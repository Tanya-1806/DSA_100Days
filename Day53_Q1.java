// Q103 (Logic Enhancers)
// Write a Program to take an array of integers as input, calculate the pivot index of this array. 
// The pivot index is the index where the sum of all the numbers strictly to the left of the index 
// is equal to the sum of all the numbers strictly to the index's right. 
// If the index is on the left edge of the array, 
// then the left sum is 0 because there are no elements to the left. 
// This also applies to the right edge of the array. Print the leftmost pivot index. 
// If no such index exists, print -1.


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();    
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int totalSum = 0;
        for (int num : arr) {   
            totalSum += num;
        }
        int leftSum = 0;        
        int pivotIndex = -1;
        for (int i = 0; i < size; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                pivotIndex = i;
                break;
            }
            leftSum += arr[i];
        }
        System.out.println("Pivot index: " + pivotIndex);
        sc.close();
    }
}   