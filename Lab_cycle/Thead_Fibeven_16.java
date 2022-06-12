import java.util.*;
import java.lang.Thread.*;

class Fibi implements Runnable{

	public void run() {
		int a=0,b=1,c=0;
		System.out.println("Fib thread:"+a);
		System.out.println("Fib thread:"+b);
		for(int i=1;i<=7;i++) {
			c=a+b;
			System.out.println("Fib thread:"+c);
			a=b;
			b=c;
			

		}
	}
	
}
class Even implements Runnable{
	public void run() {
		int a=2,b=10;
		for(int i=a;i<=b;i+=2) {
			System.out.println("Even number:"+i);

		}
	}
}
public class FibEvn {

	public static void main(String[] args) {
		
		Fibi obf=new Fibi();
		Even obe=new Even();

		Thread t1=new Thread(obf);
		Thread t2=new Thread(obe);
		
		t1.start();
		t2.start();
	}

}
