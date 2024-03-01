package exception_handling;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		try {
			System.out.println("hello");
			
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
			
			System.out.println("world");
		}
		catch(ArithmeticException a )
		{
			System.out.println(a);
		}
		finally
		{
			System.out.println("subscribe");
		}
		System.out.println("main method ended");
	}
}
