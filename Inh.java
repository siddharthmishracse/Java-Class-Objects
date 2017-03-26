import java.util.Scanner;

class Address{

	private int pincode;

	void input(){
		
		Scanner sc = new Scanner(System.in);
	
		pincode=sc.nextInt();

	}

	void output(){

		System.out.print("Pincode="+pincode);

	}
}

class User extends Address{

	private int num;

	User(){
		
		num=20;
		super.input();

	}
	
	void output(){

		System.out.print("Number="+num);
		super.output();
	}
}

class Try{

	public static void main(String[] args){

		User u = new User();
		
		//u.input();
		u.output();
	}
}
