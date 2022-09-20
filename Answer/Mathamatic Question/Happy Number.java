// A happy number is a number defined by the following process:

// Starting with any positive integer, replace the number by the sum of the squares of its digits.
// Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
// Those numbers for which this process ends in 1 are happy.
// Return true if n is a happy number, and false if not.

// 1st method using list 

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static boolean isHappy(int n) {
		ArrayList<Integer> list=new ArrayList<Integer>();
        while(n != 1)
        {
            int temp = n;
            n = 0;
            while(temp > 0)
            {
                n = n + (int)Math.pow((temp%10), 2);
                temp = temp / 10;
            }
            if(list.contains(n))
            {
                return false;
            }
            else
            {
                list.add(n);
            }
        }
    	return true;
	}
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isHappy(n));
	}
}

// Input: n = 19
// Output: true
// Explanation:
// 12 + 92 = 82
// 82 + 22 = 68
// 62 + 82 = 100
// 12 + 02 + 02 = 1

// Input: n = 2
// Output: false

----------------------------------------------------------------------------------
//optimisied method  
  
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{

   public static boolean isHappy(int n) {
    HashSet<Integer> usedIntegers = new HashSet<>();
    while (true) {

      // Find the sum of squares
      int sum = 0;
      while (n != 0) {
        sum += Math.pow(n % 10, 2.0);
        n = n / 10;
      }

      // If sum is 1, return true
      if (sum == 1) return true;

      // Else, the new number is the current sum
      n = sum;

      // Check if we have already encountered
      // that number
      if (usedIntegers.contains(n))
        return false;
      usedIntegers.add(n);
    }
  }	
    public static void main (String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println(isHappy(n));
    }	
}
----------------------------------------------------------
  
  
//2nd method using recursion

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static boolean isHappy(int n) {
	   if (n < 7 && n > 1)  
       return false;
		int sum = 0;
		//here base condition 
		if (n == 1)  
      return true;
    
		while (n > 0) {
			int digit = n % 10;              //we taking last element 
			sum = sum + (digit * digit);    //squre it
			n = n / 10;                     //remove the last elment
		}
			//there we are recursion the results of after (squre and adding) new value is sum	
		return isHappy(sum);    
	}
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isHappy(n));
	}
}
----------------------------------------------------------

//3rd Method Using HashSet

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static int sumOfDigits(int n)
  { 
        int ans = 0;
        while(n>0){
            ans = ans + (n%10) * (n%10);
            n = n/10;
        }
        return ans;
    }
    
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        
        while(sumOfDigits(n) != 1)
        {
            n = sumOfDigits(n);
            if(set.contains(n)) return false;
            else set.add(n);
        }
        return true;
    }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isHappy(n));
	}
}
--------------
  


import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static boolean isHappy(int n) {
    while (true) 
    {
        n = cal(n);
        if (n == 1) 
        {
          return true;
        } 
        else if (n == 4) 
        {
          return false;
        }
	   }
	}
	public static int cal(int n) {
		int sum = 0;
		while (n != 0) 
		{
			int tmp = n % 10;
			sum = sum + tmp * tmp;
			n = n / 10;
		}
		return sum;
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isHappy(n));
	}
}
