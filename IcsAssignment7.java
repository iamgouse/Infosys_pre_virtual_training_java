//Implement a program to find and display the least common multiple (LCM) of two whole numbers.
//Least Common Multiple (LCM) of two numbers, num1 and num2 is the smallest positive number that is divisible by both num1 and num2.

 class Tester {
	public static void main(String[] args) {
	    int num1 = 5;
	    int num2 = 10;
	    int LCM = (num1 < num2) ? num1 : num2;
	    
	    while(true){
	    if (LCM % num1 == 0 && LCM % num2 == 0){
	        System.out.println("The LCM of " + num1 + " and " + num2 + " is " + LCM);
	        break;
	    }
	    else
	    ++LCM;
	    }
	}
}

