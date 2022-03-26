class Const
{
	int l,b;
	Const(int l)
	{
		this.l = l;
		System.out.println("area = " +l*l);
	}

	Const(int l,int b)
	{
		this.l = l;
		this.b = b;
		System.out.println("area = " +l*b);
	}
}

class Overload_constructor{

	public static void main(String args[])
	{	
		Const r = new Const(4);	
		Const r2 = new Const(5,7);	
	}

}