import java.util.Scanner;

public class Nested_class_4 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		Cpu cpu1=new Cpu();
		Cpu.Processor intelI3 = cpu1.new Processor();
		Cpu.Ram DDR4 = new Cpu.Ram();
		
		System.out.println("Enter the price of CPU: ");
		double a=s.nextDouble();
		System.out.println("Enter no of cores: ");
		double b=s.nextDouble();
		System.out.println("Enter the manufacturer of processor: ");
		String m=s.next();
		System.out.println("Enter the memory of RAM: ");
		double d=s.nextDouble();
		System.out.println("Enter the manufacturer of ram: ");
		String n=s.next();
		
		cpu1.price=a;
		intelI3.cores=b;
		intelI3.manufacturer=m;
		DDR4.memory=d;
		DDR4.manufacturer=n;
		
		System.out.println();
		System.out.println("Price of the cpu: "+cpu1.price);
		System.out.println("No of core in processor: "+intelI3.cores);
		System.out.println("Name of the manufacturer: "+intelI3.manufacturer);
		System.out.println("Processor cache: "+intelI3.getCache());
		
		System.out.println("Memory capacity: "+DDR4.memory+" GB");
		System.out.println("Name of the manufacturer of ram: "+DDR4.manufacturer);
		System.out.println("Clock speed of ram: "+DDR4.getClockSpeed());
		
	}

}

class Cpu{
	double price;
	
	class Processor{
		double cores;
		String manufacturer;
		
		double getCache() {
			return 4.3;
		}
	}
	
	static class Ram{
		double memory;
		String manufacturer;
		
		double getClockSpeed() {
			return 5.5;
		}
	}
}