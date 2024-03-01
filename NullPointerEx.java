package exception_handling;

public class NullPointerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Null pointer Exception
		// String str = null;
		// System.out.println(str.toUpperCase());
		
		// Handle above exception
		
		String str = null;
		
		try {
			System.out.println(str.toUpperCase());
		}
		catch(NullPointerException n)
		{
			System.out.println(n);
		}
	}

}
