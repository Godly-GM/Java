class Vowel
{
	public static void main(String args[])
	{
		char ch='b';
		int flag=0;
		String str="aeiou";
		for(int i=0;i<5;i++)
		{
			char v=str.charAt(i);
			if(ch==v)
				{
					System.out.println("The alphabet is vowel");
					flag=1;
				}
		}
		if(flag==0)
		{
			System.out.println("The alphabet is consonant");
		}
	}
}