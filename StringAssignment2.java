/*String - Assignment 2
Problem Statement
Complete the checkPalindrome() method given in the Tester class.

Method Description

checkPalindrome(String str)

Check whether the string passed to the method is a palindrome or not. 

Return true if the string is palindrome, else return false.

Test the functionalities using the main() method of the Tester class. */

class Tester{
    public static boolean checkPalindrome(String str){
	    //Implement your code here and change the return value accordingly
	    String reversedStr = new StringBuilder(str).reverse().toString();
	    
        return str.equals(reversedStr);
	}
	
	public static void main(String args[]){
		String str = "radar";
		if(checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
		
		String str2 = "apple";
		if(checkPalindrome(str2))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}
}



 
