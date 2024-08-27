class Tester {
	public static void main(String[] args) {
		// Implement your code here 
		int oneDollarNotes = 2;
		    int fiveDollarNotes = 4;
		    int purchaseAmount = 21;
		    int fiveDollarNotesNeeded = Math.min(fiveDollarNotes, purchaseAmount / 5);
   int remainingAmount = purchaseAmount - (fiveDollarNotesNeeded * 5);
if (remainingAmount <= oneDollarNotes){
		    System.out.println("$1 notes needed = " + remainingAmount);
		    System.out.println("$5 notes needed = " + fiveDollarNotesNeeded);
		}
		else{
		    System.out.println("-1");
		}
	}
}

