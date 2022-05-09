import java.util.*;


class Person{
	String name,gender,address;
	int age;
	
	Person(String name,String gender,String address,int age){
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.age = age;
	}
	
	void display() {
		System.out.println(" ");
		System.out.println("Name: " + name + ", Gender: " + gender + ", Address: " + address + " and Age " + age);
	}
}

class Employee extends Person{
	String Company_name, Qualification, Salary;
	int Empid;
	
	Employee(String name,String gender,String address,int age,
			String Company_name,String Qualification,String Salary,int Empid){
		
		super(name,gender,address,age);
		
		this.Company_name = Company_name;
		this.Qualification = Qualification;
		this.Salary = Salary;
		this.Empid = Empid;
	}
	
	void display() {
		
		super.display();
		
		System.out.println(" ");
		System.out.println("Company_name: " + Company_name + ", Qualification: " + Qualification + ", Salary: " + Salary + " and Empid " + Empid);
	
	}
}

class Teacher extends Employee{
	String Subject, Department;
	int Teacherid;
	
	Teacher(String name,String gender,String address,int age,String Company_name,
			String Qualification,String Salary,int Empid,String Subject,String Department,int Teacherid){
		
		super(name,gender,address,age,Company_name,Qualification,Salary,Empid);
		
		this.Subject = Subject;
		this.Department = Department;
		this.Teacherid = Teacherid;

	}
	
	void display() {
		super.display();
		System.out.println(" ");
		System.out.println("Subject: " + Subject + ", Department: " + Department + " and Teacherid: " + Teacherid);
		
		
	}
}



public class Inheritance_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Enter Number of teachers: ");
		int n = sn.nextInt();
		
		Teacher[] obj = new Teacher[n];
		
		for(int i = 0; i < n ; i++) {
						
			System.out.print("Enter Person Name: ");
			String name = sn.next();
			
			System.out.print("Enter Person Age: ");
			int age = sn.nextInt();
			
			System.out.print("Enter Person Gender: ");
			String Gender = sn.next();
			
			System.out.print("Enter Person Address: ");
			String Address = sn.next();
			
			
			System.out.print("Enter Employee Company_name: ");
			String Company_name = sn.next();
			
			System.out.print("Enter Employee Empid: ");
			int Empid = sn.nextInt();
			
			System.out.print("Enter Employee Qualification: ");
			String Qualification = sn.next();
			
			System.out.print("Enter Employee Salary : ");
			String Salary  = sn.next();
			
			
			System.out.print("Enter TeacherID: ");
			int tid = sn.nextInt();
			
			System.out.print("Enter Teacher Subject: ");
			String Subject = sn.next();
			
			System.out.print("Enter Teacher Department : ");
			String Department  = sn.next();
			
			
			obj[i] = new Teacher(name, Gender, Address,age,Company_name,Qualification,Salary,Empid,Subject,Department,tid);
			
			System.out.println(" ");
		}
		
		for(int i = 0; i < n ; i++) {
			obj[i].display();
			
		}
		
	}

}
