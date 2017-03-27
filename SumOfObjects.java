/**
*  Passing An Entire Object to a method
*/

import java.util.Scanner;

class One {

	private int a;
	private double b;
		
		void input(){
	
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter The Integer Value:-");
			a=sc.nextInt();
			System.out.print("Enter The Double Value :-");
			b=sc.nextDouble();
		}

		void output(){

			System.out.println("Integer value ="+a);
			System.out.println("Double value ="+b);

		}

		void calculate(One ob1,One ob2){

			a=ob1.a+ob2.a;
			b=ob1.b+ob2.b;
		}
}

class SumOfObjects{

	public static void main(String [] args){

		One obj1 = new One();
		One obj2 = new One();
		One obj3 = new One();
		
			System.out.println("Enter Values of First Object:-");
			obj1.input();
			System.out.println("Enter Values of Second Object:-");
			obj2.input();
			obj3.calculate(obj1,obj2);
			System.out.println(" Values of First Object:-");
			obj1.output();
			System.out.println(" Values of Second Object:-");
			obj2.output();
			System.out.println("Sum of Objects :-");
			obj3.output();
	}
}
