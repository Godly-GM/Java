class Consonant
{
	public static void main(String args[])
	{
		char con='w';
		int flag=0;
		char vowel[]={'a','e','i','o','u'};
		for(int i=0;i<5;i++)
		{
			if(vowel[i]==con)
			{
				System.out.println("Vowel");
				flag=1;
			}
		}
	if(flag==0)
	{
		System.out.println("Consonant");
	}
	}
}