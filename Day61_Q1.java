// Q111 (Logic Enhancers)
// Write a program to take an integer array arr and an integer k as inputs. 
// The task is to find the first negative integer in each subarray of size k moving from left to right. 
// If no negative exists in a window, print "0" for that window. 
// Print the results separated by spaces as output.

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
            if (arr[i] < 0) {
                dq.offerLast(i);
            }
        }
        for (int i = k; i < n; i++) {
            if (!dq.isEmpty()) {
                System.out.print(arr[dq.peekFirst()] + " ");
            } else {
                System.out.print("0 ");
            }
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            if (arr[i] < 0) {
                dq.offerLast(i);
            }
        }
        if (!dq.isEmpty()) {
            System.out.print(arr[dq.peekFirst()]);
        } else {
            System.out.print("0");
        }
    }
}