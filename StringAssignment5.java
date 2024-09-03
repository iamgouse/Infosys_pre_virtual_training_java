/*String - Assignment 5
Problem Statement
Complete the removeDuplicatesandSpaces() method given in the Tester class.

Method Description

removeDuplicatesandSpaces(String str)

Remove all the duplicate characters and white spaces from the string passed to the method and return the modified string.
Test the functionalities using the main() method of the Tester class. */

class Tester{
    public static String removeDuplicatesandSpaces(String str){
        //Implement your code here and change the return value accordingly
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256];
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ' ' && !seen[ch]){
                result.append(ch);
                seen[ch] = true;
            }
        }
        return result.toString();
	}
	
	public static void main(String args[]){
	    String str = "object oriented programming";
	    System.out.println(removeDuplicatesandSpaces(str));
	    String str2 = "hello world";
	    System.out.println(removeDuplicatesandSpaces(str2));
	}
}

 
