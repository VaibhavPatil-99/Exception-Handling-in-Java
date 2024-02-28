package exception_handling;

public class BasicException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exception
		//int a=10;
		//int b=0;
		//int c=a/b;
		//System.out.println(c);
		
		// Exception handling above exception
		
		int a=10;
		int b=0;
		int c;
		
		try {
			c = a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("cannot divide by 0");
		}
	}

}
