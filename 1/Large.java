class Large
{
	public static void main(String args[])
	{
		int a=6;
		int b=9;
		int c=16;
		if(a>b && a>c){
			System.out.println("The largest number is:"+a);
		}
		else if(b>a && b>c){
			System.out.println("The largest number is:"+b);
		}
		else if(c>a && c>b){
			System.out.println("The largest number is:"+c);
		}
	}
}