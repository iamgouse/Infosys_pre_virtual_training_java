/*Implement a class Rectangle with the instance variables and methods mentioned below. 



Method Description

calculateArea()

Calculate and return the area of the rectangle. The area should be rounded off to two decimal digits.

calculatePerimeter()

Calculate and return the perimeter of the rectangle. The perimeter should be rounded off to two decimal digits.

Test the functionalities using the provided Tester class.*/
class Rectangle {
    //Implement your code here   
    float length;
    float width;
    public double calculateArea(){
      return Math.round((length * width)*100) / 100;
    }
    public double calculatePerimeter(){
        return Math.round(2*(length + width)*100) / 100;
    }
}

class Tester {

	public static void main(String args[]) {
		
		Rectangle rectangle=new Rectangle();
		rectangle.length = 20;
		rectangle.width = 40;
	
		//Assign values to the member variables of Rectangle class

		//Invoke the methods of the Rectangle class to calculate the area and perimeter
		
		//Display the area and perimeter using the lines given below
		System.out.println("Area of the rectangle is " +rectangle.calculateArea());
		System.out.println("Perimeter of the rectangle is " +rectangle.calculatePerimeter());
	}

}

 
