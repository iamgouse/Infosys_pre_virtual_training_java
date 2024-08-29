/*Problem Statement
Implement a program to display the below pattern.

*****

****

***

**

**/
class Tester {
	public static void main(String[] args) {
	    int n = 5;
	    for(int i=n; i<=n; i--){
	        for(int j=1; j<=i; j++){
	            System.out.print("*");
	        }
	        System.out.println();
	    }

	}
}

