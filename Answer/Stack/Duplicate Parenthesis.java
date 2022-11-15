// Find an Expression has Duplicate Parenthesis or not..


import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static boolean findDuplicates(String str){
		Stack<Character> st = new Stack<>();
		char[] str1 = str.toCharArray();
		
		for(char ch : str1)
		{
			if(ch == ')' )
			{
				char top = st.peek();
				st.pop();
				int element = 0;
				
				while(top != '(' )
				{
					element++;
					top = st.peek();
					st.pop();
				}
				
				if(element < 1)
				{
					return true;
				}
			}
			else
			{
				st.push(ch);
			}
		}
		return false;
	}
	public static void main (String[] args) 
	{
		String str = "(((x+y)) + z )";
		
		if(findDuplicates(str)){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}


// Input
// (x)

// Output
// false

// Input:
// ((x))

// Output:
// true

// Input : (((x+y)) + z )
// Output : true
