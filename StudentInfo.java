//Method Overloading in Inheritance.
import java.util.Scanner;

class Address{

	private String city;
	private String state;

	void input(String city , String state){

		this.city=city;
		this.state=state;

	}

	void output(){
	
		System.out.println("City = "+city);
		System.out.println("State = "+state);
	}
}

class Student extends Address{

	private int roll;
	private String name;

	void input(String name, int roll){

		this.name=name;
		this.roll=roll;
	}

	void output(){

		System.out.println("Name = "+name);
		System.out.println("Roll = "+roll);
		super.output();
	}
}

class StudentInfo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		Student s = new Student();

		String name=sc.nextLine();
		int roll=sc.nextInt();
		sc.nextLine();
		s.input(name,roll);
		String city=sc.nextLine();
		String state=sc.nextLine();
		s.input(city,state);
		s.output();
	}
}
