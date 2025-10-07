public class Loopy{
	public static void main(String[] args)
	{
		int x=1;
		System.out.println("This is Starting of loop");
		while(x<4){
			System.out.println("Inside loop");
			System.out.println("Value is : "+x);
			x=x+1;
		}
		System.out.println("Outside of Loop");
		System.out.println("Loop Ended Successfully");
	}
}