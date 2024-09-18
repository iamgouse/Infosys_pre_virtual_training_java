/*Problem Statement
The Point class is used for representing a point with two coordinates.

Implement the class Point based on the class diagram and description given below.



 

Method Description

Point(double xCoordinate , double yCoordinate )

Initialize the instance variables xCoordinate and yCoordinate appropriately with the values passed to the constructor.
calculateDistance()

Calculate and return the distance of the point from the origin (0,0). The distance can be calculated using the formula given below. The distance should be rounded off to 2 decimal digits.
     distance=√((x2-x1)2+(y2-y1)2), where x1 and x2 are values of x-coordinates of two points and y1 and y2 are values of y-coordinates of two points

calculateDistance(Point point)

Calculate and return the distance of the point from the 'point' passed to the method. The distance should be rounded off to 2 decimal digits.
Hints

Use Math.sqrt(double d) method to calculate the square root

Use Math.round(double d) method to round off the values

Implement the getter and setter methods appropriately.

 

Test the functionalities using the provided Tester class. */
class Point {
    private double xCoordinate;
    private double yCoordinate;

    // Constructor
    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    // Getters and Setters
    public double getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    // Calculate distance from origin (0,0)
    public double calculateDistance() {
        // Fix: Correct formula for distance from origin
        double distance = Math.sqrt(Math.pow(getXCoordinate(), 2) + Math.pow(getYCoordinate(), 2));
        return Math.round(distance * 100.0) / 100.0; // Round to 2 decimal places
    }

    // Calculate distance from another point
    public double calculateDistance(Point point) {
        // Fix: Correct formula and use of point's coordinates
        double distance = Math.sqrt(Math.pow(point.getXCoordinate() - this.xCoordinate, 2)
                                 + Math.pow(point.getYCoordinate() - this.yCoordinate, 2));
        return Math.round(distance * 100.0) / 100.0; // Round to 2 decimal places
    }
}

class Tester {

    public static void main(String[] args) {
        // Test with two points
        Point point1 = new Point(3.5, 1.5);
        Point point2 = new Point(6, 4);

        System.out.println("Distance of point1 from origin is " + point1.calculateDistance());
        System.out.println("Distance of point2 from origin is " + point2.calculateDistance());
        System.out.println("Distance of point1 from point2 is " + point1.calculateDistance(point2));

        // You can create more objects for testing here if needed
    }
}
