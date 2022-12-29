package Array;

import java.util.Scanner;

public class MaxSubarraySum {
    static void maxSubArray(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= n - 1; i++) {
            int currSum = 0;
            for (int j = i; j <= n - 1; j++) {
                currSum += arr[j];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        maxSubArray(arr);
    }
}
