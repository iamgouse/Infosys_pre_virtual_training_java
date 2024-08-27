class Tester {
	public static void main(String[] args) {
		// Implement your code here 
		int accountNumber = '';
		int salary = '';
		int accountBalance = ''
		char loanType = '';
		int loanAmountExpected = '';
		int emisExpected = '';
		int eligibleLoanAmount, eligibleEmis;
		
		if (String.valueof(accountNumber).length != 4 || String.valueof(accountNumber).charAt(0) != '1'){
		    System.out.println("Error : Invalid account number");
		    return;
		}
		if (accountBalance < 1000){
		    System.out.println("Insufficiant balance");
		}
		else if (salary > 25000 && loanType == 'car'){
		    eligibleLoanAmount = 500000;
		    eligibleEmis = 36;
		}
		else if (salary > 50000 && loanType == 'house'){
		    eligibleLoanAmount = 500000;
		    eligibleEmis = 6000000;
		}
		else if (salary > 75000 && loanType == 'business'){
		    eligibleLoanAmount = 75000000;
		    eligibleEmis = 84;
		}
		System.out.println("eligibleLoanAmount: " +eligibleLoanAmount);
		System.out.print("eligibleEmis: " +eligibleEmis);
	}
}

