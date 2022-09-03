//Convert a String to Character Array in Java

import java.util.*;
import java.lang.*;
import java.io.*;
 
class Ideone
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch = new char[str.length()];
		 for (int i = 0; i < str.length(); i++) 
		 {
            ch[i] = str.charAt(i);
        }
        for (char c : ch) {
            System.out.print(c+ " ");
        }
	  }
}


// Input:
// aakash

// Output: 
// a a k a s h 
