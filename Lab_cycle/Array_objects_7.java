import java.util.*;

class Employee_info {
	int eno;
	String ename;
	double salary;
	
	Employee_info(int eno,String ename,double salary) {
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}
	
	void display() {
		System.out.println("Emp_No: " + eno + ", Emp_Name: " + ename + " and Salary: " + salary);
	}
}

public class Array_objects_7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,flag = 0;
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Enter Number of employees: ");
		int n = sn.nextInt();
		
		Employee_info[] obj = new Employee_info[n];
		
		System.out.println("\nEnter Details of employees: ");
		
		for(i = 0 ; i < n; i++) {
			System.out.print("Enter employee ID: ");
			int eno = sn.nextInt();
			
			System.out.print("Enter employee Name: ");
			String ename = sn.next();
			
			System.out.print("Enter employee Salary: ");
			double salary = sn.nextDouble();
			
			obj[i] = new Employee_info(eno, ename, salary);
			
			System.out.println(" ");
		}
		
		System.out.println("\nDisplaying Details of employees: ");
		
		for(i = 0 ; i < n; i++) {
			
			obj[i].display();
		}
		
		System.out.print("\nEnter the Employee ID for details: ");
		int empno = sn.nextInt();
		
		for(i = 0 ; i < n; i++) {
			
			if(obj[i].eno == empno) {
				obj[i].display();
				flag = 1;
			}
		}
		
		if(flag == 0) {
			System.out.println("Employee doesn't exists....");
		}
		
		
		
		
	}

}
