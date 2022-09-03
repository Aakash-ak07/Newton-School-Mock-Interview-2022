//Search in a row wise and column wise sorted matrix
// Time Complexity: O(n)
// Auxiliary Space: O(1)

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void search(int[][] mat,int n, int x)
    {
        // set indexes for top right
        int i = 0, j = n - 1;
        while (i < n && j >= 0)
        {
            if (mat[i][j] == x)
            {
                System.out.print("Element found at " + i + " " + j);
                return;
            }
            if (mat[i][j] > x)
                j--;
            else					// if mat[i][j] < x
                i++;
        }
        System.out.print("n Element not found");
        return; // if ( i==n || j== -1 )
    }
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		// int m = sc.nextInt();
		int x = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0; i < n; i++)
        {
        	for (int j = 0; j<n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        search(arr, n, x);
	}
}


// Input:
// 3 6
// 1 2 3
// 4 5 6
// 7 8 9
  
// Output:
// Element found at 1 2
