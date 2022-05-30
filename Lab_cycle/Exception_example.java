
class Exception_example {
	
public static void main(String args[]) {

		try {
		      int a[]={5,10};
		      int b=5;
		      int x=a[1]/(b-a[0]);
		      System.out.println("x="+x);
		
		}
		
		catch(ArithmeticException e) {
			
		       System.out.println("Divide by 0: " + e);
		} 
		
		catch(ArrayIndexOutOfBoundsException e){
			
		       System.out.println("Array index error: " + e);
		       
		}
		
		catch(ArrayStoreException e){
			
		       System.out.println("Wrong Data Type " + e);
		       
		}
		
		System.out.println("After try/catch blocks.");
	
	}
}