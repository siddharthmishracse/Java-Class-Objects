class Exception{
	public static void main(String[] args){

		int a=0,b=0,r=0;
		try{
			a=Integer.parseInt(args[0]);
			System.out.println("First Number = "+a);
			b=Integer.parseInt(args[1]);
			System.out.println("Second Number = "+b);
			r=a/b;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Two Numbers From coammand line");
		}
		catch(ArithmeticException e){
			System.out.println("Division By Zero not Possible");
		}
		if(b!=0)
			System.out.println("Division = "+r);
	}
}