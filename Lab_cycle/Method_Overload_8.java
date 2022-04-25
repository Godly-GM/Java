import java.util.*;

public class Method_Overload_8 {
	
	void area(int a) {
		
		System.out.println("Area of the square is "+ a*a +" sq units");
	}
	
    void area(float l,float w) {
		System.out.println("Area of the square is "+ l*w +" sq units");
	}
    
    void area(double x) {
    	double z = 3.14 * x * x;
		System.out.println("Area of the Circle is "+ z +" sq units");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int ch;
		Boolean res=true;
		Scanner sn = new Scanner(System.in);
		
		Method_Overload_8 obj = new Method_Overload_8();
		
		System.out.println("1.Area of Square");
		System.out.println("2.Area Rectangle");
		System.out.println("3.Area of Circle");
		System.out.println("4.Exit");
		
		while (res){
			System.out.print("\nENTER YOUR CHOICE: ");
			ch=sn.nextInt();
			
			switch (ch) {
				
				case 1:
					System.out.print("Enter Size of Sqaure: ");
					int s1 = sn.nextInt();
					obj.area(s1);
					break; 
				
				case 2:
					System.out.print("\nEnter Length and width of Rectangle: ");
					float le = sn.nextInt();
					float wi = sn.nextInt();
					obj.area(le,wi);
					break; 
					
				case 3:
					System.out.print("\nEnter Radius of Circle: ");
					double c = sn.nextInt();
					obj.area(c);
					break; 
					
				case 4:
					res=false;
					break;
			}
		}			
	}

}
