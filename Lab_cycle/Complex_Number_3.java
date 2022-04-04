import java.util.*;

public class Complex_Number_3 {
	
	double real,img;
	
	Complex_Number_3() {
	}
	
	Complex_Number_3(double r,double i) {
		this.real = r;
		this.img = i;
	}
	
	Complex_Number_3 sum(Complex_Number_3 c1,Complex_Number_3 c2) {
		Complex_Number_3 temp = new Complex_Number_3();
		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;
		return temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double r1,i1,r2,i2;
		
		System.out.println("First Complex Number: ");
		System.out.print("Enter real number: ");
		r1 = sc.nextDouble();
		System.out.print("Enter Imaginary number: ");
		i1 = sc.nextDouble();
		
		System.out.println("Second Complex Number: ");
		System.out.print("Enter real number: ");
		r2 = sc.nextDouble();
		System.out.print("Enter Imaginary number: ");
		i2 = sc.nextDouble();
		
		Complex_Number_3 obj = new Complex_Number_3(r1,i1);
		Complex_Number_3 obj_2 = new Complex_Number_3(r2,i2);
		
		Complex_Number_3 temp_1 = new Complex_Number_3();
		temp_1 = temp_1.sum(obj,obj_2);
		
		System.out.println("Sum is "+ temp_1.real + " + " + temp_1.img +"i ");
	}

}
