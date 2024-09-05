/*Array - Assignment 5
Problem Statement
Implement the method findNumbers accepting two numbers num1 and num2 based on the conditions given below:

Validate that num1 should be less than num2

If the validations are successful

populate all the 2 digit positive numbers between num1 and num2 into the provided numbers array if

sum of the digits of the number is a multiple of 3

number is a multiple of 5

Return the numbers array
Test the functionalities using the main method of the Tester class.*/

class Tester {

	public static int[] findNumbers(int num1, int num2) {
		int[] numbers = new int[6];
		int index = 0;
		if (num1 >= num2){
		    return numbers;
		}
		if (num1 < num2){
		for (int i = num1; i <= num2; i++){
		    if((i % 10 + i / 10) % 3 == 0 && i % 5 ==0){
		        numbers[index] = i;
		        index++;
		        if (index >= numbers.length) break;
		    }
		}
		}

		return numbers;
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;

		int[] numbers = findNumbers(num1, num2);
		if (numbers[0] == 0) {
			System.out.println("There is no such number!");
		} else {
			for (int index = 0; index <= numbers.length - 1; index++) {
				if (numbers[index] == 0) {
					break;
				}
				System.out.println(numbers[index]);
			}
		}

	}
}

 
