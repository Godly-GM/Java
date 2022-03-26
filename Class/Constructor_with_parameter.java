class Rec
{
	int l,b;
	Rec(int l1,int b1)
	{
		l = l1;
		b = b1;
		System.out.print(l*b);
	}
}

class Constructor_with_parameter{

	public static void main(String args[])
	{	
		Rec r = new Rec(5,7);	
	}

}