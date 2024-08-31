/*reate a new class Restaurant in the Java project SwiftFood with the instance variables and methods mentioned below.

MethodC Description

displayRestaurantDetails() 

Display the details of the restaurant (the values of the member variables)

Create an object of the Restaurant class, initialize the instance variables, and invoke the displayRestaurantDetails() method in the main() method of the Tester class. */

public class Restaurent{
    String restaurentName;
    long restaurentContact;
    String restaurentAddress;
    float rating;
    
    Restaurent(String restaurentName, long restaurentContact, String restaurentAddress, float rating){
        this.restaurentName = restaurentName;
        this.restaurentContact = restaurentContact;
        this.restaurentAddress = restaurentAddress;
        this.rating = rating;
    }
    
     public static void main (String [] args){
        Restaurent restaurent = new Restaurent("Mcdonalds", 9985036447L, "Newyork", 4.1F);
        restaurent.displayRestaurentDetails();

    }
    public void displayRestaurentDetails(){
        System.out.println("Restaurent Details");
        System.out.println("******************");
        System.out.println("RestaurentName: " +restaurentName);
        System.out.println("RestaurentContact: " +restaurentContact);
        System.out.println("RestaurentAddress: " +restaurentAddress);
        System.out.println("RestaurentRating: " +rating);
        
    }
}

 
