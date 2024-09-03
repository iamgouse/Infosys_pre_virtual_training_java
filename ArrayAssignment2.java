/*Array - Assignment 2
Problem Statement
Find and return the average salary, number of salaries greater than the average salary and number of salaries lesser than the average salary from the salary array passed to the findDetails() method. Return a double array containing average salary in index position 0, number of salaries greater than the average salary in index position 1 and number of salaries lesser than the average salary in index position 2. Implement the logic inside findDetails() method.

Test the functionalities using the main method of the Tester class.*/

class Tester {
    
    public static double[] findDetails(double[] salary) {
 double sum = 0.0;
 int countGreater = 0;
 int countLesser = 0;
 int n = salary.length;
 for(double s : salary){
     sum += s;
 }
 double averageSalary = sum / n;
 for (double s : salary){
     if (s > averageSalary){
         countLesser++;
     }
 }
        return new double[]{averageSalary, countGreater, countLesser};
        }  
    public static void main(String[] args) {
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);
              
        System.out.println("Average salary: "+ details[0]);
        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
    }
}


 
