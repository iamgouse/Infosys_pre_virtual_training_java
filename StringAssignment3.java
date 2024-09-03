/*String - Assignment 3
Problem Statement
Complete the reverseEachWord() method given in the Tester class.

Method Description

reverseEachWord(String str)

Reverse each word in the string passed to the method without changing the order of the words and return the modified string.
Test the functionalities using the main() method of the Tester class.

Note: There should not be any extra blank/white space(s) in the output string.*/

class Tester {
    public static String reverseEachWord(String str){
	    //Implement your code here and change the return value accordingly
	    String[] words = str.split(" ");
	    StringBuilder result = new StringBuilder ();
	    for (String word : words){
	        StringBuilder reverseWord = new StringBuilder(word);
	        result.append(reverseWord.reverse().toString()).append(" ");
	    }
        return result.toString().trim();
	}
	
	public static void main(String args[]){
	    String str = "all cows eat grass";
	    System.out.println(reverseEachWord(str));
	    
	    String str2 = "I love programming";
	    System.out.println(reverseEachWord(str2));
	}
}
