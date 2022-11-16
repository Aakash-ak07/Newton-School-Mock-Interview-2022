// You are given an unsorted array with both positive and negative elements. You have to find the smallest positive number missing from the array. The designed algorithm should have linear time complexity (Big-O complexity O(N)) and constant space complexity (Big-O complexity O(1)).
// Input:  {2, 3, 7, 6, 8, -1, -10, 15} 
// Output: 1
// Input:  { 2, 3, -7, 6, 8, 1, -10, 15 } 
// Output: 4 
// Input: {1, 1, 0, -1, -2} Output: 2


import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static int positiveMissingNo(int arr[], int n)
    {
        for(int i = 0; i < n; i++)
        {
          int x = Math.abs(arr[i]);
          if(x - 1 < n && arr[x - 1] > 0)
          {
            arr[x - 1] = -arr[x - 1];
          }
        }
        for(int  i = 0; i < n; i++)
        {
          if(arr[i] > 0)
            return i + 1;
        }
        return n+1;
    }

    public static int missingNo(int arr[], int n)
    {
        int x = func(arr, n);
        int arr2[] = new int[n - x];

        int j = 0;
        for(int i = x; i < n; i++)
        {
          arr2[j] = arr[i];
          j++;
        }
        return positiveMissingNo(arr2, j);
    }

    public static int func(int arr[], int n)
    {
        int j = 0;
        for(int i = 0; i < n; i++)
        {
          if(arr[i] <= 0)
          {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
          }
        }
        return j;
    }
  
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
          arr[i] = sc.nextInt();
        }
        int res = missingNo(arr, n);
        System.out.println(res);
    }
}
