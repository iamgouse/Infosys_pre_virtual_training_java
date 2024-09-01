/*Implement the class MovieTicket with the instance variables and methods mentioned below.



Method Description

MovieTicket (int movieId, int noOfSeats)

Initialize the member variables movieId and noOfSeats appropriately with the values passed to the constructor.
calculateTotalAmount()

Calculate the total amount to be paid based on the costPerTicket and noOfSeats by applying a 2% tax on the total amount.

The costPerTicket for the movies are provided in the below table. Set the value of costPerTicket instance variable appropriately.

  

Note: Return the total amount calculated after rounding off using the Math.round(double a) method.     
Test the functionalities using the provided Tester class.                                                                                              

 

Sample Input and Output

Input



Output



Input



Output*/
class MovieTicket {
    //Implement your code here 
    private int movieId;
    private int noofSeatss;
    private double costPerTicket;
    
    public MovieTicket(int movieId, int noOfSeats){
        this.movieId = movieId;
        this.noOfSeats = noOfSeats;
        setCostPerTicket();
    }
    private void setCostPerTicket(){
        switch (this.movieId){
            case 111:
                this.costPerTicket = 7.0;
            break;
            case 112:
                this.costPerTicket = 8.0;
            break;
            case 113:
                this.costPerTicket = 8.5;
            default:
            this.costPerTicket = 0;
            break;
            
        }
    }
    public double calculateTotalAmount(){
        if (this.costPerTicket == 0) || this.noOfSeats <= 0){
            return 0;
        }
        double totalAmount = this.costPerTicket * this.noOfSeats;
        totalAmount += totalAmount * 0.02;
        return Math.round(totalAmount);
    }
    public int getMovieId(){
        return movieId;
    }
    public void setMovieId(int movieId){
        this.movieId = movieId;
        setcostPerTicket();
    }
    public int getNoOfSeats(){
        return noOfSeats;
    }
    public void setNoOfSeats(int noOfSeats){
        this.noOfSeats = noOfSeats;
    }
    public double getCostPerTicket(){
        return costPerTicket;
    }
    public void setCostPerTicket(double costPerTicket){
        this.costPerTicket = costPerTicket;
    }
}


class Tester {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket(112, 3);
        double amount = movieTicket.calculateTotalAmount();
        if (amount==0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + amount);
    }
}
