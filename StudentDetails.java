/**
*   If more than one class definition is written in a program then always we have to save the program by using that class name where 
*   main method is present .So, in the below program we have to save the file with StudentDetails.java . When we compile this program 
*   that no of dot class file (two in the below example i.e Student.class , StudentDetails.class) depending on number of class definition 
*   present in the program. 
*
**/
class Student{

	int roll;
	String name;
}

class StudentDetails{

	public static void main(String[] args){

		Student s = new Student();
 		   s.roll=1;
		   s.name="Sid";
		System.out.println("Roll = "+roll);
		System.out.println("Name = "+name);
	}
}
