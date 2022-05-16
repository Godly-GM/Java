
import java.util.*;

interface prototype{
	void area();
	void perimeter();
}


//interface prototype_rectangle{
//	void area(int l,int b);
//	void perimeter(int l,int w);
//}

class Circle implements prototype{
	int r;
	
	public Circle(int r) {
		this.r = r;
	}

	public void area() {
		System.out.println(" ");
		System.out.println("Area of circle: "+(3.14*r*r));
	}

	public void perimeter() {
		System.out.println("Perimeter of circle: "+(2*3.14*r));
	}

	
}

class Rect implements prototype{
	int l,w;
	
	public Rect(int l,int w) {
		this.l = l;
		this.w = w;
	}
	
	public void perimeter() {
		int res = 2*(l+w);
		System.out.println("Perimeter of Rectangle: "+res);
	}

	public void area() {
		System.out.println("Area of Rectangle: "+(l*w));
	}
	
}


public class Interface_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Program 10: Interface");
		System.out.println(" ");
		
		
		Scanner sn = new Scanner(System.in);
		
		boolean res = true;
		int ch;
		int rad,l,w;
				
		System.out.println("1.Circle- Area and Perimeter");
		System.out.println("2.Rectangle- Area and Perimeter");
		System.out.println("3.Exit");
		
		while(res) {
			System.out.println(" ");
			System.out.print("Enter your choice: ");
			ch = sn.nextInt();
			
			switch (ch) {
			case 1: {
				System.out.print("Enter Radious of circle: ");
				rad = sn.nextInt();
				prototype c = new Circle(rad);
				c.area();
				c.perimeter();
				break;
			}
			
			case 2: {
				System.out.print("Enter length of rectangle: ");
				l = sn.nextInt();
				
				System.out.print("Enter width of rectangle: ");
				w = sn.nextInt();
				prototype r = new Rect(l,w);
				r.area();
				r.perimeter();
				break;
			}
			
			case 3: {
				res = false;
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		}
		
	}

}
