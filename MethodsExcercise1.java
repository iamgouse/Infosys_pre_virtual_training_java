/*Implement a class Calculator with the method mentioned below. 
  
Method Description

findAverage()

Calculate the average of three numbers

Return the average rounded off to two decimal digits
​​​​

Test the functionalities using the provided Tester class. */

class Calculator {
    
public double findAverage(int number1, int number2, int number3){
    double sum = number1 + number2 + number3;
    double average = sum / 3.0;
    return Math.round(average * 100.0) / 100.0;
}
}
class Tester {

	public static void main(String args[]) {
		Calculator calculator = new Calculator();
	double average = calculator.findAverage(12,8,15);
		// Invoke the method findAverage of the Calculator class and display the average
		System.out.println("Average: " + average);
	}
}
