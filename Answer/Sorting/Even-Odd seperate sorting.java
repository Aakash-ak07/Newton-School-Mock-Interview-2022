// Given an array A of positive integers. Your task is to sort them in such a way that the first part of the array contains odd numbers sorted in descending order, rest portion contains even numbers sorted in ascending order.
// Input
// First line of each test case contains an integer N denoting the size of the array. The next line contains N space separated values of the array.

// 1 <= N <= 100000
// 0 <= A[i] <= 100000
// Output
// Print the space separated values of the modified array.
// Example
// Sample Input
// 7
// 1 2 3 5 4 7 10

// Sample Output
// 7 5 3 1 2 4 10


// Sample Input
// 7
// 0 4 5 3 7 2 1

// Sample Output
// 7 5 3 1 0 2 4


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// Make all odd numbers negative.
// Sort all numbers.
// Revert the changes made in step 1
class Main {
    public static void sortEvenOdd(int[] arr, int n)
    {
        for (int i = 0; i < n; i++)
        {
            if ((arr[i] & 1) != 0) // Check for odd
                arr[i] *= -1;
        }
        Arrays.sort(arr);                   
        for (int i = 0; i < n; i++)         // Retaining original array
        {
            if ((arr[i] & 1) != 0)
                arr[i] *= -1;
        }
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        sortEvenOdd(arr,n);
        // System.out.print();
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]+" ");
        }
    }
}
