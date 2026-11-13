// Q108 (Logic Enhancers)
// Write a Program to take an integer array nums.
// Print an array answer such that answer[i] is equal to the product of all the elements of nums 
// except nums[i]. The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] answer = productExceptSelf(nums);
        for (int i = 0; i < n; i++) {
            System.out.print(answer[i] + " ");
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return answer;
    }
}