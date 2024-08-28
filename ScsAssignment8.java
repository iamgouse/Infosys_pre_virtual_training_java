class Tester {
	public static void main(String[] args) {
		int number = 15;
		
		if(number%3 == 0 && number%5 == 0){
		    System.out.println("Zoom");
		}
		else if(number % 3 == 0){
		    System.out.println("Zip");
		}
		else if(number%5 == 0){
		    System.out.println("Zap");
		}
		else{
		    System.out.print("Invalid");
		}
	}
}

