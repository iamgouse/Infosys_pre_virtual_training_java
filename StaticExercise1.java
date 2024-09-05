/*Static - Exercise 1
Problem Statement
Implement the class Bill based on the class diagram and description given below.



Method Description

Bill(String paymentMode)

Initialize the paymentMode instance variable with the value passed to the parameter. 

Generate the billId using counter. The value of billId should start from 'B9001' and the numerical part should be incremented by 1 for the subsequent values. Initialize the counter in static block.

Implement the appropriate getter and setter methods.

 

Test the functionalities using the provided Tester class. Create two or more Bill objects and validate that the billId is being generated properly.*/

class Bill{
    //Implement your code here
    private String paymentMode;
    private static int counter;
    private String billId;
    static{
        counter = 9001;
    }
    public Bill(String paymentMode){
        this.paymentMode = paymentMode;
        this.billId = "B" + counter;
        counter++;
    }
    public String getBillId(){
        return billId;
    }
    public void setBillId(String BillId){
        this.billId = billId;
    }
    public static int getCounter(){
        return counter;
    }
    public String getPaymentMode(){
        return paymentMode;
    }
    public void setPaymentMode(String PaymentMode){
        this.paymentMode = paymentMode;
    }
}

class Tester {
    public static void main(String[] args) {

        Bill bill1 = new Bill("DebitCard");
        Bill bill2 = new Bill("PayPal");
        
        //Create more objects and add them to the bills array for testing your code
              
        Bill[] bills = { bill1, bill2 };
              
        for (Bill bill : bills) {
            System.out.println("Bill Details");
            System.out.println("Bill Id: " + bill.getBillId());
            System.out.println("Payment method: " + bill.getPaymentMode());
            System.out.println();
       }
    }
}

