/*String - Assignment 1
Problem Statement
Complete the moveSpecialCharacters() method given in the Tester class.

Method Description

moveSpecialCharacters(String str)

Move all the special characters present in the string passed to the method to the end of the string and return the modified string.
Note: Assume that the input string does not have any space.

Test the functionalities using the main() method of the Tester class.*/

class Tester{
    
    public static String moveSpecialCharacters(String str){
		//Implement your code here and change the return value accordingly
		StringBuilder alphabets = new StringBuilder();
		StringBuilder specialCharacters = new StringBuilder();
		for(int i = 0; i < str.length(); i++){
		    char ch = str.charAt(i);
		    if (Character.isLetter(ch)){
		        alphabets.append(ch);
		    }else{
		        specialCharacters.append(ch);
		    }
		}
        return alphabets.toString() + specialCharacters.toString();
	}
	
	public static void main(String args[]){
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
	    String str2 = "%$Wel*&come!";
	    System.out.println(moveSpecialCharacters(str2));
	}
	
}
