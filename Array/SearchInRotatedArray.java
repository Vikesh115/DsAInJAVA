package Array;

import java.util.Scanner;

public class SearchInRotatedArray {

    public static int SearchArray(int arr[], int target, int n) {
        for (int i = 0; i < n; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        SearchArray(arr, target, n);
        SearchInRotatedArray obj = new SearchInRotatedArray();
        int result = SearchInRotatedArray.SearchArray(arr, target, n);
        System.out.println(result);
    }
}
