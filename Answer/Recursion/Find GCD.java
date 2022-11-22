// Write a program to find the greatest common divisor or GCD of a given number? IP : 54 and 24

import java.util.*;
import java.io.*;

class Main
{
	public static int gcd(int a, int b)
	{
		if(b == 0)	return a;
		
		return gcd(b, a % b);
		
	}
	public static void main (String[] args) throws java.lang.Exception
	{
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.print(gcd(a, b));
	}
}

// Input:
// 54 24

// Output:
// 6
