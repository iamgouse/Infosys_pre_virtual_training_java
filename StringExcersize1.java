/*Problem Statement
Complete the removeWhiteSpaces() method given in the Tester class.

Method Description

removeWhiteSpaces(String str)

Remove all the white spaces from the string passed to the method and return the modified string.

Test the functionalities using the main() method of the Tester class.*/

class Tester{

    public static String removeWhiteSpaces(String str){
      return str.replaceAll("\\s", "");
	}
	
	public static void main(String args[]){
		String str = "Hello   How are you   ";
		str = removeWhiteSpaces(str);
		System.out.println(str);
		
		String str2 = "J  ava pro    gramming";
		str2 = removeWhiteSpaces(str2);
		System.out.println(str2);
	}
}

 
