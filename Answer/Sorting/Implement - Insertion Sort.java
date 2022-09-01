// Insertion Sort : Time Compexity - O(N^2) : Stable Sort : Inplace Sort
// It take an element from input , remove it and place it on correct position and shift other element

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
  public static void InsertionSort(int arr[], int n)
	{
		for (int i = 1; i < n; ++i) {
        int key = arr[i];
        int j = i - 1;

        while (j >= 0 && arr[j] > key) 
        {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }

    for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
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
        InsertionSort(arr, n);
  }
}


/ Input:
// 5 
// 2 18 5 1 15
  
// Output: 
// 1 2 5 15 18
