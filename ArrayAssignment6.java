/*Array - Assignment 6
Problem Statement
Find and return the count of the adjacent occurrence of a number in the numbers array passed to the findTotalCount() method. Implement the logic inside findTotalCount() method.

Test the functionalities using the main method of the Tester class.*/

 class Tester {
	public static int findTotalCount(int[] numbers) {
		int count = 0;;
		for (int i = 0; i < numbers.length - 1; i++){
		    if(numbers[i] == numbers[i +1]){
		        count++;
		    }
		}
        return count;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 1, 5, 100, -20, 6, 0, 0 };
		System.out.println("Count of adjacent occurrence: "+findTotalCount(numbers));
		int[] numbers2 = { 5,6,6,6,12,1,1,0,0};
		System.out.println("Count of adjacent occurrence: "+findTotalCount(numbers2));
	}
} 
 
