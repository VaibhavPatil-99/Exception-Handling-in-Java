package exception_handling;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a=20;
			int b=10;
			int c=a/b;
			System.out.println(c);
			
			int x[]= {1,2,3,4};
			System.out.println(x[0]);
			
			String s = null;
			System.out.println(s.toUpperCase());
		}
		
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println(a);
		}
		catch(ArithmeticException b)
		{
			System.out.println(b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}


