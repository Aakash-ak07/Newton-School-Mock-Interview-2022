//Given an array of N elements and an integer D. Your task is to rotate the array D times in a circular manner from the right to left direction

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void rotate(int arr[], int n, int d){
        int p = 1;
        while (p <= d) 
        {
            int last = arr[0];
            for (int i = 0; i < n - 1; i++) 
            {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = last;
            p++;
        }
    }
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int d = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
        rotate(arr, n, d);
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}


// Sample Input:
// 8 4
// 1 2 3 4 5 6 7 8
  
// 10 3
// 1 2 3 4 5 6 7 8 9 10
  
// Sample Output:
// 5 6 7 8 1 2 3 4
// 4 5 6 7 8 9 10 1 2 3
