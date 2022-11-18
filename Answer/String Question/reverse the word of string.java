// reverse the words of the string

//  String s ="my.name.is.shivam";
// shivam.is.name.my

public class Main {
    public static String swap(String str, int i, int j)
    {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        
        return new String(ch);
    }
    
    public static String mirrorWords(String str)
    {
        int left = 0, i = 0, n = str.length();
        while(str.charAt(i) == '.'){
            i++;
        }
        left = i;
        
        while(i < n)
        {
            if(i + 1 == n || str.charAt(i) == '.')
            {
                int x = i - 1;
                
                if(i + 1 == n)
                    x++;
                
                while(left < x)
                {
                    str = swap(str, left++, x--);   
                }
                left = i + 1;
            }
            if(i > left && str.charAt(left) == '.')  //' '  space
            {
                left = i;
            }
            i++;
        }
        str = new StringBuilder(str).reverse().toString();
        
        return str; 
    }
  
    public static void main(String args[]) {
        String str = "my.name.is.shivam";
        str = mirrorWords(str);
        System.out.println(str);
    }   
}
