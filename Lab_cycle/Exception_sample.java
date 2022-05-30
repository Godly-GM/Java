
public class Exception_sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=5,c=5;
		
		int x,y;
		
		try {
			x = a/(b-c);
			System.out.println("x = " + x);
		}
		catch (Exception e) {
			System.out.println("Exception arises" + e);
		}
		finally {
			y = a/(b+c);
			System.out.println("y = " + y);
		}
	}

}
