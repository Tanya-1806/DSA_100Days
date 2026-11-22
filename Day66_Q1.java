// Q116 (Logic Enhancers)
// Write a program to take an integer array nums which contains only positive integers, 
// and an integer target as inputs. The goal is to find two distinct indices i and j in the array 
// such that nums[i] + nums[j] equals the target. Assume exactly one solution exists and 
// return the indices in any order. Print the two indices separated by a space as output. 
// If no solution exists, print "-1 -1".



import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                System.out.println(map.get(complement) + " " + i);
                return;
            }

            map.put(nums[i], i);
        }

        System.out.println("-1 -1");
    }
}
