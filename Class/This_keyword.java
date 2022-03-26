class Rec
{
	int l,b;
	Rec(int l,int b)
	{
		this.l = l;
		this.b = b;
		System.out.print(l*b);
	}
}

class This_keyword{

	public static void main(String args[])
	{	
		Rec r = new Rec(5,8);	
	}

}