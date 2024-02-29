package exception_handling;

public class NestedcatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println("cant divide by 0");
			try {
				String a ="vaibhav";
				System.out.println(a.toUpperCase());
			}
			catch(NullPointerException n)
			{
				System.out.println("null cant convert ");
			}
		}
		System.out.println("End***");
	}

}
