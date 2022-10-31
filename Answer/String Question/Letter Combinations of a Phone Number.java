Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]
 

Constraints:

0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].
  
 
class Solution {
    
  private List<String> stringList = new ArrayList<String>();   //["ac","bcs"]  
	private Map<String, String> map = Map.of("2", "abc", "3","def", "4","ghi", "5", "jkl", "6","mno", "7", "pqrs", "8", "tuv", "9", "wxyz"); 
  
	public void helper(String digits, String tempString) {    //123  , ""
		if (digits.length() == 0) {                      //no more digits, recursion complete
			stringList.add(tempString);                       //add tempString to stringlist
			return; 
		}                            
         //set current digit as the 1st digit of the digits
		String currentDigit = digits.substring(0,1);        
        
        //iterate through each character of "abc"
		for (int i = 0; i < map.get(currentDigit).length() ; i++) 
            
            //remove the 1st digit of the digits, start the recursion
			helper(digits.substring(1,digits.length()), tempString +map.get(currentDigit).substring(i,i+1) );     
	}
  
	public List<String> letterCombinations(String digits) {
		if (digits.length() == 0) return stringList;
		String s = new String("");
		helper(digits, s);
		return stringList;
	}
    
}
