package exception_handling;

public class Many_Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,3,4,5};
		
		try {
			System.out.println("hello...");
			System.out.println("6");
			System.out.println(a[2]/0);
			System.out.println(a[9]);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("bye bye");
		
	}

}
