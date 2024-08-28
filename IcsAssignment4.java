//Implement a program to find out whether a number is a seed of another number.

//A number X is said to be a seed of number Y if multiplying X by its every digit equates to Y.

//E.g.: 123 is a seed of 738 as 123*1*2*3 = 738

 class Tester {
	public static void main(String[] args) {
	    int X = 123;
	    int Y = 738;  //input
	    if(isSeed(X,Y)){
	        System.out.println(X + "is a seed of " + Y);
	    }
	    else{
	        System.out.println(X + "is not seed of" + Y);
	        
	    }
	}
	public static boolean isSeed(int X, int Y){
	    int product = X;
	    int temp = X;
	    while(temp > 0){
	        int digit = temp % 10;
	        product *= digit;
	        temp /= 10;
	    }
	    return product == Y;
	}
	
}
