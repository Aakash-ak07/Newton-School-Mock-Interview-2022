// Find The Index Of The Elements In 2 Sum

import java.io.*;
import java.util.Scanner;

public class Main {
  
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
    int target = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) 
    {
			arr[i] = sc.nextInt();
		}
		int idx1 = -1, idx2 = -1;
		
		for(int i = 0; i < (n-1); i++) 
    {
			for(int j = (i+1); j < n; j++) 
      {
				if((arr[i]+arr[j]) == val) 
        {
					idx1 = i;
					idx2 = j;
					break;
				}
			}
		}
		if(idx1 == -1 && idx2 == -1) 
    {
			System.out.println("Elements not found");
		}
    else
    {
			System.out.println(idx1 +" and "+ idx2 + " = " + target);
		}
	}
}


// Input: 
// 5 11
// 2 6 4 5 7 
  
// Output:
// 2 and 4 = 11
