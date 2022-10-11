// Given a string s, reverse only all the vowels in the string and return it.

// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.

// Input: s = ""hello""
// Output: ""holle""

// Input s = ""oceian""
// Output: ""acieon"""

import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
    public static String reverseVowels(String st)
    {
        int i = 0; 
        int j = st.length()-1;
        HashSet<Character> set = new HashSet<>();   //adding letters in HashSet so that we can use this for searching vowel letter in given string
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        char[] str = st.toCharArray();
        while(i < j)
        {
            while(i < j & !set.contains(str[i]))    //for searching first vowel character from start point using Index i
              i++;
            while(i < j & !set.contains(str[j]))    //for searching first vowel character from last point using Index j
              j--;
            
            //swapping
            char temp = str[i];     
            str[i++] = str[j];          //i++ because we have to search for next value for Index i  from encountered vowel letter for another vowel letter
            str[j--] = temp;            //sam as above j--;
        }
        return new String(str);
    }

    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(reverseVowels(str));
    }
}

------------------------------
  //2nd approch
  
class Solution {
    public String reverseVowels(String s) {
        char [] str = s.toCharArray();
        int high = s.length()-1;
        int low = 0;
        while(low<high){
            if(isVowel(str[low]) && isVowel(str[high])){
                char tem = str[low];
                str[low]=str[high];
                str[high]=tem;
                high--;
                low++;
            }
            else if(!isVowel(str[low]))
                low++;
            else if(!isVowel(str[high]))
                high--;
        }
        return new String(str);
        
    }
    //to check char was vowel or not 
    public boolean isVowel(char c){
        c=Character.toLowerCase(c);  //first convert char to lower case for our safety or other wise initiate condition for uppercase also 
        return c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u';
    }
}

