import java.util.Scanner;

import Graphics_pack.Circle;
import Graphics_pack.Rectangle;
import Graphics_pack.Square;
import Graphics_pack.Triangle;

public class Graphics_packages_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program 11: Packages");
		System.out.println(" ");
		
		
		Scanner sn = new Scanner(System.in);
		
		boolean res = true;
		int ch;
		int rad,l,w,b,h;
		
		System.out.println("1.Circle- Area");
		System.out.println("2.Rectangle- Area");
		System.out.println("4.Square- Area");
		System.out.println("5.Triangle- Area");
		System.out.println("6.Exit");
		
		while(res) {
			System.out.println(" ");
			System.out.print("Enter your choice: ");
			System.out.println(" ");
			ch = sn.nextInt();
			
			switch (ch) {
			case 1: {
				System.out.print("Enter Radious of circle: ");
				rad = sn.nextInt();
				Circle c = new Circle(rad);
				break;
			}
			
			case 2: {
				System.out.print("Enter length of rectangle: ");
				l = sn.nextInt();
				System.out.print("Enter width of rectangle: ");
				w = sn.nextInt();
				
				Rectangle r =  new Rectangle(l, w);
				break;
			}
			
			case 3: {
				System.out.print("Enter side of Square: ");
				l = sn.nextInt();
				
				Square r =  new Square(l);
				break;
			}
			
			case 4: {
				System.out.print("Enter base of triangle: ");
				b = sn.nextInt();
				System.out.print("Enter height of triangle: ");
				h = sn.nextInt();
				
				Triangle r =  new Triangle(b, h);
				break;
			}
			
			case 6: {
				res = false;
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		}

	}

}
