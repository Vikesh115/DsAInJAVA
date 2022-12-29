package Array;

import java.util.Scanner;

public class MissingNumber {

    public static void MissingNum(int arr[], int n)
    {
      int sum=0;
      for(int i=0; i<n; i++)
      {
        sum = arr[i]+sum;
      }

      int expectedSum = (n*(n+1))/2;

      int reqsum = expectedSum - sum;
      System.out.println(reqsum);
    }
    
    public static void main(String args[])
    {
        // Sort Array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        MissingNum(arr, n);

    }
}
