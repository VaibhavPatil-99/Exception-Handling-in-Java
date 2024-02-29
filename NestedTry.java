package exception_handling;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			try {
				int a[]= {1,2,3,4};
				System.out.println(a[5]);
			}
			catch(ArrayIndexOutOfBoundsException a)
			{
				System.out.println(a);
			}
			
			System.out.println(10/2);
		}
		catch(ArithmeticException b)
		{
			System.out.println(b);
		}
	}

}
