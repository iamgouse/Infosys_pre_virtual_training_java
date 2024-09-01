Problem Statement
/*Consider the class Employee given below for representing employees of an organization. It has 5 different instance variables and a method to calculate the total salary based on the jobLevel.

Salary is calculated in the calculateSalary() method.

Make necessary changes to the class by making all the attributes private and by adding necessary accessor and mutator methods thus bringing in Encapsulation.*/


class Employee {

	private String employeeId;
	private String employeeName;
    private	int salary;
    private	int bonus;
    private	int jobLevel;
    
    public String getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getBonus(){
        return bonus;
    }
    public void setBonus(int bonus){
        this.bonus = bonus;
    }
    public int getJobLevel(){
        return jobLevel;
    }
    public void setJobLevel(int jobLevel){
        this.jobLevel = jobLevel;
    }

	public void calculateSalary() {
		if (this.jobLevel >= 4) {
			this.setBonus(100);
		} else {
			this.setBonus(50);
		}
		this.salary += this.bonus;
	}
}

class Tester {

	public static void main(String args[]) {

		Employee employee = new Employee();
		employee.setEmployeeId("C101");
		employee.setEmployeeName("Steve");
		employee.setSalary(650);
		employee.setJobLevel(4);

employee.calculateSalary();

		System.out.println("Employee Details");
		System.out.println("Employee Id: " + employee.getEmployeeId());
		System.out.println("Employee Name: " + employee.getEmployeeName());
		System.out.println("Salary: " + employee.getSalary());

	}
}
