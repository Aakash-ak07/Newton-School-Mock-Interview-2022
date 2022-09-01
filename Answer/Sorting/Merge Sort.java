// Merge Sort : Time Complexity - O(nlogn) for All case(Wrost case, Avg. case and Best case) Best to use 
// Merge Sort -> Not in Place Sort 
// Stable Sort
// This Algo. is Based on Divide and Conquer Algo. , we Divide Array in two parts and they are combine in Sorted manner.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
  public static void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
  
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
  
    public static void sort(int arr[], int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
  
    public static void print(int arr[],int n)
    {
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
  
  public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int [] arr = new int[n];
      for(int i = 0; i < n; i++)
      {
        arr[i] = sc.nextInt();
      }
      sort(arr, 0, n-1);
      print(arr, n);
  }
}


Input:
// 5 
// 12 4 18 11 5
  
// Output: 
// 4 5 11 12 18
