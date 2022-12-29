package Array;

import java.util.Scanner;

public class RepeatingElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        RepeatArray(arr, n);
    }

    public static void RepeatArray(int[] arr, int n) {
        if (arr.length == 0)
            System.out.println("0");
        int len = 1;
        int curr = arr[0];
        int num = 1;
        int pointer = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == curr) {
                num++;
            } else {
                curr = arr[i];
                num = 1;
            }
            arr[pointer] = arr[i];
            if (num > 2)
                continue;
            len++;
            pointer++;
        }
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
