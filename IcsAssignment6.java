//Implement a program to check whether a given number is a lucky number.

//A lucky number is a number whose sum of squares of every even-positioned digit (starting from the second position) is a multiple of 9.

//E.g. - 1623 = 62+32 = 45 is a multiple of 9 and hence is a lucky number.

 class Tester {
	public static void main(String[] args) {
	    int number = 1623;
	    if (isLuckyNumber(number)){
	        System.out.println("The number" + number + "is a lucky number");
	    }
	    else{
	        System.out.println("The number" + number + "is not a lucky number");
	    }
	}
	public static boolean isLuckyNumber(int number){
	    String numberStr = Integer.toString(number);
	    int sum = 0;
	    for (int i = 1; i < numberStr.length(); i+=2){
	        int digit = Character.getNumericValue(numberStr.charAt(i));
	        sum += digit *digit;
	    }
	    return sum % 9 == 0;
	}
}
