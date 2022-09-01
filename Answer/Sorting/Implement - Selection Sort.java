//Selection Sort : Time Complexity - O(N^2) : Inplace sort : Unstable Sort
// :- First find smallest element, swap with 0th index, find 2nd smallest element and swap with 1st index.  Repet finding the next samllest element and swap
// into the corrext position untill Arrry is Sorted.



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
  public static void selectionSort(int arr[], int n) 
  {
      for(int i = 0; i < n-1; i++) 
      {
        int smallest = i;
        for(int j = i+1; j < n; j++) 
        {
          if(arr[j] < arr[smallest]) 
          {
            smallest = j;
          }
        }
	        int swap = arr[smallest];
	        arr[smallest] = arr[i];
	        arr[i] = swap;
      }
      for(int p = 0; p < arr.length; p++)
      {
        System.out.print(arr[p]+" ");
          System.out.print("");
      }
  }

  public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
          arr[i] = sc.nextInt();
        }
        selectionSort(arr, n);
  }
}



// Input:
// 5
// 12 7 5 9 6
  
// Output:
// 5 6 7 9 12
