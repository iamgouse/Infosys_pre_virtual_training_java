/*Array - Assignment 4
Problem Statement
The results of a mid-term assessment have been declared. The marks scored by a student in different subjects are stored in an array.

You need to find the corresponding grade for each subject by implementing the class Student based on the class diagram and description given below.



Method description

Student(int[] marks)

Initialize the value of the instance variable marks with the value passed to the constructor.

Initialize the grade with the same size as marks array.

findGrade()

Find the corresponding grade for each marks present in the marks array based on the below details and update the grade array.                                                                                                                                              

Assumption: The minimum marks can be 0 and maximum marks can be 100.

Test the functionalities using the main method of the Tester class.*/

class Student{ 
    private int[] marks;
    private char[] grade;
    public Student(int[] marks){
        this.marks = marks;
        this.grade = new char[marks.length];
    }
    public void findGrade(){
        for(int i = 0; i < marks.length; i++){
            if (marks[i] >= 92){
                grade[i] = 'E';
            }else if(marks[i] >= 85){
                grade[i] = 'A';
            }else if(marks[i] >= 70){
                grade[i] = 'B';
            }else if (marks[i] >= 65){
                grade[i] = 'C';
            }else{
                grade[i] = 'D';
            }
    }
}
public int[] getMarks(){
    return marks;
}
public void setMarks(int[] marks){
    this.marks = marks;
}
public char[] getGrade(){
    return grade;
}
public void setGrade(char[] Grade){
    this.grade = grade;
}
}
class Tester{
	public static void main(String[] args) {
		int[] marks = { 79, 87, 97, 65, 78, 99, 66 }; 
		Student student = new Student(marks);
		student.findGrade();
        System.out.println("Grades corresponding to the marks are : ");
		char[] grades = student.getGrade();
		for (int index = 0; index < grades.length; index++) {
			System.out.print(grades[index] + " ");
		}
	}
}

 




 
