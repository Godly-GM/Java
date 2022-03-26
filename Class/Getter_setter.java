
class Gt_st
{
	private int a;
	private int b;
		
	void set(int a1,int b1)
	{
		a = a1;
		b = b1;
	}

	void get()
	{
		System.out.println("a is "+ a + " and b is "+b);
	}
}

class Getter_setter{

	public static void main(String args[])
	{
		Gt_st obj = new Gt_st();
		
		obj.set(4,7);
		obj.get();

	}

}