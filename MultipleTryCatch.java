package exception_handling;

public class MultipleTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a=10; 
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException a)
		{
			System.out.println(a);
		}
		try {
			int a[]= {1,2,3,4};
			System.out.println(a[5]);
		}	
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
	}

}
