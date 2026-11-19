// Q113 (Logic Enhancers)
// Write a program to take an integer array arr and an integer k as inputs. 
// The task is to find the kth smallest element in the array. 
// Print the kth smallest element as output.


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[k - 1]);
    }   
}