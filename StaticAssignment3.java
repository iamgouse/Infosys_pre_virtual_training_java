/*Static - Assignment 3

Problem Statement
Rainbow Cinemas is an upcoming multiplex in the city with a seating capacity of 400 people. They need an application to be developed for booking of tickets.

You need to implement a Booking class based on the class diagram and description given below.



Method Description

Booking(String customerEmail, int seatsRequired)

Initialize the customerEmail and seatsRequired instance variable appropriately with the values passed to the constructor.

If the required number of seats are available, set the value of isBooked to true and update the value of seatsAvailable accordingly. The total number of seats available is 400 and should be initialized in static block.

If the required number of seats are not available, set the value of isBooked to false.

Implement the appropriate getter and setter methods.

Test the functionalities using the provided Tester class. Create two or more Booking objects and validate that the values of the member variables are proper.*/

class Booking{
	private String customerEmail;
	private int seatsRequired;
	private boolean isBooked;
	private static int seatsAvailable;
	
	static {
		seatsAvailable = 400;
	}
	Booking(String customerEmail, int seatsRequired){
		this.customerEmail = customerEmail;
		this.seatsRequired = seatsRequired;
		if(seatsAvailable >= seatsRequired) {
			isBooked = true;
			seatsAvailable = seatsAvailable-seatsRequired;
		}
		else {
			isBooked = false;
		}
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public int getSeatsRequired() {
		return seatsRequired;
	}
	public void setSeatsRequired(int seatsRequired) {
		this.seatsRequired = seatsRequired;
	}
	public boolean isBooked() {
		return isBooked;
	}
	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}
	public static int getSeatsAvailable() {
		return seatsAvailable;
	}
	public static void setSeatsAvailable(int seatsAvailable) {
		Booking.seatsAvailable = seatsAvailable;
	}
}
	public class Tester {
	    public static void main(String[] args) {
	        Booking booking1 = new Booking("jack@email.com", 100);
	        Booking booking2 = new Booking("jill@email.com", 350);

	        //Create more objects and add them to the bookings array for testing your code
	        
	        Booking[] bookings = { booking1, booking2 };
	              
	        for (Booking booking : bookings) {
	            if (booking.isBooked()) {
	                System.out.println(booking.getSeatsRequired()+" seats successfully booked for "+booking.getCustomerEmail());
	            }
	            else {
	                System.out.println("Sorry "+booking.getCustomerEmail()+", required number of seats are not available!");
	                System.out.println("Seats available: "+Booking.getSeatsAvailable());
	            }
	         }
	    }
	}

