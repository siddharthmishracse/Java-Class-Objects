interface One{
    abstract void display();
}

class Two implements One {
	public void display(){
		System.out.println("Hello");
	}	
	void output(){
		display();
		System.out.print("Friend");
	}
}

class Test{
	public static void main(String[] args){
		Two obj = new Two();
		obj.output();

	}
}
