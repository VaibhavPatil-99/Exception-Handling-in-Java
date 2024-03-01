package exception_handling;

public class NumberFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     // String str = "vaibhav";
		
		// int a = Integer.parseInt(str); // NumberFormatException occurs
		// System.out.println(a);
		
		// Handle above exception
		
		String str = "vaibhav";
		
		try {
		int a = Integer.parseInt(str);
		System.out.println(a);
		}
		catch(NumberFormatException e)
		{
			System.out.println("charcter string cant be converted to the integer string");
		}
		System.out.println("main method ended");
	}

}
