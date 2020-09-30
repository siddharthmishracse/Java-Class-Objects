/**
*	Method Overloading
*	
*/
import java.util.Scanner;

class Circle {

	private double radius;
	private double pi;
	private double area;

		void assign(){

			pi=3.14;
		}

		void assign(double radius){
		
			this.radius=radius;
		}

		private void calculate(){
	
			area=pi*radius*radius;
		}
		
		void output(){

			calculate();
			System.out.print("Area Of Circle:-"+area);
		}
}

class AreaOfCircle{

	public static void main(String [] args){
	
		Circle c = new Circle();
			double r;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The radius Of Circle:-");
		r=sc.nextDouble();
		c.assign();
		c.assign(r);
		c.output();
	}
}

		You Know what i am doing here.

