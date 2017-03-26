/**
*   Suppose there is a class called car. Maruti and Hyundai are the cars which inherits the  of properties of class car.But the problems lies there, 
*   that a car may or may not have same propeties or function. So, in that case we need to use abstarct class and abstract method to show different 
*   properties oer function  for different car.Example program given below. 
*
**/
abstract class One{

	abstract void display();
}

class Two extends One{

	void display(){

		System.out.println("Hello");
	}

	void show(){
	
		display();
		System.out.println("World");
	}
}

class Three extends One{

	void display(){

		System.out.println("Hi");
	}

	void output(){

		display();
		System.out.println("friend");
	}
}

class Four{

	public static void main(String[] args){

		Two obj1= new Two();
		Three obj2 = new Three();
		obj1.show();
		obj2.output();
	}
}
