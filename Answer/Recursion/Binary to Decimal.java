// Write a Java program to convert a binary number into the decimal format, without using any library method which can directly solve the problem.
// OP: Decimal equivalent of binary number 10111 is 23

import java.util.*;
import java.io.*;

class Main
{
	public static int binaryToDecimal(int n)
	{
		int binaryNum = n;
		int decimalNum = 0;
		
		int baseVal = 1; //2^0 = 1
		int tempVal = binaryNum;
		
		while(tempVal > 0)
		{
			int checkLastNum = tempVal % 10;
			tempVal  = tempVal / 10;
			decimalNum += checkLastNum * baseVal;
			baseVal = baseVal * 2;
		}
		return decimalNum;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.print(binaryToDecimal(n));
	}
}


// Input : 10111
// Output : 23
