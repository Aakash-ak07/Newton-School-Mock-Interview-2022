// Write a Java program to convert a Decimal number into the binary format, without using any library method which can directly solve the problem ?
//     OP: Binary equivalent of Decimal number 23 is 10111.

import java.util.*;
import java.io.*;

class Main
{	
	public static void decimalToBinary(int n)
	{
      int [] binaryNum = new int[100000];
      int i = 0;
      while(n > 0)
      {
        binaryNum[i] = n % 2;
        n = n / 2;
        i++;
      }
      for(int k = i - 1; k >= 0; k--)
      {
        System.out.print(binaryNum[k]);
      }
	}
	public static void main (String[] args) throws java.lang.Exception
	{
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      decimalToBinary(n);
	}
}

// Input: 23
// Output : 10111
