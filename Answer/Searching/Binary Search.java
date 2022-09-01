// Binary Search   (Recursion method)
//Time Complexity = O(logn)
// Binary Search used sorted Array. They Divide Array in 2 parts (for find mid value). 
// If value of search key is less than in mid value, they find result in lower half, otherwise they find value in upper half. 

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
          int mid = l + (r - l) / 2;
          if (arr[mid] == x)
            return mid;

          if (arr[mid] > x)
            return binarySearch(arr, l, mid - 1, x);

          return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
  
  public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
          arr[i] = sc.nextInt();
        }
        int result = binarySearch(arr, 0, n-1, x);
        if(result == -1)
        {
          System.out.print("Element not found");
        }
        else
        {
          System.out.print(result);
        }
  }
}


// Input:
// 5 11
// 2 4 8 11 15
  
// Output: 3 
