class Over
{
	int l,b;
	void area(int l)
	{
		this.l = l;
		System.out.println("area = " +l*l);
	}

	void area(int l,int b)
	{
		this.l = l;
		this.b = b;
		System.out.println("area = " +l*b);
	}
}

class Overload_method{

	public static void main(String args[])
	{	
		Over r = new Over();	
		r.area(5);
		r.area(10,4);
	}

}