/*String - Assignment 4
Problem Statement
Complete the findHighestOccurrence() method given in the Tester class.

Method Description

findHighestOccurrence(String str)

Find the count of the highest occurring character in the string passed to the method and return the count.
Test the functionalities using the main() method of the Tester class. */

class Tester {

	public static int findHighestOccurrence(String str){
		//Implement your code here and change the return value accordingly
		int[] frequency = new int[256];
		for (int i = 0; i < str.length(); i++){
		    frequency[str.charAt(i)]++;
		}
		int maxFrequency = 0;
		for (int i = 0; i < 256; i++){
		    if(frequency[i] > maxFrequency){
		        maxFrequency = frequency[i];
		    }
		}
        return maxFrequency;
	}
	
	public static void main(String args[]){
	    String str = "success";
	    System.out.println(findHighestOccurrence(str));
	    String str2 = "associated";
	    System.out.println(findHighestOccurrence(str2));
	}
}

 
