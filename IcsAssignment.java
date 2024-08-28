//Implement a program to find out whether a number is divisible by the sum of its digits. 

//Display appropriate messages.

 
class Tester {
	public static void main(String[] args) {
		int number = 123; //input
		int sumOfDigits = 0;
		int temp = number;
		while(temp>0){
		    sumOfDigits += temp % 10;
		    temp /= 10;
		}
		if (number % sumOfDigits == 0){
		    System.out.println(number + "is divisible by sum of digits");
		}
		else{
		    System.out.println(number + "is not divisible by sum of digits");
		}
	}
}
