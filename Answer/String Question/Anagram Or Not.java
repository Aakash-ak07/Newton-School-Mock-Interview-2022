import java.util.Arrays;  
public class Main {  
    static void isAnagram(String s1, String s2) {  
        boolean status = true;  
        if (s1.length() != s2.length()) {  
            status = false;  
        } else {  
            char[] ArrayS1 = s1.toCharArray();  
            char[] ArrayS2 = s2.toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (status) {  
            System.out.println("Anagrams");  
        } else {  
            System.out.println("Not Anagrams");  
        }  
    }  
   
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        isAnagram(str1, str2);  
    }  
}

Input:
abc  bac

Output:
Anagrams
