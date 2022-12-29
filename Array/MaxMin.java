package Array;

import java.util.Scanner;

public class MaxMin {
    static void Sum(int arr[], int n) {
        int minVal = arr[0];
        int maxVal = arr[0];

        for (int i = 1; i < n; i++) {
            if (maxVal < arr[i]) {
                maxVal = arr[i];
            } else if (minVal > arr[i]) {
                minVal = arr[i];
            }
        }
        System.out.println("Sum are: " + (minVal + maxVal));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Sum(arr, n);
    }
}