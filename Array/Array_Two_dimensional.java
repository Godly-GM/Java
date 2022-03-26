import java.util.Scanner;

class Array_Two_dimensional{

   public static void main(String args[]) 
   {

	int [][] a= new int[2][3];
	int i,j;

	Scanner inp=new Scanner(System.in);
	System.out.println("Enter Values");
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a[0].length;j++)
		{
			a[i][j] = inp.nextInt();
		}	
	}

	System.out.println("\nDisplaying or Output Matrix is");
	for(i=0;i<a.length;i++)
	{	
		System.out.println();
		for(j=0;j<a[0].length;j++)
		{
			System.out.print(a[i][j]+" ");
		}
	}
  }

}