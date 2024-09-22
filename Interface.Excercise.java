interface Tax{
	double calculateTax(double price);
}

class PurchaseDetails implements Tax{
    //Implement your code here
	private String customerId;
	private String paymentType;
	private double taxPercentage;
	public PurchaseDetails(String customerId, String paymentType) {
		super();
		this.customerId = customerId;
		this.paymentType = paymentType;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	
	public double calculateTax(double price) {
		if (this.paymentType.equals("Debit Card")) this.taxPercentage=2;
	    else if (this.paymentType.equals("Credit Card")) this.taxPercentage=3;
	    else this.taxPercentage=4;
		return price+(price*this.taxPercentage/100);
}
}

class Seller implements Tax{
	private String location;
	private double taxPercentage;
	public Seller(String location) {
		super();
		this.location = location;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	public double calculateTax(double price) {
		if(this.location.equals("Canada")) this.taxPercentage=22;
		
		else if(this.location.equals("Middle east")) this.taxPercentage=15;
		
		else if (this.location.equals("Japan")) this.taxPercentage=12;
		
		else if (this.location.equals("Europe")) this.taxPercentage=25;
		
		return price+(price*this.taxPercentage/100);
		
	}
	
}

class Tester{
    public static void main(String args[]) {
		System.out.println("Purchase Details\n***************");
		PurchaseDetails purchaseDetails = new PurchaseDetails("P1001","Credit Card");
		System.out.println("Total purchase amount: " + Math.round(purchaseDetails.calculateTax(100)*100)/100.0);
		System.out.println("Tax percentage: "+purchaseDetails.getTaxPercentage());

        System.out.println("Seller Details\n***************");
		Seller seller = new Seller("Canada");
		System.out.println("Tax to be paid by the seller: " + Math.round(seller.calculateTax(100)*100)/100.0);
		System.out.println("Tax percentage: "+seller.getTaxPercentage());
		
		//Create more objects for testing your code
	}
}
