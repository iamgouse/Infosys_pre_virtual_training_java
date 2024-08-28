//Implement a program to find the number of rabbits and chickens in a farm. Given the number of heads and legs of the chickens and rabbits in a farm, identify and display the number of chickens and rabbits in the farm.

//If the given input cannot make a valid number of rabbits and chickens, then display an appropriate message.

 



class Tester {
	public static void main(String[] args) {		
		int legs = 500;   //Input
		int heads = 150;
		if (legs % 2 != 0 || legs < 2* heads || legs > 4 * heads){
		    System.out.println("The number of chickens and rabbits cannot be found");
		}
		else{
		    int rabbits = (legs - 2*heads)/2;
		    int chickens = heads - rabbits;
		    
		    if (chickens < 0 || rabbits < 0){
		        System.out.println("The number of chickens and rabbits cannnot be found");
		    }
		    else{
		        System.out.println("Chickens = " +chickens);
		        System.out.println("Rabbits = " +rabbits);
		    }
		}
	}
}
