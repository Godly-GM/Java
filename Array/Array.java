import java.util.Scanner;

class Array{

   public static void main(String args[]) 
   {

	int [] a= new int[10];
	int i;

	Scanner inp=new Scanner(System.in);
	System.out.println("Enter Values");
	for(i=0;i<a.length;i++)
	{
		a[i] = inp.nextInt();
	}

	System.out.println("Displaying value");
	for(i=0;i<a.length;i++)
	{
		System.out.print(" "+a[i]);
	}

  }

}