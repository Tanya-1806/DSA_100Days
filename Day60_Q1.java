// Q110 (Logic Enhancers)
// Write a program to take an integer array arr and an integer k as inputs. 
// The task is to find the maximum element in each subarray of size k moving from left to right. 
// Print the maximum elements for each window separated by spaces as output.

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();   
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the window: ");
        int k = sc.nextInt();   
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        for (int i = k; i < n; i++) {
            System.out.print(arr[dq.peekFirst()] + " ");
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        System.out.print(arr[dq.peekFirst()]);
    }
}