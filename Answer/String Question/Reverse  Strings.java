// You are given a string your task is to reverse the given string.

class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String rev = "";
        char ch;
        for(int i = 0; i<str.length(); i++)
        {
            rev = str.charAt(i)+rev;
        }
        System.out.print(rev);
    }
}


// Sample Input
// abc

// Sample Output
// cba
