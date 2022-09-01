//Bubble Sort: Time Complexity O(N^2) : Stable Sort : Inplace Sort
// Compare 2 element, if 1 element is larger then 2nd element then we swap these element, after we pick next 2 element and and swap it.
// Whenever the Biggest element at your last position.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Main {
    public static void BubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            for (int j = 0; j < arr.length - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
            {
              arr[i] = sc.nextInt();
            }
            BubbleSort(arr);
        }
    }
}



// Input:
// 5
// 1 12 2 7 15 
  
// Output:
// 1 2 7 12 15
