import java.util.Scanner;

class Student {

	private int roll;
	private String name;

	static private String college;

	void input(){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Roll Number:-");
		roll=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter The Name:-");
		name=sc.nextLine();
		
		}
	static void display(){
	
		college="VSSUT";
		System.out.println("College = "+college);
		
		}

	void output(){

		System.out.println("Roll= "+roll);
		System.out.println("Name="+name);
		
		}

}

class StudentDetails{

	public static void main(String [] args){

		Student s1 = new Student();
		Student s2 = new Student();
	
		s1.input();
		s2.input();

		s1.output();
		s2.output();
		Student.display();
	}
}
